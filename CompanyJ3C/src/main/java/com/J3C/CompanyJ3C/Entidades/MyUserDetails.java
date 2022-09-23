package com.J3C.CompanyJ3C.Entidades;

import com.J3C.CompanyJ3C.enums.EmpleadoEnum;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MyUserDetails implements UserDetails {

    private String password;
    private String userName;
    private List<GrantedAuthority> authorities;

    public MyUserDetails (Empleado empleado)
    {
        this.userName=empleado.getCorreoEmpleado();
        this.password=empleado.getClaveEmpleado();
        this.authorities=new ArrayList<>();
        String rol = String.valueOf(empleado.getRolEmpleado());
        this.authorities.add(new SimpleGrantedAuthority(rol));

    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
