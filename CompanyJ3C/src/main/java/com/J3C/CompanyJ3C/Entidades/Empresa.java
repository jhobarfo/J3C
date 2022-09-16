package com.J3C.CompanyJ3C.Entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Empresa")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "nombreEmpresa")
    private String nombreEmpresa;
    @Column(name = "nitEmpresa")
    private String nitEmpresa;
    @Column(name = "telefonoEmpresa")
    private String telefonoEmpresa;
    @Column(name = "direccionEmpresa")
    private String direccionEmpresa;

    @JsonIgnore
    @OneToMany(mappedBy = "empresa")
    private List<Empleado> empleados;
    @JsonIgnore
    @OneToMany(mappedBy = "empresaM")
    private List<MovimientoDinero> MovimientoDinero;

}
