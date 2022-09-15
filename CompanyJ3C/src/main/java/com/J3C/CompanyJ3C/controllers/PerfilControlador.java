package com.J3C.CompanyJ3C.controllers;

import com.J3C.CompanyJ3C.Entidades.Perfil;
import com.J3C.CompanyJ3C.services.PerfilServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PerfilControlador {
    @Autowired
    PerfilServicio perfilServicio;

    @GetMapping("/perfil")
    public List<Perfil> getperfilList(){

        return this.perfilServicio.getPerfilList();

    }
}
