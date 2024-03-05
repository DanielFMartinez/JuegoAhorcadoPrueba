package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class InicioController {

    // Método para manejar el evento del botón de registro
    @FXML
    private void handleAbrirRegistro(ActionEvent event) {
        try {
            // Cargar el nuevo contenido FXML
            Parent registroView = FXMLLoader.load(getClass().getResource("VentanaRegistro.fxml"));
            
            // Obtener el escenario (Stage) actual a través del evento
            Scene currentScene = ((Node) event.getSource()).getScene();
            currentScene.setRoot(registroView);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Método para manejar el evento del botón de login
    @FXML
    private void handleAbrirLogin(ActionEvent event) {
        try {
            // Cargar el nuevo contenido FXML
            Parent loginView = FXMLLoader.load(getClass().getResource("VentanaLogin.fxml"));
            
            // Obtener el escenario (Stage) actual a través del evento
            Scene currentScene = ((Node) event.getSource()).getScene();
            currentScene.setRoot(loginView);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

