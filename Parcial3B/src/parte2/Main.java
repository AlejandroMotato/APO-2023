package parte2;

import java.util.Scanner;

import parcial.NaveEspacial;

public class Main {
    private static final int MAX_NAVES = 9;
    private static NaveEspacial[] inventario = new NaveEspacial[MAX_NAVES];
    private static int contadorNaves = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean terminar = false;

        while (!terminar) {
            System.out.println("¿Qué tipo de nave deseas crear?");
            System.out.println("1. Satélite");
            System.out.println("2. Cohete");
            System.out.println("3. Transbordador Espacial");
            System.out.println("4. Nave Interplanetaria");
            System.out.println("5. Mostrar inventario");
            System.out.println("6. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    crearSatelite();
                    break;
                case 2:
                    crearCohete();
                    break;
                case 3:
                    crearTransbordadorEspacial();
                    break;
                case 4:
                    crearNaveInterplanetaria();
                    break;
                case 5:
                    mostrarInventario();
                    break;
                case 6:
                    terminar = true;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
                    break;
            }
        }

        System.out.println("Programa finalizado.");
    }

    private static void crearSatelite() {
        // Código para crear un satélite y agregarlo al inventario
    }

    private static void crearCohete() {
        // Código para crear un cohete y agregarlo al inventario
    }

    private static void crearTransbordadorEspacial() {
        // Código para crear un transbordador espacial y agregarlo al inventario
    }

    private static void crearNaveInterplanetaria() {
        // Código para crear una nave interplanetaria y agregarla al inventario
    }

    private static void agregarNave(NaveEspacial nave) {
        if (contadorNaves < MAX_NAVES) {
            inventario[contadorNaves] = nave;
            contadorNaves++;
            System.out.println("Nave agregada al inventario.");
        } else {
            System.out.println("El inventario de naves está lleno. No se puede agregar más naves.");
        }
    }

    private static void mostrarInventario() {
        if (contadorNaves == 0) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("Inventario de naves:");
            for (int i = 0; i < contadorNaves; i++) {
                System.out.println((i + 1) + ". " + inventario[i].getClass().getSimpleName());
            }
        }
    }
}