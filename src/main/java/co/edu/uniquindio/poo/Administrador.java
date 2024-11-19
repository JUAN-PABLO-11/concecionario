package co.edu.uniquindio.poo;

public class Administrador {
    private EmpleadoManager empleadoManager;
    private SeguridadManager seguridadManager;
    private ReporteManager reporteManager;

    public Administrador() {
        this.empleadoManager = new EmpleadoManager();
        this.seguridadManager = new SeguridadManager();
        this.reporteManager = new ReporteManager();
    }

    public EmpleadoManager getEmpleadoManager() {
        return empleadoManager;
    }

    public SeguridadManager getSeguridadManager() {
        return seguridadManager;
    }

    public ReporteManager getReporteManager() {
        return reporteManager;
    }
}
