package com.uniquindio.restaurante.demo;

public class IniciarSesion {

    String usuario;
    String contraseña;

    public IniciarSesion( String u, String c ) {
        this.usuario = usuario;
        this.contraseña= contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
