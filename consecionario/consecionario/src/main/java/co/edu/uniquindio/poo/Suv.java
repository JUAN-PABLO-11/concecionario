package co.edu.uniquindio.poo;

public class Suv extends VehiculoMaletero{
    private final boolean aireAcondicionado;
    private final boolean camaraReversa;
    private final boolean controlCrucero;
    private final int airbags;
    private final boolean abs;
    private final boolean sensorColision;
    private final boolean sensorTrafico;
    private final boolean asistentePermanencia;
    private final boolean traccion4x4;

    public Suv(String marca, Estado estado, String modelo, double topSpeed, double cilindraje, int numeroPasajeros,
            TipoCombustible tipoCombustible, Transmision transmision, boolean revisionTecnicoMecanica,
            double capacidadMaletero, int numeroPuertas, boolean aireAcondicionado, boolean camaraReversa,
            boolean controlCrucero, int airbags, boolean abs, boolean sensorColision, boolean sensorTrafico,
            boolean asistentePermanencia, boolean traccion4x4) {
        super(marca, estado, modelo, topSpeed, cilindraje, numeroPasajeros, tipoCombustible, transmision,
        revisionTecnicoMecanica, capacidadMaletero, numeroPuertas);
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.controlCrucero = controlCrucero;
        this.airbags = airbags;
        this.abs = abs;
        this.sensorColision = sensorColision;
        this.sensorTrafico = sensorTrafico;
        this.asistentePermanencia = asistentePermanencia;
        this.traccion4x4 = traccion4x4;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    public boolean isControlCrucero() {
        return controlCrucero;
    }

    public int getAirbags() {
        return airbags;
    }

    public boolean isAbs() {
        return abs;
    }

    public boolean isSensorColision() {
        return sensorColision;
    }

    public boolean isSensorTrafico() {
        return sensorTrafico;
    }

    public boolean isAsistentePermanencia() {
        return asistentePermanencia;
    }

    public boolean isTraccion4x4() {
        return traccion4x4;
    }

    

    

    
}
