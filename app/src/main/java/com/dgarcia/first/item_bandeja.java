package com.dgarcia.first;

import java.io.Serializable;

public class item_bandeja implements Serializable {

    private String nombre;
    private String publicacion;

    public item_bandeja(String nombre, String publicacion) {
        this.nombre = nombre;
        this.publicacion = publicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }


}

