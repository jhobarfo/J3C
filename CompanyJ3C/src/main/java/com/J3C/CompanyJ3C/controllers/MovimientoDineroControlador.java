package com.J3C.CompanyJ3C.controllers;

import com.J3C.CompanyJ3C.Entidades.Empleado;
import com.J3C.CompanyJ3C.Entidades.MovimientoDinero;
import com.J3C.CompanyJ3C.services.MovimientoDineroServicio;
import com.J3C.CompanyJ3C.services.Respuesta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovimientoDineroControlador {
    @Autowired
    MovimientoDineroServicio movimientoDineroServicio;

    @GetMapping("/movimiento")
    public List<MovimientoDinero> getMovimientoList(){

        return this.movimientoDineroServicio.getMovimientoList();

    }
    @PostMapping("/movimiento")
    public MovimientoDinero crearMovimiento(@RequestBody MovimientoDinero movimientoDinero){

        return this.movimientoDineroServicio.crearMovimiento(movimientoDinero);

    }
    @GetMapping("/movimiento/{id}")
    public MovimientoDinero getMovimientoId(@PathVariable Long id) throws Exception {

        return this.movimientoDineroServicio.getMovimientoId(id);

    }
    @DeleteMapping("/movimiento/{id}")
    public Respuesta eliminarMovimiento(@PathVariable Long id){
        return this.movimientoDineroServicio.deleteMovimientoId(id);
    }


    @PatchMapping("/movimiento")
    public Respuesta updateMovimiento (@RequestBody MovimientoDinero movimientoDinero){
        try {
            return this.movimientoDineroServicio.updateMovimiento(movimientoDinero);
        } catch (Exception e) {

            Respuesta respuesta = new Respuesta();
            respuesta.setCodigo(200);
            respuesta.setMensaje("Movimiento No actualizado");
            return respuesta;
        }
    }
}
