package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

public class ConcesionarioTest {

    private Concesionario concesionario;
    private Vehiculo vehiculo1, vehiculo2;
    private Empleado empleado;
    private Transaccion transaccion;
    private Cliente cliente;

    @BeforeEach
    public void setUp() {
        // Inicializamos los objetos necesarios antes de cada prueba
        concesionario = new Concesionario("Concesionario XYZ", "Calle 123");
        
        // Crear un par de vehículos concretos (Deportivo, por ejemplo)
        vehiculo1 = new Deportivo("Toyota", Estado.NUEVO, "2024", 180, 1.8, 5, TipoCombustible.GASOLINA, Transmision.AUTOMATICA, true, 2, 10, 690, "2.9 Segundos");
        vehiculo2 = new Deportivo("Maserati", Estado.NUEVO, "2024", 180, 1.8, 5, TipoCombustible.GASOLINA, Transmision.AUTOMATICA, true, 2, 10, 690, "2.9 Segundos");

        // Crear un cliente
        cliente = new Cliente("Lionel", "Messi", "10824685", "555-1234");
        
        // Crear un empleado
        empleado = new Empleado("Messi", "10824685");

        // Crear una transacción (importante que TipoTransaccion esté bien referenciado)
        transaccion = new Transaccion(Transaccion.TipoTransaccion.COMPRA, vehiculo1, cliente);
        
        // Agregar vehículos, empleado y transacción al concesionario
        concesionario.agregarVehiculo(vehiculo1);
        concesionario.agregarVehiculo(vehiculo2);
        concesionario.agregarEmpleado(empleado);
        concesionario.registrarTransaccion(transaccion);
    }

    @Test
    public void testAgregarVehiculo() {
        assertTrue(concesionario.getInventario().contains(vehiculo1), "El vehículo Toyota debería estar en el inventario.");
        assertTrue(concesionario.getInventario().contains(vehiculo2), "El vehículo Maserati debería estar en el inventario.");
    }

    @Test
    public void testEliminarVehiculo() {
        // Verificamos que se puede eliminar un vehículo del inventario
        concesionario.eliminarVehiculo(vehiculo1);
        assertFalse(concesionario.getInventario().contains(vehiculo1), "El vehículo Toyota debería haber sido eliminado del inventario.");
    }

    @Test
    public void testBuscarVehiculosPorMarca() {
        // Verificamos que la búsqueda de vehículos por marca funciona correctamente
        List<Vehiculo> vehiculosToyota = concesionario.buscarVehiculosPorMarca("Toyota");
        assertEquals(1, vehiculosToyota.size(), "Debería haber solo un vehículo de marca Toyota.");
        assertEquals(vehiculo1, vehiculosToyota.get(0), "El vehículo encontrado debe ser el de marca Toyota.");
    }

    @Test
    public void testAgregarEmpleado() {
        // Verificamos que el empleado se haya agregado correctamente
        assertTrue(concesionario.getEmpleados().contains(empleado), "El empleado Messi debería estar en la lista de empleados.");
    }

    @Test
    public void testEliminarEmpleado() {
        // Verificamos que se puede eliminar un empleado correctamente
        concesionario.eliminarEmpleado(empleado);
        assertFalse(concesionario.getEmpleados().contains(empleado), "El empleado Messi debería haber sido eliminado de la lista.");
    }

    @Test
    public void testBuscarEmpleadoPorId() {
        // Verificamos que el método de búsqueda de empleados funciona
        Empleado encontrado = concesionario.buscarEmpleadoPorId("10824685");
        assertNotNull(encontrado, "El empleado debería ser encontrado por su ID.");
        assertEquals(empleado, encontrado, "El empleado encontrado debe ser el mismo que el creado.");
    }

    @Test
    public void testRegistrarTransaccion() {
        // Verificamos que la transacción se haya registrado correctamente
        List<Transaccion> transacciones = concesionario.getTransacciones();
        assertTrue(transacciones.contains(transaccion), "La transacción debería haber sido registrada.");
    }

    @Test
    public void testObtenerTransaccionesPorPeriodo() {
        // Verificamos que se puedan obtener las transacciones por un rango de fechas
        List<Transaccion> transacciones = concesionario.obtenerTransaccionesPorPeriodo(LocalDate.now().minusDays(1), LocalDate.now().plusDays(1));
        assertTrue(transacciones.contains(transaccion), "La transacción debería estar dentro del rango de fechas.");
    }
}


