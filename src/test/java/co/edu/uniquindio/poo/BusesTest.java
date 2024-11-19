package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BusesTest {

    private Buses bus;

    @BeforeEach
    public void setUp() {
        // Inicializamos un objeto de tipo Buses antes de cada prueba
        bus = new Buses("Mercedes", Estado.NUEVO, "Sprinter", 120.0, 3.0, 30,
                        TipoCombustible.DIESEL, Transmision.MANUAL, true,
                        true, true, 6, true, 2, 4);
    }

    @Test
    public void testAireAcondicionado() {
        // Verifica que el bus tenga aire acondicionado
        assertTrue(bus.isAireAcondicionado(), "El bus debería tener aire acondicionado.");
    }

    @Test
    public void testNumeroEjes() {
        // Verifica que el número de ejes sea el correcto
        assertEquals(2, bus.getNumeroEjes(), "El número de ejes debería ser 2.");
    }

    @Test
    public void testCamaraReversa() {
        // Verifica que el bus tenga cámara de reversa
        assertTrue(bus.isCamaraReversa(), "El bus debería tener cámara de reversa.");
    }

    @Test
    public void testNumeroSalidasEmergencia() {
        // Verifica que el número de salidas de emergencia sea el correcto
        assertEquals(4, bus.getNumeroSalidasEmergencia(), "El número de salidas de emergencia debería ser 4.");
    }
}
