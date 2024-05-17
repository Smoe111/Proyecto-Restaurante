package Controller;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import model.*;

public class PaginaPrincipalController implements Initializable {


    private  String[] estado= {"Disponible", "Ocupado", "Descanso"};

    public PaginaPrincipalController() {

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
                empleado.setEstado(new Disponible());
                break;
            case "Ocupado":
                empleado.setEstado(new Ocupado());
                break;
            case  "Descanso":
                empleado.setEstado(new Descanso());
                break;
            default:
                break;

        }
        actualizarEstado();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        BoxStateEmpleado.getItems().addAll(estado);
        BoxStateEmpleado.setOnAction(this:: getState);
        actualizarEstado();
    }

    public  void getState(ActionEvent event ){
        String estado= BoxStateEmpleado.getValue();
        LbEstado.setText(estado);
    }
    private  void actualizarEstado(){
        LbEstado.setText(empleado.getEstado().toString());
    }
}













