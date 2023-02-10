import java.util.Scanner;


// nombre clase
public class Principal {
	
	
	




	//metodo principal
	public static void main(String[] args) {
		System.out.println("ingrese la palabra");
		
		//permite capturar datos por consola
		Scanner sc = new Scanner(System.in);
		
		String prueba = sc.next();
		System.out.println("la cantidad de letras es : " + prueba.toUpperCase());
		
		
	}
}
