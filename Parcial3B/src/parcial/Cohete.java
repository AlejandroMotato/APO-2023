package parcial;

public class Cohete extends NaveEspacial {
    private String propulsor;

    public Cohete(double peso, double capacidad, double velocidadMaxima, String propulsor) {
        super(peso, capacidad, velocidadMaxima);
        this.propulsor = propulsor;
    }

    public String getPropulsor() {
        return propulsor;
    }

    public void setPropulsor(String propulsor) {
        this.propulsor = propulsor;
    }

    public void despegar() {
        System.out.println("El cohete está despegando.");
    }

    public void aterrizar() {
        System.out.println("El cohete está aterrizando.");
    }
}