package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AutenticadorTest {

    @Test
    public void testAutenticacionFallida() {
        Autenticador autenticador = new Autenticador();

        // Verifica que se lanza la excepción cuando el usuario o la contraseña son incorrectos
        assertThrows(AutenticacionException.class, () -> {
            autenticador.autenticar("usuarioIncorrecto", "contraseñaIncorrecta");
        }, "Se esperaba que se lanzara una AutenticacionException");
    }

    @Test
    public void testAutenticacionExitosa() {
        Autenticador autenticador = new Autenticador();

        // Verifica que la autenticación no lanza excepción cuando las credenciales son correctas
        assertDoesNotThrow(() -> {
            autenticador.autenticar("usuarioCorrecto", "contraseñaCorrecta");
        }, "No debería lanzar excepción si las credenciales son correctas");
    }
}
