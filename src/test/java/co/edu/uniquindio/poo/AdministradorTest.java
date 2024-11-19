package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.logging.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for Administrador class.
 */
public class AdministradorTest {

    private static final Logger LOG = Logger.getLogger(AdministradorTest.class.getName());
    private Administrador administrador;

    /**
     * Inicialización antes de cada prueba
     */
    @BeforeEach
    public void setUp() {
        LOG.info("Iniciando prueba: setUp");
        administrador = new Administrador();
        LOG.info("Finalizando inicialización de prueba.");
    }

    /**
     * Verifica la creación de los managers en el administrador
     */
    @Test
    public void testCreacionDeManagers() {
        LOG.info("Iniciado test testCreacionDeManagers");

        // Verificamos que los managers fueron instanciados correctamente
        assertNotNull(administrador.getEmpleadoManager(), "EmpleadoManager no debe ser nulo");
        assertNotNull(administrador.getSeguridadManager(), "SeguridadManager no debe ser nulo");
        assertNotNull(administrador.getReporteManager(), "ReporteManager no debe ser nulo");

        LOG.info("Finalizando test testCreacionDeManagers");
    }
}


