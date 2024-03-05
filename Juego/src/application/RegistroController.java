package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegistroController {

    @FXML
    private void handleAtrasRegistro(ActionEvent event) {
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
    private TextField RegistroNombre;
    @FXML
    private TextField RegistroApellido;
    @FXML
    private TextField RegistroTelefono;
    @FXML
    private TextField RegistroUsuario;
    @FXML
    private TextField RegistroContraseña;

    @FXML
    private void handleGuardar() {
        // Aquí es donde manejas el dato ingresado. Por ejemplo, imprimir en consola.
        String nombre = RegistroNombre.getText();
        String apellido = RegistroApellido.getText();
        String telefono = RegistroTelefono.getText();
        String usuario = RegistroUsuario.getText();
        String contraseña = RegistroContraseña.getText();
        AlmacenamientoUsuarios.registrarUsuario(usuario, contraseña);
     // Verificar si algún campo está vacío
        if (nombre.isEmpty() || apellido.isEmpty() || telefono.isEmpty() || usuario.isEmpty() || contraseña.isEmpty()) {
            // Mostrar mensaje de error o tomar alguna acción apropiada
            System.out.println("Error: Todos los campos deben ser completados.");
            return; // No continuar con el proceso de guardado
        }

        // Si todos los campos están completos, proceder con el proceso de guardado
        // Aquí puedes agregar la lógica para almacenar los datos
        AlmacenamientoUsuarios.registrarUsuario(usuario, contraseña);
        
        System.out.println("Nombre registrado: " + nombre);
        System.out.println("Apellido registrado: " + apellido);
        System.out.println("Telefono registrado: " + telefono);
        System.out.println("Usuario registrado: " + usuario);
        System.out.println("Contraseña registrado: " + contraseña);
        
        // Aquí puedes agregar lógica para guardar este dato donde necesites
    }
    
}