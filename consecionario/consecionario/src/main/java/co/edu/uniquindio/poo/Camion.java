package co.edu.uniquindio.poo;

public class Camion extends Vehiculo {
    private final int capacidadCarga;
    private final boolean aireAcondicionado;
    private final boolean frenosAire;
    private final boolean abs;
    private final int numeroEjes;
    private final String tipoCamion;

    public Camion(String marca, Estado estado, String modelo, double topSpeed, double cilindraje, int numeroPasajeros,
            TipoCombustible tipoCombustible, Transmision transmision, boolean revisionTecnicoMecanica,
            int capacidadCarga, boolean aireAcondicionado, boolean frenosAire, boolean abs, int numeroEjes,
            String tipoCamion) {
        super(marca, estado, modelo, topSpeed, cilindraje, numeroPasajeros, tipoCombustible, transmision,
        revisionTecnicoMecanica);
        this.capacidadCarga = capacidadCarga;
        this.aireAcondicionado = aireAcondicionado;
        this.frenosAire = frenosAire;
        this.abs = abs;
        this.numeroEjes = numeroEjes;
        this.tipoCamion = tipoCamion;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public boolean isFrenosAire() {
        return frenosAire;
    }

    public boolean isAbs() {
        return abs;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public String getTipoCamion() {
        return tipoCamion;
    }
}
