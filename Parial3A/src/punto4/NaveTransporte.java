package punto4;

public class NaveTransporte {
	
    private String piloto;
    private int velocidad;
    private int escudos;
    private int energia;
    private int capacidadCarga;
    private int capacidadPasajeros;
    
    public NaveTransporte(String piloto) {
        this.piloto = piloto;
        this.velocidad = 50;
        this.escudos = 150;
        this.energia = 100;
        this.capacidadCarga = 1000;
        this.capacidadPasajeros = 10;
    }
    
    public void moverse(String direccion) {
        System.out.println("Nave de transporte se mueve en dirección " + direccion);
    }
    
    public void cargar(int cantidad) {
        if (cantidad > this.capacidadCarga) {
            System.out.println("No se puede cargar toda la carga.");
        } else {
            System.out.println("Se han cargado " + cantidad + " unidades de carga.");
        }
    }
    
    public void desembarcar(int cantidad) {
        if (cantidad > this.capacidadPasajeros) {
            System.out.println("No se puede desembarcar a tanta gente.");
        } else {
            System.out.println("Se han desembarcado " + cantidad + " pasajeros.");
        }
    }
    
    public void reportar() {
        System.out.println("Nave de transporte pilotada por " + this.piloto);
    }
    
    public void sobrecarga() {
        this.velocidad *= 2;
        System.out.println("¡Sobrecarga activada! Velocidad aumentada al doble.");
    }
    
    public String toString() {
        return "Nave de transporte pilotada por " + this.piloto;
    }
}


