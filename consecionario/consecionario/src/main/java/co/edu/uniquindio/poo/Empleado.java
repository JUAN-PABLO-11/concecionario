package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private String nombre;
    private boolean activo;
    private List<Transaccion> historialTransacciones;
    private List<Vehiculo> inventarioVehiculos;
    private List<Cliente> listaClientes;
    private List<Alquiler> listaAlquileres;
    private List<Venta> listaVentas;
    private List<Compra> listaCompras;

    public Empleado(String nombre) {
        this.nombre = nombre;
        this.activo = true;
        this.historialTransacciones = new ArrayList<>();
        this.inventarioVehiculos = new ArrayList<>();
        this.listaClientes = new ArrayList<>();
        this.listaAlquileres = new ArrayList<>();
        this.listaVentas = new ArrayList<>();
        this.listaCompras = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public List<Transaccion> getHistorialTransacciones() {
        return historialTransacciones;
    }

    public List<Vehiculo> getInventarioVehiculos() {
        return inventarioVehiculos;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public List<Alquiler> getListaAlquileres() {
        return listaAlquileres;
    }

    public List<Venta> getListaVentas() {
        return listaVentas;
    }

    public List<Compra> getListaCompras() {
        return listaCompras;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHistorialTransacciones(List<Transaccion> historialTransacciones) {
        this.historialTransacciones = historialTransacciones;
    }

    public void setInventarioVehiculos(List<Vehiculo> inventarioVehiculos) {
        this.inventarioVehiculos = inventarioVehiculos;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public void setListaAlquileres(List<Alquiler> listaAlquileres) {
        this.listaAlquileres = listaAlquileres;
    }

    public void setListaVentas(List<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }

    public void setListaCompras(List<Compra> listaCompras) {
        this.listaCompras = listaCompras;
    }

    // Método para registrar un vehículo
    public void registrarVehiculo(Vehiculo vehiculo) {
        for (Vehiculo v : inventarioVehiculos) {
            if (v.getMarca().equalsIgnoreCase(vehiculo.getMarca()) &&
                v.getModelo().equalsIgnoreCase(vehiculo.getModelo())) {
                System.out.println("Error: el vehículo " + vehiculo.getMarca() + " " + vehiculo.getModelo() +
                        " ya está registrado.");
                return;
            }
        }
        inventarioVehiculos.add(vehiculo);
        System.out.println("Vehículo " + vehiculo.getMarca() + " " + vehiculo.getModelo() + " registrado exitosamente.");
    }

    // Método para listar los vehículos registrados
    public void listarVehiculos() {
        if (inventarioVehiculos.isEmpty()) {
            System.out.println("No hay vehículos registrados en el inventario.");
            return;
        }
        System.out.println("Inventario de Vehículos:");
        for (Vehiculo v : inventarioVehiculos) {
            System.out.println("- " + v.getMarca() + " " + v.getModelo() + ", Estado: " + v.getEstado());
        }
    }

    // Método que registra a un cliente
    public void registrarCliente(Cliente cliente) {
        for (Cliente c : listaClientes) {
            if (c.getCedula().equalsIgnoreCase(cliente.getCedula())) {
                System.out.println("Error: La cédula del cliente ya está registrada.");
                return;
            }
        }
        listaClientes.add(cliente);
        System.out.println("Cliente registrado con éxito.");
    }

    // Método para listar los clientes registrados
    public void listarClientes() {
        if (listaClientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
            return;
        }
        System.out.println("Lista de Clientes:");
        for (Cliente c : listaClientes) {
            System.out.println("- " + c.getNombre() + ", Cédula: " + c.getCedula());
        }
    }

    // Método para alquilar un vehículo
    public void alquilarVehiculo(Vehiculo vehiculo, Cliente cliente, LocalDate fechaInicio, LocalDate fechaFin) {
        // Verificar si el vehículo ya está alquilado
        for (Alquiler alquiler : listaAlquileres) {
            if (alquiler.getVehiculo().equals(vehiculo) && alquiler.isActivo()) {
                System.out.println("Error: El vehículo " + vehiculo.getMarca() + " " + vehiculo.getModelo() + " ya está alquilado.");
                return;
            }
        }

        // Registrar el alquiler si está disponible
        Alquiler alquiler = new Alquiler(vehiculo, cliente, fechaInicio, fechaFin);
        listaAlquileres.add(alquiler);
        System.out.println("Vehículo " + vehiculo.getMarca() + " " + vehiculo.getModelo() + " alquilado exitosamente a " + cliente.getNombre() + ".");
    }

    // Método para listar los alquileres activos
    public void listarAlquileresActivos() {
        System.out.println("Alquileres Activos:");
        for (Alquiler a : listaAlquileres) {
            if (a.isActivo()) {
                System.out.println("- Vehículo: " + a.getVehiculo().getMarca() + " " + a.getVehiculo().getModelo() +
                        ", Cliente: " + a.getCliente().getNombre() + ", Fecha Inicio: " + a.getFechaInicio() +
                        ", Fecha Fin: " + a.getFechaFin());
            }
        }
    }

    // Método para vender un vehículo
    public void venderVehiculo(Vehiculo vehiculo, Cliente cliente) {
        // Verificar si el vehículo está en el inventario
        if (!inventarioVehiculos.contains(vehiculo)) {
            System.out.println("Error: El vehículo " + vehiculo.getMarca() + " " + vehiculo.getModelo() + " no está disponible en el inventario.");
            return;
        }
        // Registrar la venta
        Venta venta = new Venta(vehiculo, cliente);
        listaVentas.add(venta);

        // Remover el vehículo del inventario
        inventarioVehiculos.remove(vehiculo);
        System.out.println("Vehículo " + vehiculo.getMarca() + " " + vehiculo.getModelo() + " vendido exitosamente a " + cliente.getNombre() + ".");
    }

    // Método para listar las ventas realizadas
    public void listarVentas() {
        System.out.println("Historial de Ventas:");
        for (Venta venta : listaVentas) {
            System.out.println("- Vehículo: " + venta.getVehiculo().getMarca() + " " + venta.getVehiculo().getModelo() +
                               ", Cliente: " + venta.getCliente().getNombre() +
                               ", Fecha de Venta: " + venta.getFechaVenta());
        }
    }

    // Método para comprar un vehículo
    public void comprarVehiculo(Vehiculo vehiculo, Cliente cliente) {
        // Verificar si el vehículo ha pasado la revisión técnica
        if (!vehiculo.isRevisionTecnica()) {
            System.out.println("Error: El vehículo " + vehiculo.getMarca() + " " + vehiculo.getModelo() + " no ha pasado la revisión técnica.");
            return;
        }

        // Registrar la compra
        Compra compra = new Compra(vehiculo, cliente);
        listaCompras.add(compra);

        // Añadir el vehículo al inventario
        inventarioVehiculos.add(vehiculo);
        System.out.println("Vehículo " + vehiculo.getMarca() + " " + vehiculo.getModelo() + " comprado exitosamente de " + cliente.getNombre() + ".");
    }

    // Método para listar las compras realizadas
    public void listarCompras() {
        System.out.println("Historial de Compras:");
        for (Compra compra : listaCompras) {
            System.out.println("- Vehículo: " + compra.getVehiculo().getMarca() + " " + compra.getVehiculo().getModelo() +
                               ", Cliente: " + compra.getCliente().getNombre() +
                               ", Fecha de Compra: " + compra.getFechaCompra());
        }
    }

}

    

