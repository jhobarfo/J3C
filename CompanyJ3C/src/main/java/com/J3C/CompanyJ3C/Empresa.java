package com.J3C.CompanyJ3C;

public class Empresa
{
    String nombre_Empresa,direccion;
    int telefono,nit;

    public Empresa (String nombre_Empresa,String direccion, int telefono, int nit)
    {
        this.nombre_Empresa=nombre_Empresa;
        this.direccion=direccion;
        this.telefono=telefono;
        this.nit=nit;
    }

    public String getNombre_Empresa() {
        return nombre_Empresa;
    }

    public void setNombre_Empresa(String nombre_Empresa) {
        this.nombre_Empresa = nombre_Empresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }
}
