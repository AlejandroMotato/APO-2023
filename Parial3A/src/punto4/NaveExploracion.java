package punto4;

public class NaveExploracion {
	
	    private String piloto;
	    private int velocidad;
	    private int escudos;
	    private int energia;
	    private String[] sensores;
	    
	    public NaveExploracion(String piloto) {
	        this.piloto = piloto;
	        this.velocidad = 100;
	        this.escudos = 50;
	        this.energia = 100;
	        this.sensores = new String[]{"radar", "telescopio", "sonda"};
	    }
	    
	    public void moverse(String direccion) {
	        System.out.println("Nave de exploración se mueve en dirección " + direccion);
	    }
	    
	    public void escanear() {
	        for (String sensor : this.sensores) {
	            System.out.println("Nave de exploración está usando el sensor " + sensor);
	        }
	    }
	    
	    public void reportar() {
	        System.out.println("Nave de exploración pilotada por " + this.piloto);
	    }
	    
	    public void sobrecarga() {
	        this.velocidad *= 2;
	        System.out.println("¡Sobrecarga activada! Velocidad aumentada al doble.");
	    }
	    
	    public String toString() {
	        return "Nave de exploración pilotada por " + this.piloto;
	    }
	

}

