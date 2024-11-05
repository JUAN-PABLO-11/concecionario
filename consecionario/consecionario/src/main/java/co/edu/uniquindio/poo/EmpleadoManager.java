package co.edu.uniquindio.poo;

import java.util.List;
import java.util.ArrayList;

public class EmpleadoManager {
    private List<Empleado> empleados;

    public EmpleadoManager() {
        this.empleados = new ArrayList<>();
    }

    public void registrarEmpleado(Empleado empleado) throws EmpleadoException {
        for (Empleado e : empleados) {
            if (e.getNombre().equalsIgnoreCase(empleado.getNombre())) {
                throw new EmpleadoException("Error: El empleado ya está registrado.");
            }
        }
        empleados.add(empleado);
        System.out.println("Empleado registrado exitosamente.");
    }

    public void actualizarEmpleado(Empleado empleado, String nuevoNombre) throws EmpleadoException {
        if (!empleados.contains(empleado)) {
            throw new EmpleadoException("Error: El empleado no existe.");
        }
        empleado.setNombre(nuevoNombre);
        System.out.println("Empleado actualizado exitosamente.");
    }

    public void bloquearEmpleado(Empleado empleado) throws EmpleadoException {
        if (!empleados.contains(empleado)) {
            throw new EmpleadoException("Error: El empleado no existe.");
        }
        empleado.setActivo(false);
        System.out.println("Empleado bloqueado exitosamente.");
    }
    
}
