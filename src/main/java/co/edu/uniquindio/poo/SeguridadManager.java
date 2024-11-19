package co.edu.uniquindio.poo;

import java.util.HashMap;
import java.util.Map;

public class SeguridadManager {
    private Map<String, String> credenciales;  // clave: usuario, valor: contraseña
    private Map<String, String> preguntasSeguridad;

    public SeguridadManager() {
        this.credenciales = new HashMap<>();
        this.preguntasSeguridad = new HashMap<>();
    }

    public void registrarCredenciales(String usuario, String contrasena, String pregunta, String respuesta) {
        credenciales.put(usuario, contrasena);
        preguntasSeguridad.put(usuario, respuesta);
    }

    public boolean autenticar(String usuario, String contrasena) throws AutenticacionException {
        if (!credenciales.containsKey(usuario) || !credenciales.get(usuario).equals(contrasena)) {
            throw new AutenticacionException("Error: Usuario o contraseña incorrectos.");
        }
        return true;
    }

    public boolean recuperarContrasena(String usuario, String respuesta) throws AutenticacionException {
        if (!preguntasSeguridad.containsKey(usuario) || !preguntasSeguridad.get(usuario).equalsIgnoreCase(respuesta)) {
            throw new AutenticacionException("Respuesta incorrecta.");
        }
        return true;
    }
    
}
