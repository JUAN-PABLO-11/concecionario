package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.List;

public class ReporteManager {
    public void generarReporte(Empleado empleado, LocalDate inicio, LocalDate fin) {
        List<Transaccion> transacciones = empleado.getHistorialTransacciones();

        System.out.println("Reporte de transacciones para " + empleado.getNombre() + ":");
        for (Transaccion t : transacciones) {
            if ((t.getFecha().isAfter(inicio) || t.getFecha().isEqual(inicio)) &&
                (t.getFecha().isBefore(fin) || t.getFecha().isEqual(fin))) {
                System.out.println("Transacción: " + t);
            }
        }
    }
}
