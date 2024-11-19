package co.edu.uniquindio.poo;

public class Autenticador {

    // Método que simula la autenticación de un usuario.
    public void autenticar(String usuario, String contrasena) throws AutenticacionException {
        // Si las credenciales son incorrectas, se lanza la excepción
        if (!"usuarioCorrecto".equals(usuario) || !"contraseñaCorrecta".equals(contrasena)) {
            throw new AutenticacionException("Usuario o contraseña incorrectos.");
        }
        // Si las credenciales son correctas, se puede realizar alguna acción (por ejemplo, loguear al usuario)
    }
}

