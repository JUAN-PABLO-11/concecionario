package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Compra {
    private Vehiculo vehiculo;
    private Cliente cliente;
    private LocalDate fechaCompra;

    public Compra(Vehiculo vehiculo, Cliente cliente) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.fechaCompra = LocalDate.now();
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }
}
