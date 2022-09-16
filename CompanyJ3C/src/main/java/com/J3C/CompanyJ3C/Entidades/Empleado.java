package com.J3C.CompanyJ3C.Entidades;


import com.J3C.CompanyJ3C.enums.EmpleadoEnum;
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
@Table(name = "empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "nombreEmpleado")
    private String nombreEmpleado;
    @Column(name="correoEmpleado")
    private String correoEmpleado;
    @Enumerated(EnumType.STRING)
    @Column(name = "rolEmpleado")
    private EmpleadoEnum rolEmpleado;

    @ManyToOne
    private Empresa empresa;

    @JsonIgnore
    @OneToOne(mappedBy = "empleado")
    private Perfil perfil;

    @JsonIgnore
    @OneToMany(mappedBy = "empleadoM")
    private List<MovimientoDinero> movimientoDineros;

}
