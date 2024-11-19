package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SeguridadManagerTest {

    private SeguridadManager seguridadManager;

    @BeforeEach
    public void setUp() {
        // Inicializamos el objeto SeguridadManager antes de cada prueba
        seguridadManager = new SeguridadManager();
        // Registrar un usuario con sus credenciales y pregunta de seguridad
        seguridadManager.registrarCredenciales("usuario1", "contrasena123", "nombre de tu mascota", "firulais");
    }

    @Test
    public void testAutenticarUsuarioCorrecto() {
        try {
            // Verificamos que la autenticación funcione correctamente para usuario y contraseña válidos
            assertTrue(seguridadManager.autenticar("usuario1", "contrasena123"));
        } catch (AutenticacionException e) {
            fail("La autenticación no debería haber fallado: " + e.getMessage());
        }
    }

    @Test
    public void testAutenticarUsuarioIncorrecto() {
        // Verificamos que la autenticación falle con una contraseña incorrecta
        assertThrows(AutenticacionException.class, () -> {
            seguridadManager.autenticar("usuario1", "contrasenaErronea");
        });
    }

    @Test
    public void testRecuperarContrasenaCorrecta() {
        try {
            // Verificamos que la recuperación de contraseña funcione correctamente si la respuesta es correcta
            assertTrue(seguridadManager.recuperarContrasena("usuario1", "firulais"));
        } catch (AutenticacionException e) {
            fail("La recuperación de contraseña no debería haber fallado: " + e.getMessage());
        }
    }

    @Test
    public void testRecuperarContrasenaIncorrecta() {
        // Verificamos que la recuperación de contraseña falle con una respuesta incorrecta
        assertThrows(AutenticacionException.class, () -> {
            seguridadManager.recuperarContrasena("usuario1", "respuestaIncorrecta");
        });
    }

    @Test
    public void testAutenticarUsuarioNoRegistrado() {
        // Verificamos que se arroje una excepción si intentamos autenticar a un usuario no registrado
        assertThrows(AutenticacionException.class, () -> {
            seguridadManager.autenticar("usuarioNoExistente", "contrasena123");
        });
    }

    @Test
    public void testRecuperarContrasenaUsuarioNoRegistrado() {
        // Verificamos que se arroje una excepción si intentamos recuperar la contraseña de un usuario no registrado
        assertThrows(AutenticacionException.class, () -> {
            seguridadManager.recuperarContrasena("usuarioNoExistente", "respuestaIncorrecta");
        });
    }
}

