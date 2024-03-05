package application;

import java.util.HashMap;
import java.util.Map;

public class AlmacenamientoUsuarios {
    private static final Map<String, String> usuarios = new HashMap<>();

    public static void registrarUsuario(String usuario, String contraseña) {
        usuarios.put(usuario, contraseña);
    }

    public static boolean validarLogin(String usuario, String contraseña) {
        return contraseña.equals(usuarios.get(usuario));
    }
}