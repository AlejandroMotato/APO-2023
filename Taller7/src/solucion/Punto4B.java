package solucion;

public class Punto4B {

	
		  public static void main(String[] args) {
		    int width = 5;
		    int height = 10;
		    int rectanguloarea = calculateRectangleArea(width, height);
		    int areacuadrada = calculateRectangleArea(width, width);
		    System.out.println("A del rectángulo: " + rectanguloarea);
		    System.out.println("A del cuadrado: " + areacuadrada);
		  }

		  public static int calculateRectangleArea(int width, int height) {
		    return width * height;
		  }
		}

	
	
}
