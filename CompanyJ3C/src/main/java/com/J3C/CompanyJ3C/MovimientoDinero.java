package com.J3C.CompanyJ3C;

public class MovimientoDinero extends Empleado
{
    double montoMovimiento;
    String conceptoMovimiento;

    public MovimientoDinero(String nombreEmpresa, String direccionEmpresa, int telefonoEmpresa, int nitEmpresa, String nombreEmpleado, String correoEmpleado, String rolEmpleado) {
        super(nombreEmpresa, direccionEmpresa, telefonoEmpresa, nitEmpresa, nombreEmpleado, correoEmpleado, rolEmpleado);
    }


    public double crearMontos(double montoMovimiento)
    {
        return montoMovimiento;
    }



    public double getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(double montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }
}
