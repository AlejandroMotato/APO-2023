package taller2;

import java.util.Scanner;

public class Punto1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("digite la base del triángulo: ");
        double base = input.nextDouble();
        
        System.out.print("digite la altura del triángulo: ");
        double altura = input.nextDouble();
        
        double A = (base * altura) / 2;
        System.out.println("area del triangulo es: " + A);
    }
}
