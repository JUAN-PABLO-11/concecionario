package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;


public class ReporteManagerTest {

    private Concesionario concesionario;
    private Empleado empleado;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private Transaccion transaccion;
    private ReporteManager reporteManager;

    @BeforeEach
    public void setUp() {
        // Inicializamos los objetos necesarios antes de cada prueba
        concesionario = new Concesionario("Concesionario XYZ", "Calle 123");

        // Crear un vehículo y cliente
        vehiculo = new Deportivo("Toyota", Estado.NUEVO, "2024", 180, 1.8, 5, TipoCombustible.GASOLINA, Transmision.AUTOMATICA, true, 2, 10, 690, "2.9 Segundos");
        cliente = new Cliente("Juan", "Pérez", "12345678", "555-1234");

        // Crear un empleado
        empleado = new Empleado("Messi", "10824685");

        // Crear una transacción
        transaccion = new Transaccion(Transaccion.TipoTransaccion.COMPRA, vehiculo, cliente);

        // Agregar vehículos, empleado y transacción al concesionario
        concesionario.agregarVehiculo(vehiculo);
        concesionario.agregarEmpleado(empleado);
        concesionario.registrarTransaccion(transaccion);

        // Inicializamos el ReporteManager
        reporteManager = new ReporteManager();
    }

    @Test
    public void testGenerarReporte() {
        // Verificamos que el reporte sea generado correctamente para el empleado

        // Definir el rango de fechas (el mismo día de la transacción)
        LocalDate inicio = LocalDate.now().minusDays(1);
        LocalDate fin = LocalDate.now().plusDays(1);

        // Generar el reporte
        reporteManager.generarReporte(empleado, inicio, fin);

        // Aquí verificaríamos en la salida de consola que se imprimieron las transacciones correctamente
        // Si lo deseas, puedes redirigir la salida a un `ByteArrayOutputStream` para hacer un "assert" sobre el contenido.
        // En este ejemplo, simplemente verificamos que el método no lanza errores
        assertDoesNotThrow(() -> reporteManager.generarReporte(empleado, inicio, fin));
    }

    @Test
    public void testGenerarReporteSinTransacciones() {
        // Creamos un nuevo empleado sin transacciones para verificar el reporte vacío
        Empleado empleadoSinTransacciones = new Empleado("Cristiano", "10824686");

        // Definir el rango de fechas
        LocalDate inicio = LocalDate.now().minusDays(1);
        LocalDate fin = LocalDate.now().plusDays(1);

        // Generar el reporte para un empleado sin transacciones
        reporteManager.generarReporte(empleadoSinTransacciones, inicio, fin);

        // Verificamos que no se impriman transacciones para el empleado sin historial
        assertDoesNotThrow(() -> reporteManager.generarReporte(empleadoSinTransacciones, inicio, fin));
    }

    @Test
    public void testGenerarReporteConRangoFechasEspecifico() {
        // Establecer un rango de fechas donde solo la transacción de hoy será válida
        LocalDate inicio = LocalDate.now().minusDays(1);
        LocalDate fin = LocalDate.now().plusDays(1);

        // Generar el reporte para el empleado
        reporteManager.generarReporte(empleado, inicio, fin);

        // Aquí, deberías ver la transacción correspondiente al rango de fechas
        // Puedes verificar la salida en consola o ajustar la clase ReporteManager para que devuelva el reporte como texto.
        assertDoesNotThrow(() -> reporteManager.generarReporte(empleado, inicio, fin));
    }
}
