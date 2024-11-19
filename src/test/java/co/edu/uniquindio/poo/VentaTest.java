package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class VentaTest {

    private Venta venta;
    private Vehiculo vehiculo;
    private Cliente cliente;

    @BeforeEach
    public void setUp() {
        // Inicializamos el cliente y el vehículo
        cliente = new Cliente("Carlos", "Martínez", "123456789", "987654321");
        vehiculo = new Sedan("Toyota", Estado.NUEVO, "Corolla", 180, 1.8, 5, TipoCombustible.GASOLINA,
                             Transmision.AUTOMATICA, true, 500, 4, true, true, true, 6, true, true, true, true);
        
        // Creamos la venta
        venta = new Venta(vehiculo, cliente);
    }

    @Test
    public void testVentaCreacion() {
        // Verificamos que la venta no sea nula
        assertNotNull(venta, "La venta no debe ser nula");
    }

    @Test
    public void testVehiculoAsignado() {
        // Verificamos que el vehículo asignado sea el esperado
        assertEquals(vehiculo, venta.getVehiculo(), "El vehículo asignado a la venta no es el esperado");
    }

    @Test
    public void testClienteAsignado() {
        // Verificamos que el cliente asignado sea el esperado
        assertEquals(cliente, venta.getCliente(), "El cliente asignado a la venta no es el esperado");
    }

    @Test
    public void testFechaVenta() {
        // Verificamos que la fecha de venta sea la fecha actual
        assertEquals(LocalDate.now(), venta.getFechaVenta(), "La fecha de venta debe ser la fecha actual");
    }
}
