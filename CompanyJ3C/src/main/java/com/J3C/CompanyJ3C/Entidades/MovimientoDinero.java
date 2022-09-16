package com.J3C.CompanyJ3C.Entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "MovimientoDinero")
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "concepto")
    private String concepto;
    @Column(name = "cantidad")
    private double cantidad;

    @ManyToOne
    private Empleado empleadoM;
    @ManyToOne
    private Empresa empresaM;
}
