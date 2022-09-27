package com.J3C.CompanyJ3C.enums;

import com.J3C.CompanyJ3C.Entidades.Empleado;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Table(name = "rolEmpleado")
public enum EmpleadoEnum {
    ROLE_Administrador,
    ROLE_Operario

}
