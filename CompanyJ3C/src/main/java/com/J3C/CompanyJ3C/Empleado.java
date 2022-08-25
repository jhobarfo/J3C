package com.J3C.CompanyJ3C;

public class Empleado extends Empresa
{
    String nombre_empleado,correo_empleado,rol_empleado;

    public Empleado(String nombre_Empresa, String direccion, int telefono, int nit,String nombre_empleado, String correo_empleado, String rol_empleado)
    {
        super(nombre_Empresa, direccion, telefono, nit);
        this.correo_empleado=correo_empleado;
        this.nombre_empleado=nombre_empleado;
        this.correo_empleado=correo_empleado;
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public String getCorreo_empleado() {
        return correo_empleado;
    }

    public void setCorreo_empleado(String correo_empleado) {
        this.correo_empleado = correo_empleado;
    }

    public String getRol_empleado() {
        return rol_empleado;
    }

    public void setRol_empleado(String rol_empleado) {
        this.rol_empleado = rol_empleado;
    }
}
