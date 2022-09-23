package com.J3C.CompanyJ3C.controllers;

import com.J3C.CompanyJ3C.Entidades.Empleado;
import com.J3C.CompanyJ3C.services.EmpleadoServicio;
import com.J3C.CompanyJ3C.services.Respuesta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class EmpleadoControlador {

    @Autowired
    EmpleadoServicio empleadoServicio;
    @GetMapping("/empleado")
    public List<Empleado> getEmpleadoList(){

        return this.empleadoServicio.getEmpleadoList();

    }
    @PostMapping("/empleado")
    public Empleado crearEmpleado(@RequestBody Empleado empleado){

        return this.empleadoServicio.crearEmpleado(empleado);

    }
    /*@GetMapping("/empleado/{id}")
    public Empleado getEmpleadoId(@PathVariable Long id){

        return this.empleadoServicio.getEmpleadoId(id);

    }*/
    @GetMapping("/empleado/{id}")
    public Empleado getEmpleado(@PathVariable String id){

        return this.empleadoServicio.getEmpleado(id);

    }

    @DeleteMapping("/empleado/{id}")
    public Respuesta eliminarEmpleado(@PathVariable Long id){
        return this.empleadoServicio.deleteEmpleadoId(id);
    }

    @PutMapping("/empleado")
    public Respuesta updateEmpleado(@RequestBody Empleado empleado){
        return this.empleadoServicio.updateEmpleado(empleado);
    }
    @PatchMapping("/empleado")
    public Respuesta updateEmpresa (@RequestBody Empleado empleado){
        try {
            return this.empleadoServicio.updateEmpleadoPatch(empleado);
        } catch (Exception e) {

            Respuesta respuesta = new Respuesta();
            respuesta.setCodigo(200);
            respuesta.setMensaje("Empleado No actualizada");
            return respuesta;
        }
    }
}
