package model;
import javafx.scene.control.Alert;

public class Ocupado implements  StateEmpleado{
    @Override
    public void realizarAccion() {
    }

    @Override
    public String getEstado() {
        return "Ocupado";
    }
}
