package com.J3C.CompanyJ3C.services;

import com.J3C.CompanyJ3C.Entidades.Perfil;
import com.J3C.CompanyJ3C.repositories.PerfilRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfilServicio {
    @Autowired
    PerfilRepositorio perfilRepositorio;

    public List<Perfil> getPerfilList(){return this.perfilRepositorio.findAll();}
}
