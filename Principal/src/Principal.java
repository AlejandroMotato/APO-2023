import java.util.Scanner;

// nombre clase
public class Principal {

	// metodo principal
	public static void main(String[] args) {

		// para llamar de otro metodo
		System.out.println(contarPalabras()); 
	}

	public static String contarPalabras() {
		System.out.println("ingrese la palabra");

		// permite capturar datos por consola
		Scanner sc = new Scanner(System.in);

		String prueba = sc.next();
		
		return "la cantidad de letras es : " + prueba.toUpperCase();
		
		

	}
}
