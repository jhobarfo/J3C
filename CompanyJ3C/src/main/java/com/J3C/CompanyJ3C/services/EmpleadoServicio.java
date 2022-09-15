package com.J3C.CompanyJ3C.services;

import com.J3C.CompanyJ3C.Entidades.Empleado;
import com.J3C.CompanyJ3C.repositories.EmpleadoRepositorio;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoServicio {
    @Autowired
    private EmpleadoRepositorio empleadoRepositorio;

    public Empleado crearEmpleado(Empleado empleado){
        return this.empleadoRepositorio.save(empleado);
    }
    public List<Empleado> getEmpleadoList(){
        return this.empleadoRepositorio.findAll();
    }

    public Empleado getEmpleadoId(Long id){
        Optional<Empleado> empleado=this.empleadoRepositorio.findById(id);
        if (empleado.isPresent())
        {
            return empleado.get();
        }
        else
        {
            return null;
        }
    }

    public Respuesta deleteEmpleadoId(Long id){
        this.empleadoRepositorio.deleteById(id);
        Respuesta respuesta=new Respuesta();
        respuesta.setCodigo(200);
        respuesta.setMensaje("Empleado eliminado satisfactoriamente");
        return respuesta;
    }


    public Respuesta updateEmpleado(Empleado empleado){
        Respuesta respuesta = new Respuesta();
        if (empleado.getId()==0){

            respuesta.setCodigo(500);
            respuesta.setMensaje("Id empleado incorrecto");
            return respuesta;
        }
        Empleado empleadoEncontrado=getEmpleadoId(empleado.getId());
        if (empleado.getId()==null){
            respuesta.setCodigo(500);
            respuesta.setMensaje("Id empleado no existe");
            return respuesta;
        }
        empleadoEncontrado.setNombreEmpleado(empleado.getNombreEmpleado());
        empleadoEncontrado.setCorreoEmpleado(empleado.getCorreoEmpleado());
        this.empleadoRepositorio.save(empleadoEncontrado);
        respuesta.setCodigo(200);
        respuesta.setMensaje("Empleado actualizado correctamente");
        return respuesta;
    }

    public Respuesta updateEmpleadoPatch(Empleado empleado) throws Exception {
        try
        {
            Empleado empleado1=getEmpleadoId(empleado.getId());

            if (empleado.getRolEmpleado()!=null){
                empleado1.setRolEmpleado(empleado.getRolEmpleado());
            }
            if (empleado.getCorreoEmpleado()!=null){
                empleado1.setCorreoEmpleado(empleado.getCorreoEmpleado());
            }
            if (empleado.getNombreEmpleado()!=null){
                empleado1.setNombreEmpleado(empleado.getNombreEmpleado());
            }
            this.empleadoRepositorio.save(empleado1);
            Respuesta respuesta = new Respuesta();
            respuesta.setCodigo(200);
            respuesta.setMensaje("Empleado actualizada satisfactoriamente");
            return respuesta;


        } catch (Exception e)
        {
            throw new Exception("Empleado no se actualizó porque no existe");
        }
    }

}
