package co.edu.uniquindio.poo;

public class Pickups extends VehiculoMaletero {
    private final boolean traccion4x4;
    private final boolean AireAcondicionado;
    private final boolean camaraReversa;
    private final int numeroAirbags;
    private final boolean abs;
    private int capacidadCajaCarga;

    public Pickups(String marca, Estado estado, String modelo, double topSpeed, double cilindraje, int numeroPasajeros,
            TipoCombustible tipoCombustible, Transmision transmision, boolean revisionTecnicoMecanica,
            double capacidadMaletero, int numeroPuertas, boolean traccion4x4, boolean aireAcondicionado,
            boolean camaraReversa, int numeroAirbags, boolean abs, int capacidadCajaCarga) {
        super(marca, estado, modelo, topSpeed, cilindraje, numeroPasajeros, tipoCombustible, transmision,
        revisionTecnicoMecanica, capacidadMaletero, numeroPuertas);
        this.traccion4x4 = traccion4x4;
        AireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.numeroAirbags = numeroAirbags;
        this.abs = abs;
        this.capacidadCajaCarga = capacidadCajaCarga;
    }

    public boolean isTraccion4x4() {
        return traccion4x4;
    }

    public boolean isAireAcondicionado() {
        return AireAcondicionado;
    }

    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    public int getNumeroAirbags() {
        return numeroAirbags;
    }

    public boolean isAbs() {
        return abs;
    }

    public int getCapacidadCajaCarga() {
        return capacidadCajaCarga;
    }

    public void setCapacidadCajaCarga(int capacidadCajaCarga) {
        this.capacidadCajaCarga = capacidadCajaCarga;
    }
}
