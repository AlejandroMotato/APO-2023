package Taller;

public class Punto3 {

		  public static void main(String[] args) {
		    Animal animal1 = new Animal();
		    Animal animal2 = new Animal(60, 5, 3);

		    System.out.println("El animal 1 tiene una velocidad de " + animal1.getSpeed() + ".");
		    System.out.println("El animal 2 tiene una velocidad de " + animal2.getSpeed() + ".");
		  }
		}
