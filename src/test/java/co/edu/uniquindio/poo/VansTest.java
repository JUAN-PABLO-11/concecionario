package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VansTest {

    private Vans van;
    private Vehiculo vehiculo;

    @BeforeEach
    public void setUp() {
        // Inicializamos el vehículo (puede ser un tipo genérico o específico) 
        vehiculo = new Vans("Mercedes", Estado.NUEVO, "Sprinter", 140, 2.5, 10, TipoCombustible.DIESEL,
                            Transmision.MANUAL, true, 1500, 4, 4, true, true, 6, true);
        
        // Inicializamos el objeto Vans
        van = (Vans) vehiculo;  // Cast necesario si estamos trabajando con un tipo genérico
    }

    @Test
    public void testVansCreacion() {
        // Verificamos que el objeto van no sea nulo
        assertNotNull(van, "El objeto van no debe ser nulo");
    }

    @Test
    public void testBolsasAire() {
        // Verificamos que el número de bolsas de aire sea el esperado
        assertEquals(4, van.getBolsasAire(), "El número de bolsas de aire debe ser 4");
    }

    @Test
    public void testAireAcondicionado() {
        // Verificamos que el aire acondicionado esté activado
        assertTrue(van.isAireAcondicionado(), "El vehículo debe tener aire acondicionado");
    }

    @Test
    public void testCamaraReversa() {
        // Verificamos que la cámara de reversa esté disponible
        assertTrue(van.isCamaraReversa(), "El vehículo debe tener cámara de reversa");
    }

    @Test
    public void testNumeroBolsasAire() {
        // Verificamos que el número de bolsas de aire sea correcto
        assertEquals(6, van.getNumeroBolsasAire(), "El número de bolsas de aire debe ser 6");
    }

    @Test
    public void testAbs() {
        // Verificamos que el ABS esté habilitado
        assertTrue(van.isAbs(), "El vehículo debe tener ABS");
    }
}
