package com.J3C.CompanyJ3C.services;

import com.J3C.CompanyJ3C.Entidades.Empleado;
import com.J3C.CompanyJ3C.Entidades.MyUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {
    @Autowired
    EmpleadoServicio empleadoServicio;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println(username);
        Empleado empleado =null;
        try {
            empleado = empleadoServicio.getEmpleado(username);
            System.out.println(username);
        } catch (Exception e){
            e.printStackTrace();
            throw new UsernameNotFoundException(e.getMessage());
        }

        return new MyUserDetails(empleado);
    }
}
