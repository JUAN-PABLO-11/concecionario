package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Alquiler {
    private Vehiculo vehiculo;
    private Cliente cliente;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private boolean activo; // Indica si el alquiler está activo

    public Alquiler(Vehiculo vehiculo, Cliente cliente, LocalDate fechaInicio, LocalDate fechaFin) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.activo = true; // El alquiler está activo al ser creado
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public boolean isActivo() {
        return activo;
    }

    public void finalizarAlquiler() {
        this.activo = false;
    }
}
