package primeraClase;

import java.util.Scanner;

public class ejercicio5 {
    // Ejercicio de numeros primos
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();

        boolean esPrimo = true; // asumimos que es primo

        if (n <= 1) {
            esPrimo = false; // 0 y 1 no son primos
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    esPrimo = false; // encontramos un divisor
                    break; // no hace falta seguir
                }
            }
        }

        if (esPrimo) {
            System.out.println(n + " es primo");
        } else {
            System.out.println(n + " no es primo");
        }

        sc.close(); // opcional si no se leen más datos
    }
}
