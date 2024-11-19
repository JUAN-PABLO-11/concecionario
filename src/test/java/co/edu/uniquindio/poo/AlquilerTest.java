package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.logging.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for Alquiler class.
 */
public class AlquilerTest {

    private static final Logger LOG = Logger.getLogger(AlquilerTest.class.getName());
    private Alquiler alquiler;
    private Deportivo deportivo; 
    private Cliente cliente;     

    /**
     * Inicialización antes de cada prueba.
     */
    @BeforeEach
    public void setUp() {
        LOG.info("Iniciando prueba: setUp");

        // Crear un Cliente y un Vehiculo de prueba
        cliente = new Cliente("Juan", "Grisales", "109842328","300125325");
        deportivo = new Deportivo("Toyota", Estado.NUEVO, "2024", 180, 1.8, 5, TipoCombustible.GASOLINA, Transmision.AUTOMATICA, true, 2, 10, 690, "2.9 Segundos");

        // Crear un alquiler con fecha de inicio y fin
        alquiler = new Alquiler(deportivo, cliente, LocalDate.now(), LocalDate.now().plusDays(5));
        LOG.info("Finalizando inicialización de prueba.");
    }

    /**
     * Verifica la creación correcta de un alquiler.
     */
    @Test
    public void testCreacionAlquiler() {
        LOG.info("Iniciado test testCreacionAlquiler");

        // Verificar que el alquiler se ha creado correctamente
        assertNotNull(alquiler.getVehiculo(), "El vehículo no debe ser nulo");
        assertNotNull(alquiler.getCliente(), "El cliente no debe ser nulo");
        assertEquals(LocalDate.now(), alquiler.getFechaInicio(), "La fecha de inicio debe ser hoy");
        assertEquals(LocalDate.now().plusDays(5), alquiler.getFechaFin(), "La fecha de fin debe ser 5 días después");
        assertTrue(alquiler.isActivo(), "El alquiler debe estar activo al principio");

        LOG.info("Finalizando test testCreacionAlquiler");
    }

    /**
     * Verifica que un alquiler se puede finalizar correctamente.
     */
    @Test
    public void testFinalizarAlquiler() {
        LOG.info("Iniciado test testFinalizarAlquiler");

        // Finalizar el alquiler
        alquiler.finalizarAlquiler();

        // Verificar que el alquiler ha sido finalizado
        assertFalse(alquiler.isActivo(), "El alquiler debe estar inactivo después de finalizarlo");

        LOG.info("Finalizando test testFinalizarAlquiler");
    }
}
