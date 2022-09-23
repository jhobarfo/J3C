package com.J3C.CompanyJ3C.repositories;

import com.J3C.CompanyJ3C.Entidades.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;


@Repository
public interface EmpleadoRepositorio extends JpaRepository<Empleado, Long> {
    public Empleado findByCorreoEmpleado(String correoEmpleado);
}
