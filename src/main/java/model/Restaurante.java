package model;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private String nombre;
    private List<Registrarse> registros;
    private List<Pedido> pedidos;
    StateRestaurante estadoActual;

   public Restaurante() {
       registros= new ArrayList<>();
       estadoActual= new AbiertoState();
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

    public void setEstadoActual(StateRestaurante state) {
       estadoActual= state;
    }

    public void realizarAccion (){
       estadoActual.realizarAccion();
    }



}
