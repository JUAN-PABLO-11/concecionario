package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Venta {
    private Vehiculo vehiculo;
    private Cliente cliente;
    private LocalDate fechaVenta;

    public Venta(Vehiculo vehiculo, Cliente cliente) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.fechaVenta = LocalDate.now();
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }
}
