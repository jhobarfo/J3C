package com.J3C.CompanyJ3C.services;

import com.J3C.CompanyJ3C.Entidades.Empresa;
import com.J3C.CompanyJ3C.Entidades.MovimientoDinero;
import com.J3C.CompanyJ3C.repositories.MovimientoDineroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class MovimientoDineroServicio {
    @Autowired
    MovimientoDineroRepositorio movimientoDineroRepositorio;

    public MovimientoDinero crearMovimiento(MovimientoDinero movimientoDinero){return this.movimientoDineroRepositorio.save(movimientoDinero);}

    public List<MovimientoDinero> getMovimientoList(){return this.movimientoDineroRepositorio.findAll();}

    public MovimientoDinero getMovimientoId(Long id) throws Exception {
        Optional<MovimientoDinero> movimientoDinero=this.movimientoDineroRepositorio.findById(id);
        if (movimientoDinero.isPresent())
        {
            return movimientoDinero.get();
        }
        else
        {
            throw new Exception("Movimiento No Existe");
        }
    }
    public Respuesta deleteMovimientoId(Long id){
        this.movimientoDineroRepositorio.deleteById(id);
        Respuesta respuesta = new Respuesta();
        respuesta.setCodigo(200);
        respuesta.setMensaje("Movimiento eliminado satisfactoriamente");
        return respuesta;
    }

    public Respuesta updateMovimiento(MovimientoDinero movimientoDinero) throws Exception {
        try
        {
            MovimientoDinero movimientoDinero1=getMovimientoId(movimientoDinero.getId());

            if (movimientoDinero.getCantidad()!=0){
                movimientoDinero1.setCantidad(movimientoDinero.getCantidad());
            }
            if (movimientoDinero.getConcepto()!=null){
                movimientoDinero1.setConcepto(movimientoDinero.getConcepto());
            }
            if (movimientoDinero.getEmpleadoM()!=null){
                movimientoDinero1.setEmpleadoM(movimientoDinero.getEmpleadoM());
            }
            if (movimientoDinero.getEmpresaM()!=null){
                movimientoDinero1.setEmpresaM(movimientoDinero.getEmpresaM());
            }
            this.movimientoDineroRepositorio.save(movimientoDinero1);
            Respuesta respuesta = new Respuesta();
            respuesta.setCodigo(200);
            respuesta.setMensaje("Movimiento actualizado satisfactoriamente");
            return respuesta;


        } catch (Exception e)
        {
            throw new Exception("Movimiento no se actualizó porque no existe");
        }
    }

    public MovimientoDinero getMovimientosByEmpresaId(Long id){
        return movimientoDineroRepositorio.findByempresaMId(id);
    }
}
