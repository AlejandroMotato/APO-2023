package solucion;


	import java.util.Scanner;

	public class Punto7 {
	    public static void main(String[] args) {
	      
	        double[] calificaciones = new double[5];
	        
	       
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Digite la calificación de la prueba 1: ");
	        calificaciones[0] = scanner.nextDouble();
	        System.out.println("Digite la calificación de la prueba 2: ");
	        calificaciones[1] = scanner.nextDouble();
	        System.out.println("Digite la calificación de la prueba 3: ");
	        calificaciones[2] = scanner.nextDouble();
	        System.out.println("Digite la calificación de la prueba 4: ");
	        calificaciones[3] = scanner.nextDouble();
	        System.out.println("Digite la calificación de la prueba 5: ");
	        calificaciones[4] = scanner.nextDouble();
	        
	        
	        double promedio = 0;
	        for (int i = 0; i < calificaciones.length; i++) {
	            promedio += calificaciones[i];
	        }
	        promedio /= calificaciones.length;
	        
	      
	        System.out.println("El promedio de las pruebas es: " + promedio);
	    }
	}

	

