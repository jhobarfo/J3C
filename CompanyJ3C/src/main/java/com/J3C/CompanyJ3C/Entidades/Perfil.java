package com.J3C.CompanyJ3C.Entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "perfil")
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "imagen")
    private String imagen;
    @Column(name = "telefono")
    private String telefono;


    @OneToOne(cascade = CascadeType.ALL)
    private Empleado empleado;

}
