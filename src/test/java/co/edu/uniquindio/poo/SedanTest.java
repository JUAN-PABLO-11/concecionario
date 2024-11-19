package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SedanTest {

    private Concesionario concesionario;
    private Sedan sedan;
  
    
    @BeforeEach
    public void setUp() {
        // Inicializamos los objetos necesarios antes de cada prueba
        concesionario = new Concesionario("Concesionario XYZ", "Calle 123");

        // Crear un objeto Sedan
        sedan = new Sedan("Toyota", Estado.NUEVO, "2024", 180, 2.0,  5,  TipoCombustible.GASOLINA,  Transmision.AUTOMATICA, true, 500, 4, true,true,true,6,   true,true,true, false );

        // Agregar el sedan al concesionario
        concesionario.agregarVehiculo(sedan);
    }

    @Test
    public void testAtributosSedan() {
        // Verificamos que las propiedades del Sedan se han establecido correctamente
        assertEquals("Toyota", sedan.getMarca(), "La marca del vehículo debe ser Toyota.");
        assertEquals(Estado.NUEVO, sedan.getEstado(), "El estado del vehículo debe ser NUEVO.");
        assertEquals("2024", sedan.getModelo(), "El modelo debe ser 2024.");
        assertEquals(180, sedan.getTopSpeed(), "La velocidad máxima debe ser 180 km/h.");
        assertEquals(2.0, sedan.getCilindraje(), "El cilindraje debe ser 2.0 litros.");
        assertEquals(5, sedan.getNumeroPasajeros(), "El número de pasajeros debe ser 5.");
        assertTrue(sedan.isAireAcondicionado(), "El vehículo debe tener aire acondicionado.");
        assertTrue(sedan.isCamaraReversa(), "El vehículo debe tener cámara de reversa.");
        assertTrue(sedan.isControlCrucero(), "El vehículo debe tener control de crucero.");
        assertEquals(6, sedan.getAirbags(), "El vehículo debe tener 6 airbags.");
        assertTrue(sedan.isAbs(), "El vehículo debe tener ABS.");
        assertTrue(sedan.isSensorColision(), "El vehículo debe tener sensor de colisión.");
        assertTrue(sedan.isSensorTrafico(), "El vehículo debe tener sensor de tráfico.");
    }

    @Test
    public void testAgregarSedanAlConcesionario() {
        // Verificamos que el vehículo Sedan esté en el inventario del concesionario
        assertTrue(concesionario.getInventario().contains(sedan), "El vehículo Sedan debe estar en el inventario.");
    }

    @Test
    public void testEliminarSedanDelConcesionario() {
        // Verificamos que se puede eliminar un vehículo del concesionario
        concesionario.eliminarVehiculo(sedan);
        assertFalse(concesionario.getInventario().contains(sedan), "El vehículo Sedan debe haber sido eliminado del inventario.");
    }

    @Test
    public void testBuscarSedanPorMarca() {
        // Verificamos que la búsqueda de vehículos por marca funciona correctamente
        Vehiculo resultado = concesionario.buscarVehiculosPorMarca("Toyota").get(0);
        assertEquals(sedan, resultado, "El vehículo encontrado debe ser el Sedan que agregamos.");
    }
}

