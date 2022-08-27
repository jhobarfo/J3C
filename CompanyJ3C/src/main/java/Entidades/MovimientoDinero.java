package Entidades;

import javax.persistence.*;

@Entity
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String concepto;
    private double cantidad;
    @ManyToOne
    @JoinColumn(name = "empleado_id")
    private Empleado empleado;

    public MovimientoDinero(Long id, String concepto, double cantidad, Empleado empleado) {
        this.id = id;
        this.concepto = concepto;
        this.cantidad = cantidad;
        this.empleado = empleado;
    }
}
