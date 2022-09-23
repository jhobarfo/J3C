package com.J3C.CompanyJ3C.seguridad;

import com.J3C.CompanyJ3C.services.MyUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class seguridadconfig extends WebSecurityConfigurerAdapter {

    @Autowired
    UserDetailsService userDetailsService;
    @Autowired
    DatosGoogle datosGoogle;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.userDetailsService((userDetailsService));
    }

    @Bean
    public PasswordEncoder getPasswordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
        .antMatchers("/enterprises").hasRole("Administrador")
        .antMatchers("/enterprises").hasAnyRole("Operario","Administrador")
        .antMatchers("/").permitAll()
        .antMatchers("/login*").permitAll()
        .and()
        .formLogin().loginPage("/login")
        .usernameParameter("correoEmpleado")
        .passwordParameter("claveEmpleado")
        .defaultSuccessUrl("/welcome")

        .and()
        .oauth2Login()
        .loginPage("/login")
        .successHandler(datosGoogle);
    }
}
