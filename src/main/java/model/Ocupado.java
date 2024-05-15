package model;
import javafx.scene.control.Alert;

public class Ocupado implements  StateEmpleado{

    private void mostrarAlerta(String mensaje){
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();

    }
    @Override
    public String realizarAccion() {
       return  "No se puede realizar el pedido";
    }
}
