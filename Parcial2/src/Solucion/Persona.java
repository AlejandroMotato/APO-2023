package Solucion;

	
	import java.util.Scanner;

	public class Persona {
	    private String nombre;
	    private int edad;
	    private char sexo;
	    private double peso;
	    private double altura;
	    private int dni;
	    private final String[] LETRAS_DNI = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

	    public Persona() {
	        this.nombre = "";
	        this.edad = 0;
	        this.sexo = 'H';
	        this.peso = 0;
	        this.altura = 0;
	        generaDNI();
	    }

	    public Persona(String nombre, int edad, char sexo) {
	        this.nombre = nombre;
	        this.edad = edad;
	        this.sexo = comprobarSexo(sexo);
	        this.peso = 0;
	        this.altura = 0;
	        generaDNI();
	    }

	    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
	        this.nombre = nombre;
	        this.edad = edad;
	        this.sexo = comprobarSexo(sexo);
	        this.peso = peso;
	        this.altura = altura;
	        generaDNI();
	    }

	    public int calcularIMC() {
	        double imc = peso / Math.pow(altura, 2);
	        if (imc < 20) {
	            return -1;
	        } else if (imc >= 20 && imc <= 25) {
	            return 0;
	        } else {
	            return 1;
	        }
	    }

	    public boolean esMayorDeEdad() {
	        return edad >= 18;
	    }

	    private char comprobarSexo(char sexo) {
	        if (sexo == 'H' || sexo == 'M') {
	            return sexo;
	        } else {
	            return 'H';
	        }
	    }

	    public String toString() {
	        return "Nombre: " + nombre + "\n" +
	               "Edad: " + edad + "\n" +
	               "DNI: " + dni + "\n" +
	               "Sexo: " + sexo + "\n" +
	               "Peso: " + peso + " kg\n" +
	               "Altura: " + altura + " m\n" +
	               "IMC: " + calcularIMC();
	    }

	    private void generaDNI() {
	        int numeroDNI = (int) (Math.random() * 100000000);
	        int indiceLetraDNI = numeroDNI % 23;
	        char letraDNI = LETRAS_DNI[indiceLetraDNI].charAt(0);
	        String dni = Integer.toString(numeroDNI) + letraDNI;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public void setEdad(int edad) {
	        this.edad = edad;
	    }

	    public void setSexo(char sexo) {
	        this.sexo = comprobarSexo(sexo);
	    }

	    public void setPeso(double peso) {
	        this.peso = peso;
	    }

	    public void setAltura(double altura) {
	        this.altura = altura;
	    }
	}

	

	


