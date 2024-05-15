package Controller;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import model.BuilderCliente;
import model.BuilderEmpleado;
import model.Empleado;
import model.RolEmpleado;

public class PaginaPrincipalController {

    private BuilderEmpleado empleado;

    public PaginaPrincipalController() {
        this.empleado= new BuilderEmpleado();
    }
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ChoiceBox<String> BoxStateEmpleado;

    @FXML
    private Label LbEstado;

    @FXML
    void cambiarEstado(ActionEvent event)  {
        String opcion= BoxStateEmpleado.getValue();
        switch (opcion){
            case "Disponible":
                empleado.se


        }

    }
}













