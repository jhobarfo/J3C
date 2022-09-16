package com.J3C.CompanyJ3C.services;

import com.J3C.CompanyJ3C.Entidades.Empresa;
import com.J3C.CompanyJ3C.repositories.EmpresaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaServicio {
    @Autowired
    EmpresaRepositorio empresaRepositorio;
    public Empresa crearEmpresa(Empresa empresa){return this.empresaRepositorio.save(empresa);}

    public List<Empresa> getEmpresaList(){return this.empresaRepositorio.findAll();}

    public Empresa getEmpresaId(Long id) throws Exception {
        Optional<Empresa> empresa=this.empresaRepositorio.findById(id);
        if (empresa.isPresent())
        {
            return empresa.get();
        }
        else
        {
            throw new Exception("Usuario No Existe");
        }
    }
    public Respuesta deleteEmpresaId(Long id){
        this.empresaRepositorio.deleteById(id);
        Respuesta respuesta = new Respuesta();
        respuesta.setCodigo(200);
        respuesta.setMensaje("Empresa eliminada satisfactoriamente");
        return respuesta;
    }

    public Respuesta updateEmpresa(Empresa empresa) throws Exception {
        try
        {
            Empresa empresa1=getEmpresaId(empresa.getId());

            if (empresa.getDireccionEmpresa()!=null){
                empresa1.setDireccionEmpresa(empresa.getDireccionEmpresa());
            }
            if (empresa.getNitEmpresa()!=null){
                empresa1.setNitEmpresa(empresa.getNitEmpresa());
            }
            if (empresa.getNombreEmpresa()!=null){
                empresa1.setNombreEmpresa(empresa.getNombreEmpresa());
            }
            if (empresa.getTelefonoEmpresa()!=null){
                empresa1.setTelefonoEmpresa(empresa.getDireccionEmpresa());
            }
            this.empresaRepositorio.save(empresa1);
            Respuesta respuesta = new Respuesta();
            respuesta.setCodigo(200);
            respuesta.setMensaje("Empresa actualizada satisfactoriamente");
            return respuesta;


        } catch (Exception e)
        {
            throw new Exception("Empresa no se actualizó porque no existe");
        }
    }

    public Empresa getEmpresaByMovimientoId(Long id){
        return empresaRepositorio.findBymovimientoDinerosId(id);
    }

}
