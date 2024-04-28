package com.uniquindio.restaurante.demo;

public class IniciarSesion {

    String usuario;
    String clave;

    public IniciarSesion( String u, String c ) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
