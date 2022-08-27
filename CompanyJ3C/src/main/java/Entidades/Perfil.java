package Entidades;

import java.util.Date;

public class Perfil {

    private String id;
    private String image;
    private String phone;
    private Date fechaCreacion;
    private Date fechaModificacion;

    public Perfil(String id, String image, String phone, Date fechaCreacion, Date fechaModificacion) {
        this.id = id;
        this.image = image;
        this.phone = phone;
        this.fechaCreacion = new Date();
        this.fechaModificacion = new Date();
    }

    public String getId() {
        return id;
    }

    public String getImage() {
        return image;
    }

    public String getPhone() {
        return phone;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
}
