package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class EmpleadoTest {

    private Empleado empleado;
    private Vehiculo vehiculo;
    private Cliente cliente;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    @BeforeEach
    public void setUp() {
        // Inicializamos los objetos antes de cada prueba
        empleado = new Empleado("Juan Pérez", "EMP123");
        vehiculo = new Deportivo("Toyota", Estado.NUEVO, "2024", 180, 1.8, 5, TipoCombustible.GASOLINA, Transmision.AUTOMATICA, true, 2, 10, 690, "2.9 Segundos");
        cliente = new Cliente("Carlos", "Rodríguez", "1234567890","300000000000");
        fechaInicio = LocalDate.of(2024, 11, 1);
        fechaFin = LocalDate.of(2024, 11, 10);
    }

    @Test
    public void testRegistrarVehiculo() {
        // Verificamos que el vehículo se registre correctamente
        empleado.registrarVehiculo(vehiculo);
        assertTrue(empleado.getInventarioVehiculos().contains(vehiculo), "El vehículo debe estar registrado en el inventario.");
    }

    @Test
    public void testRegistrarCliente() {
        // Verificamos que el cliente se registre correctamente
        empleado.registrarCliente(cliente);
        assertTrue(empleado.getListaClientes().contains(cliente), "El cliente debe estar registrado.");
    }

    @Test
    public void testAlquilarVehiculo() {
        // Registramos un vehículo y un cliente
        empleado.registrarVehiculo(vehiculo);
        empleado.registrarCliente(cliente);

        // Verificamos que el alquiler se realice correctamente
        empleado.alquilarVehiculo(vehiculo, cliente, fechaInicio, fechaFin);
        assertEquals(1, empleado.getListaAlquileres().size(), "El alquiler debe ser registrado.");
    }

    @Test
    public void testAlquilarVehiculoYaAlquilado() {
        // Intentamos alquilar un vehículo que ya está alquilado
        empleado.registrarVehiculo(vehiculo);
        empleado.registrarCliente(cliente);
        empleado.alquilarVehiculo(vehiculo, cliente, fechaInicio, fechaFin);
        
        // Intentamos alquilarlo de nuevo
        Empleado otroEmpleado = new Empleado("Pedro García", "EMP124");
        Cliente otroCliente = new Cliente("María", "López", "0987654321","308852248");
        otroEmpleado.alquilarVehiculo(vehiculo, otroCliente, fechaInicio, fechaFin);
        
        assertEquals(1, empleado.getListaAlquileres().size(), "No debe permitirse alquilar el mismo vehículo dos veces.");
    }

    @Test
    public void testVenderVehiculo() {
        // Registramos un vehículo y un cliente
        empleado.registrarVehiculo(vehiculo);
        empleado.registrarCliente(cliente);

        // Vender el vehículo
        empleado.venderVehiculo(vehiculo, cliente);
        assertFalse(empleado.getInventarioVehiculos().contains(vehiculo), "El vehículo debe ser removido del inventario.");
    }

    @Test
    public void testVenderVehiculoNoRegistrado() {
        // Intentamos vender un vehículo que no está en el inventario
        Empleado otroEmpleado = new Empleado("Pedro García", "EMP124");
        Vehiculo vehiculoNoRegistrado = new Deportivo("Toyota", Estado.NUEVO, "2024", 180, 1.8, 5, TipoCombustible.GASOLINA, Transmision.AUTOMATICA, true, 2, 10, 690, "2.9 Segundos");

        Cliente otroCliente = new Cliente("María", "López", "0987654321","308852248");
        
        // Intentamos vender el vehículo no registrado
        otroEmpleado.venderVehiculo(vehiculoNoRegistrado, otroCliente);
        assertEquals(0, otroEmpleado.getListaVentas().size(), "No se debe permitir la venta de un vehículo no registrado.");
    }

    @Test
    public void testComprarVehiculo() {
        // Registramos un vehículo y un cliente
        empleado.registrarVehiculo(vehiculo);
        empleado.registrarCliente(cliente);
    }
}

       

