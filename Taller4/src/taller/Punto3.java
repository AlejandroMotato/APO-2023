package taller;

	import java.util.Scanner;

	public class Punto3 {

	    public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);

	        System.out.print("digite su peso en la Tierra (lbs): ");
	        double peso = input.nextDouble();

	        System.out.println("Seleccione un planeta: ");
	        System.out.println("1. Mercurio");
	        System.out.println("2. Venus");
	        System.out.println("3. Marte");
	        System.out.println("4. Júpiter");
	        System.out.println("5. Saturno");
	        System.out.println("6. Urano");
	        System.out.println("7. Neptuno");
	        System.out.print("Opción: ");
	        int opcion = input.nextInt();

	        double factorConversion = 0.0;
	        String planeta = "";

	        switch (opcion) {
	            case 1:
	                factorConversion = 0.38;
	                planeta = "Mercurio";
	                break;
	            case 2:
	                factorConversion = 0.91;
	                planeta = "Venus";
	                break;
	            case 3:
	                factorConversion = 0.38;
	                planeta = "Marte";
	                break;
	            case 4:
	                factorConversion = 2.36;
	                planeta = "Júpiter";
	                break;
	            case 5:
	                factorConversion = 0.92;
	                planeta = "Saturno";
	                break;
	            case 6:
	                factorConversion = 0.89;
	                planeta = "Urano";
	                break;
	            case 7:
	                factorConversion = 1.13;
	                planeta = "Neptuno";
	                break;
	            default:
	                System.out.println("Opción no encontrada.");
	                input.close();
	                return;
	        }

	        double pesoEnPlaneta = peso * factorConversion;

	        System.out.printf("Su peso en %s es %.2f lbs.", planeta, pesoEnPlaneta);

	        input.close();

	    }

	}



