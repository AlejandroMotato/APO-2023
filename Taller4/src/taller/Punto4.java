package taller;

import java.util.Scanner;

public class Punto4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("digite su clasificación en su Colegio (1 para la más alta, 2 para la segunda más alta): ");
        int clasificacion = input.nextInt();

        System.out.print("digite el número de estudiantes de su Colegio: ");
        int numEstudiantes = input.nextInt();

        System.out.print("digite su nota media: ");
        double notaMedia = input.nextDouble();

        System.out.print("digite su puntuación SAT: ");
        int puntuacionSAT = input.nextInt();

        boolean cumpleRequisitos = false;

        if ((clasificacion == 1 || clasificacion == 2) && numEstudiantes >= 1400) {
            cumpleRequisitos = true;
        } else if (notaMedia >= 4.0 && puntuacionSAT >= 1100) {
            cumpleRequisitos = true;
        } else if (notaMedia >= 3.5 && puntuacionSAT >= 1300) {
            cumpleRequisitos = true;
        } else if (notaMedia >= 3.0 && puntuacionSAT >= 1500) {
            cumpleRequisitos = true;
        }

        if (cumpleRequisitos) {
            System.out.println("¡NOS COMPLACE RECIBIRLO! Cumpliste con tods los requisitos para ingresar en la Universidad de Mountville.");
        } else {
            System.out.println("Lo sieto no lograste quedar admitido, no cumples con todos los requisitos para ingresar en la Universidad de Mountville.");
        }

        input.close();

    }




	

	}


