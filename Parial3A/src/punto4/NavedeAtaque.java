package punto4;

public class NavedeAtaque {
    private String piloto;
    private int velocidad;
    private int escudos;
    private int energia;
    private int municion;
    
    public NavedeAtaque(String piloto) {
        this.piloto = piloto;
        this.velocidad = 80;
        this.escudos = 100;
        this.energia = 80;
        this.municion = 50;
    }
    
    public void moverse(String direccion) {
        System.out.println("Nave de combate se mueve en dirección " + direccion);
    }
    
    public void atacar() {
        if (this.municion > 0) {
            System.out.println("Nave de combate dispara sus cañones láser.");
            this.municion--;
        } else {
            System.out.println("Nave de combate sin munición.");
        }
    }
    
    public void reportar() {
        System.out.println("Nave de combate pilotada por " + this.piloto);
    }
    
    public void sobreescritura() {
        System.out.println("Nave de combate ha activado la sobreescritura.");
    }
    
    public String toString() {
        return "Nave de combate pilotada por " + this.piloto;
}
}