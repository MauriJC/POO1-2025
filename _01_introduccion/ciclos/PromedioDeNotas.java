package _01_introduccion.ciclos;

import java.util.Scanner;

public class PromedioDeNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir cuántas notas se van a ingresar

        System.out.print("¿Cuántas notas desea ingresar? ");
        int n = sc.nextInt();

        double sumaNotas = 0;

        // Con for
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese nota " + i + ": ");
            double nota = sc.nextDouble();
            sumaNotas += nota;
        }
        double promedio = sumaNotas / n;
        System.out.println("El promedio es: " + promedio);

    }
}
