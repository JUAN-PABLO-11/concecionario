package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class CompraTest {

    private Compra compra;
    private Deportivo deportivo;
    private Cliente cliente;

    @BeforeEach
    public void setUp() {
        // Inicializamos los objetos necesarios antes de cada prueba
        deportivo = new Deportivo("Toyota", Estado.NUEVO, "2024", 180, 1.8, 5, TipoCombustible.GASOLINA, Transmision.AUTOMATICA, true, 2, 10, 690, "2.9 Segundos");
        cliente = new Cliente("Juan", "Pérez", "1234567890", "321654987");
        compra = new Compra(deportivo, cliente);
    }

    @Test
    public void testGetVehiculo() {
        // Verifica que el método getVehiculo devuelve el vehículo correctamente
        assertEquals(deportivo, compra.getVehiculo(), "El vehículo de la compra debería ser el mismo que el asignado.");
    }

    @Test
    public void testGetCliente() {
        // Verifica que el método getCliente devuelve el cliente correctamente
        assertEquals(cliente, compra.getCliente(), "El cliente de la compra debería ser el mismo que el asignado.");
    }

    @Test
    public void testGetFechaCompra() {
        // Verifica que la fecha de compra sea la fecha actual
        assertEquals(LocalDate.now(), compra.getFechaCompra(), "La fecha de compra debería ser la fecha actual.");
    }
}

