package taller2;

import java.util.Scanner;

public class Punto3 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int numPer = 0;
	        int numAuto = 0;
	        
	        
	        System.out.print("digite el número de personas que se han apuntado: ");
	        numPer= sc.nextInt();
	        
	        
	        numAuto = numPer / 45;
	        if (numPer % 45 != 0) {
	            numAuto++;
	        }
	        
	      
	        System.out.println("cantidad de buses que se necesitan: " + numAuto);
	        
	        // 
	        int numFurgo = numPer % 45;
	        if (numFurgo == 0) {
	            System.out.println("Todos los pasajeros podrán ir en autobús.");
	        } else {
	            System.out.println("el numero de personas que tendrian que viajar en furgonetas son: " + numFurgo);
	        }
	        
	        sc.close();
	    }
	}

	

