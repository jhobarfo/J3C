package com.J3C.CompanyJ3C.seguridad;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
@EnableWebSecurity
public class seguridadconfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/enterprises").hasRole("Administrador")
                .antMatchers("/enterprises").hasAnyRole("Operario","Administrador")
                .antMatchers("/").permitAll()
                .antMatchers("/login*").permitAll()
                .and()
                .formLogin().loginPage("/login");
    }
}
