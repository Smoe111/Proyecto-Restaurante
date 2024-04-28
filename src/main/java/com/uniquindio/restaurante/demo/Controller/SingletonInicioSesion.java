package com.uniquindio.restaurante.demo.Controller;

import com.uniquindio.restaurante.demo.IniciarSesion;
import com.uniquindio.restaurante.demo.Restaurante;

public class SingletonInicioSesion {

    private static SingletonInicioSesion instance = null;
    private Restaurante restaurante;

    private SingletonInicioSesion() {
        restaurante= new Restaurante();
    }

    public  static SingletonInicioSesion getInstance() {
        if (instance == null) {
            instance = new SingletonInicioSesion();
        }
        return  instance;
    }

    public void agregarInicioSesion(IniciarSesion sesion) {
        restaurante.agregarIniciarSesion(sesion);
    }
}
