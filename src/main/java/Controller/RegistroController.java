package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.Registrarse;

public class RegistroController {

    private SingletonRegistro singleton;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnGuardar;

    @FXML
    private Button btnRegresar;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtClave;

    @FXML
    private TextField txtDocumento;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtUsuario;

    @FXML
    void switchInicioSesion(ActionEvent event) {

    }
    @FXML
    public  void agregarRegistro(ActionEvent event){
        Registrarse registro = new Registrarse();
        registro.setNombre(txtNombre.getText());
        registro.setClave(txtClave.getText());
        registro.setApellido(txtApellido.getText());
        registro.setDocumento(txtDocumento.getText());
        registro.setUsuario(txtUsuario.getText());
        singleton.agregarRegistro(registro);
    }

}



