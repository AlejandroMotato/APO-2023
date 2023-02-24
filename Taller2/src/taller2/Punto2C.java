package taller2;

import java.util.Scanner;

public class Punto2C {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("digite el valor de x: ");
	        double x = sc.nextDouble();

	        double c = 4;
			double c1 = Math.sqrt(4 * Math.pow(c, 6) - Math.pow(c, 2) * Math.pow(Math.sin(x), 2));
	        System.out.println("El valor c es: " + c);
	    }
	}


