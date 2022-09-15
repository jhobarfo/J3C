package com.J3C.CompanyJ3C.Entidades;

import javax.persistence.*;
import java.util.List;

@Entity
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombreEmpresa;
    private String nitEmpresa;
    private String telefonoEmpresa;
    private String direccionEmpresa;
    @OneToMany(mappedBy = "empresa")
    private List<Empleado> empleadoList;

}
