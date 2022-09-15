package com.J3C.CompanyJ3C.controllers;

import com.J3C.CompanyJ3C.Entidades.Empresa;
import com.J3C.CompanyJ3C.services.EmpresaServicio;
import com.J3C.CompanyJ3C.services.Respuesta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpresaControlador {

    @Autowired
    EmpresaServicio empresaServicio;
    @GetMapping("/enterprises")
    public List<Empresa> getEmpresaList(){

        return this.empresaServicio.getEmpresaList();

    }
    @PostMapping("/enterprises")
    public Empresa crearEmpresa(@RequestBody Empresa empresa){

        return this.empresaServicio.crearEmpresa(empresa);

    }
    @GetMapping("/enterprises/{id}")
    public Empresa getEmpresaId (@PathVariable Long id) throws Exception {
        return this.empresaServicio.getEmpresaId(id);
    }
    @DeleteMapping("/enterprises/{id}")
    public Respuesta eliminarEmpresa(@PathVariable Long id){

        return this.empresaServicio.deleteEmpresaId(id);
    }

    @PatchMapping("/enterprises")
    public Respuesta updateEmpresa (@RequestBody Empresa empresa){
        try {
            return this.empresaServicio.updateEmpresa(empresa);
        } catch (Exception e) {

            Respuesta respuesta = new Respuesta();
            respuesta.setCodigo(200);
            respuesta.setMensaje("Empresa No actualizada");
            return respuesta;
        }
    }


}
