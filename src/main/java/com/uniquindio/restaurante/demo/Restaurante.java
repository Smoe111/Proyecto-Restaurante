package com.uniquindio.restaurante.demo;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private String nombre;
    private List<IniciarSesion> iniciarSesion;

    public Restaurante(String nombre) {
        this.nombre = nombre;
        iniciarSesion = new ArrayList<IniciarSesion>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public List<IniciarSesion> getIniciarSesion() {
        return iniciarSesion;
    }
    public void setIniciarSesion(){
        this.iniciarSesion= iniciarSesion;
    }

    public void agregarIniciarSesion(IniciarSesion sesion){
        iniciarSesion.add( sesion);
    }



}
