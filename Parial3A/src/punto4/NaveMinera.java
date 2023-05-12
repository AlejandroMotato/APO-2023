package punto4;

public class NaveMinera {
    private String piloto;
    private int velocidad;
    private int escudos;
    private int energia;
    private int capacidadCarga;
    private String[] herramientas;
    
    public NaveMinera(String piloto) {
        this.piloto = piloto;
        this.velocidad = 60;
        this.escudos = 120;
        this.energia = 100;
        this.capacidadCarga = 500;
        this.herramientas = new String[]{"taladro", "excavadora", "rayo tractor"};
    }
    
    public void moverse(String direccion) {
        System.out.println("Nave de minería se mueve en dirección " + direccion);
    }
    
    public void minar() {
        System.out.println("Nave de minería está utilizando sus herramientas de minería.");
    }
    
    public void reportar() {
        System.out.println("Nave de minería pilotada por " + this.piloto);
    }
    
    public void sobreescrir() {
    	this.velocidad += 10;
    	System.out.println("¡Sobreescritura activada! Velocidad aumentada en 10.");
    	}

    public String toString() {
        return "Nave de minería pilotada por " + this.piloto;
    }



}
