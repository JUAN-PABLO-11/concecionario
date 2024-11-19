package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DeportivoTest {

    private Deportivo deportivo;

    @BeforeEach
    public void setUp() {
        // Inicializamos el objeto Deportivo antes de cada prueba
        deportivo = new Deportivo("Toyota", Estado.NUEVO, "2024", 180, 1.8, 5, 
                                  TipoCombustible.GASOLINA, Transmision.AUTOMATICA, 
                                  true, 2, 10, 690, "2.9 Segundos");
    }

    @Test
    public void testConstructor() {
        // Verificamos que el constructor de Deportivo funcione correctamente
        assertNotNull(deportivo, "El objeto deportivo no debe ser null.");
    }

    @Test
    public void testGetNumeroPuertas() {
        // Verificamos que el número de puertas sea correcto
        assertEquals(2, deportivo.getNumeroPuertas(), "El número de puertas debería ser 2.");
    }

    @Test
    public void testGetAirbags() {
        // Verificamos que el número de airbags sea correcto
        assertEquals(10, deportivo.getAirbags(), "El número de airbags debería ser 10.");
    }

    @Test
    public void testGetCaballos() {
        // Verificamos que el número de caballos de fuerza sea correcto
        assertEquals(690, deportivo.getCaballos(), "El número de caballos debería ser 690.");
    }

    @Test
    public void testGetCeroAcien() {
        // Verificamos que el cero a cien sea correcto
        assertEquals("2.9 Segundos", deportivo.getCeroAcien(), "El tiempo de 0 a 100 debería ser '2.9 Segundos'.");
    }

    @Test
    public void testGetMarca() {
        // Verificamos que la marca del vehículo sea correcta
        assertEquals("Toyota", deportivo.getMarca(), "La marca debería ser Toyota.");
    }

    @Test
    public void testGetEstado() {
        // Verificamos que el estado del vehículo sea correcto
        assertEquals(Estado.NUEVO, deportivo.getEstado(), "El estado del vehículo debería ser NUEVO.");
    }

    @Test
    public void testGetModelo() {
        // Verificamos que el modelo sea correcto
        assertEquals("2024", deportivo.getModelo(), "El modelo debería ser 2024.");
    }

    @Test
    public void testGetTopSpeed() {
        // Verificamos que la velocidad máxima sea correcta
        assertEquals(180, deportivo.getTopSpeed(), "La velocidad máxima debería ser 180.");
    }

    @Test
    public void testGetCilindraje() {
        // Verificamos que el cilindraje sea correcto
        assertEquals(1.8, deportivo.getCilindraje(), "El cilindraje debería ser 1.8.");
    }

    @Test
    public void testGetNumeroPasajeros() {
        // Verificamos que el número de pasajeros sea correcto
        assertEquals(5, deportivo.getNumeroPasajeros(), "El número de pasajeros debería ser 5.");
    }
}

