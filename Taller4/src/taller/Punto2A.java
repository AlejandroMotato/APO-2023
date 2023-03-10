package taller;

import java.util.Scanner;

public class Punto2A{
	

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("digite el primer digito: ");
        double num1 = input.nextDouble();

        System.out.print("digite el segundo digito: ");
        double num2 = input.nextDouble();

        System.out.print("Ingrese el operador (+, -, *, /, %): ");
        char operador = input.next().charAt(0);

        double resultado = 0.0;

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                resultado = num1 / num2;
                break;
            case '%':
                resultado = num1 % num2;
                break;
            default:
                System.out.println("Operador no encontrado.");
                return;
        }

        System.out.println("El resultado es: " + resultado);

        input.close();

    }

}



