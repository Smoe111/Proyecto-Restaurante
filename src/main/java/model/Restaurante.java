package model;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private String nombre;
    private List<Registrarse> registros;

   public Restaurante() {
       registros= new ArrayList<>();
   }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public List<Registrarse> getRegristro() {
        return registros;
    }
    public void setRegistro(){
        this.registros= registros;
    }

    public void agregarRegistro(Registrarse registro){
        registros.add( registro);
    }



}
