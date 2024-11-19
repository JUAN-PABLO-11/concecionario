package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SuvTest {

    private Suv suv;

    @BeforeEach
    public void setUp() {
        // Inicializamos el objeto Suv antes de cada prueba
        suv = new Suv("Toyota", Estado.NUEVO, "RAV4", 180, 2.5, 5, TipoCombustible.GASOLINA, 
                      Transmision.AUTOMATICA, true, 450, 5, true, true, true, 8, 
                      true, true, true, true, true);
    }

    @Test
    public void testSuvCreacion() {
        // Verificamos que el objeto se haya creado correctamente
        assertNotNull(suv, "El objeto SUV no debe ser nulo");
    }

    @Test
    public void testAireAcondicionado() {
        // Verificamos que el aire acondicionado esté correctamente asignado
        assertTrue(suv.isAireAcondicionado(), "El aire acondicionado debe estar activo");
    }

    @Test
    public void testCamaraReversa() {
        // Verificamos que la cámara de reversa esté correctamente asignada
        assertTrue(suv.isCamaraReversa(), "La cámara de reversa debe estar activa");
    }

    @Test
    public void testControlCrucero() {
        // Verificamos que el control de crucero esté correctamente asignado
        assertTrue(suv.isControlCrucero(), "El control de crucero debe estar activo");
    }

    @Test
    public void testAirbags() {
        // Verificamos que el número de airbags esté correctamente asignado
        assertEquals(8, suv.getAirbags(), "El número de airbags debe ser 8");
    }

    @Test
    public void testAbs() {
        // Verificamos que el ABS esté correctamente asignado
        assertTrue(suv.isAbs(), "El ABS debe estar activo");
    }

    @Test
    public void testSensorColision() {
        // Verificamos que el sensor de colisión esté correctamente asignado
        assertTrue(suv.isSensorColision(), "El sensor de colisión debe estar activo");
    }

    @Test
    public void testSensorTrafico() {
        // Verificamos que el sensor de tráfico esté correctamente asignado
        assertTrue(suv.isSensorTrafico(), "El sensor de tráfico debe estar activo");
    }

    @Test
    public void testAsistentePermanencia() {
        // Verificamos que el asistente de permanencia en el carril esté correctamente asignado
        assertTrue(suv.isAsistentePermanencia(), "El asistente de permanencia debe estar activo");
    }

    @Test
    public void testTraccion4x4() {
        // Verificamos que la tracción 4x4 esté correctamente asignada
        assertTrue(suv.isTraccion4x4(), "La tracción 4x4 debe estar activa");
    }

    @Test
    public void testGetters() {
        // Verificamos que los getters funcionen correctamente
        assertEquals("Toyota", suv.getMarca(), "La marca debe ser Toyota");
        assertEquals(Estado.NUEVO, suv.getEstado(), "El estado debe ser NUEVO");
        assertEquals("RAV4", suv.getModelo(), "El modelo debe ser RAV4");
        assertEquals(180, suv.getTopSpeed(), "La velocidad máxima debe ser 180 km/h");
        assertEquals(2.5, suv.getCilindraje(), "El cilindraje debe ser 2.5L");
        assertEquals(5, suv.getNumeroPasajeros(), "El número de pasajeros debe ser 5");
    }
}
