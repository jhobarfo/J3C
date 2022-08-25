package com.J3C.CompanyJ3C;

public class Empresa
{
    String nombreEmpresa,direccionEmpresa;
    int telefonoEmpresa,nitEmpresa;

    public Empresa (String nombreEmpresa,String direccionEmpresa, int telefonoEmpresa, int nitEmpresa)
    {
        this.nombreEmpresa=nombreEmpresa;
        this.direccionEmpresa=direccionEmpresa;
        this.telefonoEmpresa=telefonoEmpresa;
        this.nitEmpresa=nitEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public int getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(int telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public int getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(int nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }
}
