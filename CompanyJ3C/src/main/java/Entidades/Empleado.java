package Entidades;


import javax.persistence.*;
import java.util.List;

@Entity
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombreEmpleado;
    private String correoEmpleado;
    private Enum_RolName rol;
    @OneToMany(mappedBy = "empleado")
    private List<MovimientoDinero> movimientoDineroList;

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;

}
