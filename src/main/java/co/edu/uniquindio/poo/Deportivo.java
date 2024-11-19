package co.edu.uniquindio.poo;

public class Deportivo extends Vehiculo {
    private final int numeroPuertas;
    private final int airbags;
    private final int caballos;
    private final String ceroAcien;

    public Deportivo(String marca, Estado estado, String modelo, double topSpeed, double cilindraje,
            int numeroPasajeros, TipoCombustible tipoCombustible, Transmision transmision,
            boolean revisionTecnicoMecanica, int numeroPuertas, int airbags, int caballos, String ceroAcien) {
        super(marca, estado, modelo, topSpeed, cilindraje, numeroPasajeros, tipoCombustible, transmision,
        revisionTecnicoMecanica);
        this.numeroPuertas = numeroPuertas;
        this.airbags = airbags;
        this.caballos = caballos;
        this.ceroAcien = ceroAcien;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public int getAirbags() {
        return airbags;
    }

    public int getCaballos() {
        return caballos;
    }

    public String getCeroAcien() {
        return ceroAcien;
    }

    

    
    
}
