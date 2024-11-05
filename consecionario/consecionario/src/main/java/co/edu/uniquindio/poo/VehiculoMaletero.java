package co.edu.uniquindio.poo;

public abstract class VehiculoMaletero extends Vehiculo {
    private final double capacidadMaletero;
    private final int numeroPuertas;

    public VehiculoMaletero(String marca, Estado estado, String modelo, double topSpeed, double cilindraje,
            int numeroPasajeros, TipoCombustible tipoCombustible, Transmision transmision,
            boolean revisionTecnicoMecanica, double capacidadMaletero, int numeroPuertas) {
        super(marca, estado, modelo, topSpeed, cilindraje, numeroPasajeros, tipoCombustible, transmision,
        revisionTecnicoMecanica);
        this.capacidadMaletero = capacidadMaletero;
        this.numeroPuertas = numeroPuertas;
    }

    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }  
    
}
