package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class TransaccionTest {

    private Cliente cliente;
    private Vehiculo vehiculo;
    private Transaccion compra;
    private Transaccion venta;

    @BeforeEach
    public void setUp() {
        // Inicializamos los objetos cliente y vehiculo antes de cada prueba
        cliente = new Cliente("Juan", "Perez", "123456789", "987654321");
        vehiculo = new Sedan("Toyota", Estado.NUEVO, "Corolla", 180, 2.0, 5, TipoCombustible.GASOLINA, 
                             Transmision.AUTOMATICA, true, 400, 4, true, true, true, 8, true, true, true, true);
        
        // Inicializamos las transacciones
        compra = new Transaccion(Transaccion.TipoTransaccion.COMPRA, vehiculo, cliente);
        venta = new Transaccion(Transaccion.TipoTransaccion.VENTA, vehiculo, cliente);
    }

    @Test
    public void testTransaccionCreacionCompra() {
        // Verificamos que la transacción de tipo COMPRA se haya creado correctamente
        assertNotNull(compra, "La transacción de compra no debe ser nula");
        assertEquals(Transaccion.TipoTransaccion.COMPRA, compra.getTipo(), "El tipo de transacción debe ser COMPRA");
        assertEquals(cliente, compra.getCliente(), "El cliente debe ser el mismo que el proporcionado");
        assertEquals(vehiculo, compra.getVehiculo(), "El vehículo debe ser el mismo que el proporcionado");
    }

    @Test
    public void testTransaccionCreacionVenta() {
        // Verificamos que la transacción de tipo VENTA se haya creado correctamente
        assertNotNull(venta, "La transacción de venta no debe ser nula");
        assertEquals(Transaccion.TipoTransaccion.VENTA, venta.getTipo(), "El tipo de transacción debe ser VENTA");
        assertEquals(cliente, venta.getCliente(), "El cliente debe ser el mismo que el proporcionado");
        assertEquals(vehiculo, venta.getVehiculo(), "El vehículo debe ser el mismo que el proporcionado");
    }

    @Test
    public void testFechaTransaccion() {
        // Verificamos que la fecha de la transacción sea la fecha actual
        LocalDate fechaActual = LocalDate.now();
        assertEquals(fechaActual, compra.getFecha(), "La fecha de la transacción debe ser la fecha actual");
        assertEquals(fechaActual, venta.getFecha(), "La fecha de la transacción debe ser la fecha actual");
    }

    @Test
    public void testTransaccionTipo() {
        // Verificamos que el tipo de transacción pueda ser correctamente COMPRA, VENTA o ALQUILER
        Transaccion alquiler = new Transaccion(Transaccion.TipoTransaccion.ALQUILER, vehiculo, cliente);
        assertEquals(Transaccion.TipoTransaccion.ALQUILER, alquiler.getTipo(), "El tipo de transacción debe ser ALQUILER");
    }
}

