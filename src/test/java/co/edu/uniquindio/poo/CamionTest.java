package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CamionTest {

    private Camion camion;

    @BeforeEach
    public void setUp() {
        // Inicializamos un objeto de tipo Camion antes de cada prueba
        camion = new Camion("Volvo", Estado.NUEVO, "FH16", 120.0, 12.0, 2,
                            TipoCombustible.DIESEL, Transmision.MANUAL, true,
                            15000, true, true, true, 3, "Articulado");
    }

    @Test
    public void testCapacidadCarga() {
        // Verifica que la capacidad de carga sea la correcta
        assertEquals(15000, camion.getCapacidadCarga(), "La capacidad de carga debe ser 15000.");
    }

    @Test
    public void testAireAcondicionado() {
        // Verifica que el camión tenga aire acondicionado
        assertTrue(camion.isAireAcondicionado(), "El camión debería tener aire acondicionado.");
    }

    @Test
    public void testTipoCamion() {
        // Verifica que el tipo de camión sea "Articulado"
        assertEquals("Articulado", camion.getTipoCamion(), "El tipo de camión debería ser 'Articulado'.");
    }

    @Test
    public void testNumeroEjes() {
        // Verifica que el número de ejes sea el correcto
        assertEquals(3, camion.getNumeroEjes(), "El número de ejes debería ser 3.");
    }
}