package taller;

import java.util.Scanner;

public class Punto2B {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el primer digito: ");
        double num1 = input.nextDouble();

        System.out.print("Ingrese el segundo digito: ");
        double num2 = input.nextDouble();

        System.out.print("Ingrese el operador (+, -, *, /, %): ");
        char operador = input.next().charAt(0);

        double resultado = 0.0;

        if (operador == '+') {
            resultado = num1 + num2;
        } else if (operador == '-') {
            resultado = num1 - num2;
        } else if (operador == '*') {
            resultado = num1 * num2;
        } else if (operador == '/') {
            resultado = num1 / num2;
        } else if (operador == '%') {
            resultado = num1 % num2;
        } else {
            System.out.println("Operador no encontrado.");
            return;
        }

        System.out.println("El resultado es: " + resultado);

        input.close();

    }

}


	

	


