package Solucion;

	import java.util.Scanner;

	public class Punto2 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	       
	        System.out.print("Introduce el nombre: ");
	        String nombre = sc.nextLine();

	        System.out.print("Introduce la edad: ");
	        int edad = sc.nextInt();

	        System.out.print("Introduce el sexo (H/M): ");
	        char sexo = sc.next().charAt(0);

	        System.out.print("Introduce el peso en kg: ");
	        double peso = sc.nextDouble();

	        System.out.print("Introduce la altura en metros: ");
	        double altura = sc.nextDouble();


	        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
	        Persona persona2 = new Persona(nombre, edad, sexo);
	        Persona persona3 = new Persona();

	    
	        int imcPersona1 = persona1.calcularIMC();
	        int imcPersona2 = persona2.calcularIMC();
	        int imcPersona3 = persona3.calcularIMC();

	   
	        String mensajePersona1 = mensajeIMC(imcPersona1);
	        String mensajePersona2 = mensajeIMC(imcPersona2);
	        String mensajePersona3 = mensajeIMC(imcPersona3);


	        boolean mayorDeEdad1 = persona1.esMayorDeEdad();
	        boolean mayorDeEdad2 = persona2.esMayorDeEdad();
	        boolean mayorDeEdad3 = persona3.esMayorDeEdad();

	       	        System.out.println("Persona 1:");
	        System.out.println(persona1.toString());
	        System.out.println("IMC: " + mensajePersona1);
	        System.out.println("Mayor de edad: " + mayorDeEdad1);

	        System.out.println("Persona 2:");
	        System.out.println(persona2.toString());
	        System.out.println("IMC: " + mensajePersona2);
	        System.out.println("Mayor de edad: " + mayorDeEdad2);

	        System.out.println("Persona 3:");
	        System.out.println(persona3.toString());
	        System.out.println("IMC: " + mensajePersona3);
	        System.out.println("Mayor de edad: " + mayorDeEdad3);

	        sc.close();
	    }

	    public static String mensajeIMC(int imc) {
	        String mensaje;

	        switch (imc) {
	            case -1:
	                mensaje = "Por debajo de su peso ideal";
	                break;
	            case 0:
	                mensaje = "En su peso ideal";
	                break;
	            case 1:
	                mensaje = "Con sobrepeso";
	                break;
	            default:
	                mensaje = "Error en el cálculo del IMC";
	                break;
	        }

	        return mensaje;
	    }
	}

// CUANDO DIGITE LOS DATOS NO PONGA PUNTOS NI LAS UNIDADES DE PESO :D //
