package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Transaccion {
    public enum TipoTransaccion {
        COMPRA,
        VENTA,
        ALQUILER
    }

    private TipoTransaccion tipo;
    private Vehiculo vehiculo;
    private Cliente cliente;
    private LocalDate fecha;

    public Transaccion(TipoTransaccion tipo, Vehiculo vehiculo, Cliente cliente) {
        this.tipo = tipo;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.fecha = LocalDate.now(); // Fecha actual de la transacción
    }

    public TipoTransaccion getTipo() {
        return tipo;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }
    
}
