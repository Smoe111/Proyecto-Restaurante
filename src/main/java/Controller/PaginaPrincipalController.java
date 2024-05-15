package Controller;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import model.*;

public class PaginaPrincipalController {

    private BuilderEmpleado empleadoB;
    private  Empleado empleado;

    public PaginaPrincipalController() {
        this.empleadoB= new BuilderEmpleado();
        this.empleado= new Empleado();
    }
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ChoiceBox<String> BoxStateEmpleado;

    @FXML
    private Label LbEstado;

    private  void actualizarEstado(){
        LbEstado.setText(empleado.getEstado().toString());
    }

    @FXML
    void cambiarEstado(ActionEvent event)  {
        String opcion= BoxStateEmpleado.getValue();
        switch (opcion){
            case "Disponible":
                empleadoB.setEstado(new Disponible());
                break;
            case "Ocupado":
                empleadoB.setEstado(new Ocupado());
                break;
            case  "Descanso":
                empleadoB.setEstado(new Descanso());
                break;
            default:
                break;

        }
        actualizarEstado();

    }
}













