package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteTest {

    private Cliente cliente;

    @BeforeEach
    public void setUp() {
        // Inicializamos un objeto de tipo Cliente antes de cada prueba
        cliente = new Cliente("Juan", "Pérez", "1234567890", "321654987");
    }

    @Test
    public void testGetNombre() {
        // Verifica que el nombre sea correcto
        assertEquals("Juan", cliente.getNombre(), "El nombre debería ser Juan.");
    }

    @Test
    public void testGetApellido() {
        // Verifica que el apellido sea correcto
        assertEquals("Pérez", cliente.getApellido(), "El apellido debería ser Pérez.");
    }

    @Test
    public void testGetCedula() {
        // Verifica que la cédula sea correcta
        assertEquals("1234567890", cliente.getCedula(), "La cédula debería ser 1234567890.");
    }

    @Test
    public void testGetTelefono() {
        // Verifica que el teléfono sea correcto
        assertEquals("321654987", cliente.getTelefono(), "El teléfono debería ser 321654987.");
    }

    @Test
    public void testSetNombre() {
        // Verifica que se pueda cambiar el nombre correctamente
        cliente.setNombre("Carlos");
        assertEquals("Carlos", cliente.getNombre(), "El nombre debería ser Carlos después de ser modificado.");
    }

    @Test
    public void testSetApellido() {
        // Verifica que se pueda cambiar el apellido correctamente
        cliente.setApellido("Gómez");
        assertEquals("Gómez", cliente.getApellido(), "El apellido debería ser Gómez después de ser modificado.");
    }

    @Test
    public void testSetCedula() {
        // Verifica que se pueda cambiar la cédula correctamente
        cliente.setCedula("0987654321");
        assertEquals("0987654321", cliente.getCedula(), "La cédula debería ser 0987654321 después de ser modificada.");
    }

    @Test
    public void testSetTelefono() {
        // Verifica que se pueda cambiar el teléfono correctamente
        cliente.setTelefono("987654321");
        assertEquals("987654321", cliente.getTelefono(), "El teléfono debería ser 987654321 después de ser modificado.");
    }
}

