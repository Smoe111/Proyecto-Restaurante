package Controller;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.IOException;
import javafx.fxml.Initializable;


public class IniciarSesionController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnIngresar;

    @FXML
    private PasswordField txtClave;

    @FXML
    private TextField txtUsuario;

    @FXML
    private Button btnRegistrarse;

    @FXML
    private ImageView imgLogo;

    @FXML
    void switchRegistrarse(ActionEvent event) throws  IOException{

    }

    @FXML
    void buscarUsuario(ActionEvent event) {

    }


}
