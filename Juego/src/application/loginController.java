package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class loginController {

    @FXML
    private void handleAtrasLogin(ActionEvent event) {
        try {
            // Cargar el archivo FXML para la ventana de inicio
            Parent inicioView = FXMLLoader.load(getClass().getResource("VentanaInicio.fxml"));
            
            // Obtener el escenario (Stage) actual a través del evento y cambiar el contenido
            Scene currentScene = ((Node) event.getSource()).getScene();
            currentScene.setRoot(inicioView);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    private TextField campoUsuario;
    @FXML
    private PasswordField campoContraseña;
    @FXML
    private void handleLogin() {
        String usuario = campoUsuario.getText();
        String contraseña = campoContraseña.getText();

        if (AlmacenamientoUsuarios.validarLogin(usuario, contraseña)) {
            // Lógica para permitir el acceso
            System.out.println("Acceso permitido");
            cambiarAVentanaJuegoAhorcado();
        } else {
            // Lógica para mostrar un mensaje de error
            System.out.println("Acceso denegado");
        }
    }
    private void cambiarAVentanaJuegoAhorcado() {
        try {
            // Cargar el archivo FXML para la ventana de juego
            FXMLLoader loader = new FXMLLoader(getClass().getResource("VentanaJuegoAhorcado.fxml"));
            Parent juegoView = loader.load();

            // Obtener el escenario (Stage) actual y cambiar la escena
            Stage stage = (Stage) campoUsuario.getScene().getWindow();
            Scene juegoScene = new Scene(juegoView);
            stage.setScene(juegoScene);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
