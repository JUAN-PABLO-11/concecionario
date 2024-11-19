package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.List;
import java.util.logging.Logger;

public class ReporteManager {

    private static final Logger logger = Logger.getLogger(ReporteManager.class.getName());

    public void generarReporte(Empleado empleado, LocalDate inicio, LocalDate fin) {
        // Obtención de las transacciones del empleado
        List<Transaccion> transacciones = empleado.getHistorialTransacciones();

        // Registro del encabezado del reporte
        logger.info("Reporte de transacciones para " + empleado.getNombre() + ":");

        // Iteración sobre las transacciones
        for (Transaccion t : transacciones) {
            // Comprobamos si la transacción está dentro del rango de fechas
            if ((t.getFecha().isAfter(inicio) || t.getFecha().isEqual(inicio)) &&
                (t.getFecha().isBefore(fin) || t.getFecha().isEqual(fin))) {
                // Si la transacción es válida, la mostramos en el log
                logger.info("Transacción: " + t);
            }
        }
    }
}

