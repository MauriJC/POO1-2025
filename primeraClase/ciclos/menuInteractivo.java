package primeraClase.ciclos;

import java.util.Scanner;

public class menuInteractivo {
    public static void main(String[] args) {
        int opcion;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1) Sumar dos números");
            System.out.println("2) Calcular promedio de 3 notas");
            System.out.println("3) Salir");
            System.out.print("Elija opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese primer número: ");
                    int a = sc.nextInt();
                    System.out.print("Ingrese segundo número: ");
                    int b = sc.nextInt();
                    System.out.println("Suma = " + (a + b));
                    break;
                case 2:
                    double sumaNotas = 0;
                    for (int i = 1; i <= 3; i++) {
                        System.out.print("Ingrese nota " + i + ": ");
                        double nota = sc.nextDouble();
                        sumaNotas += nota;
                    }
                    double promedio = sumaNotas / 3;
                    System.out.println("Promedio = " + promedio);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 3);

        sc.close();

    }

}
