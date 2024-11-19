package co.edu.uniquindio.poo;

public abstract class Vehiculo {

    private final String marca;
    private final Estado estado;    
    private final String modelo;
    private final double topSpeed;
    private final double cilindraje;
    private final int numeroPasajeros;
    private final TipoCombustible tipoCombustible;    
    private final Transmision transmision;
    private boolean revisionTecnicoMecanica;

    public Vehiculo(String marca, Estado estado, String modelo, double topSpeed, double cilindraje, int numeroPasajeros,
            TipoCombustible tipoCombustible, Transmision transmision, boolean revisionTecnicoMecanica) {
        this.marca = marca;
        this.estado = estado;
        this.modelo = modelo;
        this.topSpeed = topSpeed;
        this.cilindraje = cilindraje;
        this.numeroPasajeros = numeroPasajeros;
        this.tipoCombustible = tipoCombustible;
        this.transmision = transmision;
        this.revisionTecnicoMecanica = true;
    }

    public String getMarca() {
        return marca;
    }

    public Estado getEstado() {
        return estado;
    }

    public String getModelo() {
        return modelo;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public Transmision getTransmision() {
        return transmision;
    }

    public void setRevisionTecnica(boolean revisionTecnicoMecanica) {
        this.revisionTecnicoMecanica = revisionTecnicoMecanica;
    }

    public boolean isRevisionTecnica() {
        return revisionTecnicoMecanica;
    }

    

    
    

    

    
}
