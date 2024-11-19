package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Concesionario {
    private String nombre;
    private String direccion;
    private List<Vehiculo> inventario;
    private List<Empleado> empleados;
    private List<Transaccion> transacciones;

    // Constructor
    public Concesionario(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.inventario = new ArrayList<>();
        this.empleados = new ArrayList<>();
        this.transacciones = new ArrayList<>();
    }

    // Métodos para gestionar el inventario de vehículos
    public void agregarVehiculo(Vehiculo vehiculo) {
        inventario.add(vehiculo);
    }

    public void eliminarVehiculo(Vehiculo vehiculo) {
        inventario.remove(vehiculo);
    }

    public List<Vehiculo> buscarVehiculosPorMarca(String marca) {
        return inventario.stream()
                .filter(v -> v.getMarca().equalsIgnoreCase(marca))
                .toList();
    }

      // Método para agregar un empleado al concesionario sin excepciones
      public boolean agregarEmpleado(Empleado empleado) {
        // Verificamos si el empleado ya existe en la lista por su ID
        for (Empleado e : empleados) {
            if (e.getId().equals(empleado.getId())) {
                // Si el ID ya existe, devolvemos false para indicar que no se pudo agregar
                System.out.println("El empleado con ID " + empleado.getId() + " ya existe.");
                return false;
            }
        }

        // Si no existe, agregamos el empleado a la lista
        empleados.add(empleado);
        System.out.println("Empleado agregado exitosamente.");
        return true;
    }

    public void eliminarEmpleado(Empleado empleado) {
        empleados.remove(empleado);
    }

    /**
     * @param id
     * @return
     */
    public Empleado buscarEmpleadoPorId(String id) {
        return empleados.stream()
                .filter(e -> e.getId().equals(id)) // Verifica que el filtro se hace correctamente
                .findFirst()
                .orElse(null); // Retorna null si no se encuentra el empleado
    }

    // Métodos para gestionar transacciones
    public void registrarTransaccion(Transaccion transaccion) {
        transacciones.add(transaccion);
    }

    public List<Transaccion> obtenerTransaccionesPorPeriodo(LocalDate inicio, LocalDate fin) {
        return transacciones.stream()
                .filter(t -> !t.getFecha().isBefore(inicio) && !t.getFecha().isAfter(fin))
                .toList();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Vehiculo> getInventario() {
        return inventario;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public List<Transaccion> getTransacciones() {
        return transacciones;
    }
}
