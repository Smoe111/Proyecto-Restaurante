package Controller;

import model.Registrarse;
import model.Restaurante;

public class SingletonRegistro {

    private static SingletonRegistro instance = null;
    private Restaurante restaurante;

    private SingletonRegistro() {
        restaurante = new Restaurante();
    }

    public static SingletonRegistro getInstance() {
        if (instance == null) {
            instance = new SingletonRegistro();
        }
        return instance;
    }

    public void agregarRegistro(Registrarse registro){
        restaurante.agregarRegistro(registro);
    }
}

