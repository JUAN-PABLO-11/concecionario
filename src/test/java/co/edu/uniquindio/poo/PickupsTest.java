package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PickupsTest {

    private Pickups pickup;
    
    @BeforeEach
    public void setUp() {
        // Inicialización de la Pickup para la prueba
        pickup = new Pickups("Toyota", Estado.NUEVO, "2024", 180, 2.5, 5, TipoCombustible.GASOLINA, 
                             Transmision.AUTOMATICA, true, 400, 4, true, true, true, 6, true, 1000);
    }
    
    @Test
    public void testGetMarca() {
        assertEquals("Toyota", pickup.getMarca(), "La marca debe ser Toyota.");
    }
    
    @Test
    public void testIsTraccion4x4() {
        assertTrue(pickup.isTraccion4x4(), "El vehículo debe tener tracción 4x4.");
    }

    @Test
    public void testIsAireAcondicionado() {
        assertTrue(pickup.isAireAcondicionado(), "El vehículo debe tener aire acondicionado.");
    }

    @Test
    public void testIsCamaraReversa() {
        assertTrue(pickup.isCamaraReversa(), "El vehículo debe tener cámara de reversa.");
    }
    
    @Test
    public void testGetNumeroAirbags() {
        assertEquals(6, pickup.getNumeroAirbags(), "El vehículo debe tener 6 airbags.");
    }
    
    @Test
    public void testIsAbs() {
        assertTrue(pickup.isAbs(), "El vehículo debe tener ABS.");
    }

    @Test
    public void testGetCapacidadCajaCarga() {
        assertEquals(1000, pickup.getCapacidadCajaCarga(), "La capacidad de la caja de carga debe ser 1000.");
    }

    @Test
    public void testSetCapacidadCajaCarga() {
        // Cambiar la capacidad de la caja de carga
        pickup.setCapacidadCajaCarga(1200);
        assertEquals(1200, pickup.getCapacidadCajaCarga(), "La capacidad de la caja de carga debe haber sido actualizada a 1200.");
    }
}
