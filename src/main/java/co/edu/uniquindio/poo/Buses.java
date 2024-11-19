package co.edu.uniquindio.poo;

public class Buses extends Vehiculo {
    private final boolean aireAcondicionado;
    private final boolean camaraReversa;
    private final int airBags;
    private final boolean abs;
    private final int numeroEjes;
    private final int numeroSalidasEmergencia;

    public Buses(String marca, Estado estado, String modelo, double topSpeed, double cilindraje, int numeroPasajeros,
            TipoCombustible tipoCombustible, Transmision transmision, boolean revisionTecnicoMecanica,
            boolean aireAcondicionado, boolean camaraReversa, int airBags, boolean abs, int numeroEjes,
            int numeroSalidasEmergencia) {
        super(marca, estado, modelo, topSpeed, cilindraje, numeroPasajeros, tipoCombustible, transmision,
        revisionTecnicoMecanica);
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.airBags = airBags;
        this.abs = abs;
        this.numeroEjes = numeroEjes;
        this.numeroSalidasEmergencia = numeroSalidasEmergencia;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    public int getAirBags() {
        return airBags;
    }

    public boolean isAbs() {
        return abs;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public int getNumeroSalidasEmergencia() {
        return numeroSalidasEmergencia;
    }    
}
