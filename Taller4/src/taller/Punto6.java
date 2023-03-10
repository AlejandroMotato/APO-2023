package taller;

import java.util.Scanner;

public class Punto6 {
    public static void main(String[] args) {
        double altura, largo, ancho, areaTotal, areaParedes, areaTecho;
        int botes5L, botes1L, botesOptimos;

        Scanner sc = new Scanner(System.in);

        System.out.println("digite la altura de la habitación en metros: ");
        altura = sc.nextDouble();
        System.out.println("digite el largo de la habitación en metros: ");
        largo = sc.nextDouble();
        System.out.println("digite el ancho de la habitación en metros: ");
        ancho = sc.nextDouble();

        areaParedes = 2 * altura * (largo + ancho);
        areaTecho = largo * ancho;
        areaTotal = areaParedes + areaTecho;

        botes5L = (int) Math.ceil(areaTotal / 1500);
        botes1L = (int) Math.ceil(areaTotal / 300);

        System.out.println("Se necesitan " + botes5L + " botes de 5L o " + botes1L + " botes de 1L para pintar el cuarto.");

        botesOptimos = (int) Math.ceil(botes5L / 5.0);
        System.out.println("Se recomienda comprar " + botesOptimos + " botes de 5L para ahorrar mas dinero.");
    }


	}


