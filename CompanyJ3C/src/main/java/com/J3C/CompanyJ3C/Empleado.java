package com.J3C.CompanyJ3C;

public class Empleado extends Empresa
{
    String nombreEmpleado,correoEmpleado,rolEmpleado;

    public Empleado(String nombreEmpresa, String direccionEmpresa, int telefonoEmpresa, int nitEmpresa, String nombreEmpleado, String correoEmpleado, String rolEmpleado) {
        super(nombreEmpresa, direccionEmpresa, telefonoEmpresa, nitEmpresa);
        this.nombreEmpleado=nombreEmpleado;
        this.correoEmpleado=correoEmpleado;
        this.rolEmpleado=rolEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }
}
