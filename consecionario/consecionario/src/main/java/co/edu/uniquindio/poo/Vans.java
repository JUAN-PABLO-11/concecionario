package co.edu.uniquindio.poo;

public class Vans extends VehiculoMaletero {
    private final int bolsasAire;
    private final boolean aireAcondicionado;
    private final boolean camaraReversa;
    private final int numeroBolsasAire;
    private final boolean abs;

    public Vans(String marca, Estado estado, String modelo, double topSpeed, double cilindraje, int numeroPasajeros,
            TipoCombustible tipoCombustible, Transmision transmision, boolean revisionTecnicoMecanica,
            double capacidadMaletero, int numeroPuertas, int bolsasAire, boolean aireAcondicionado,
            boolean camaraReversa, int numeroBolsasAire, boolean abs) {
        super(marca, estado, modelo, topSpeed, cilindraje, numeroPasajeros, tipoCombustible, transmision,
        revisionTecnicoMecanica, capacidadMaletero, numeroPuertas);
        this.bolsasAire = bolsasAire;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.numeroBolsasAire = numeroBolsasAire;
        this.abs = abs;
    }

    public int getBolsasAire() {
        return bolsasAire;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    public int getNumeroBolsasAire() {
        return numeroBolsasAire;
    }

    public boolean isAbs() {
        return abs;
    }
}
