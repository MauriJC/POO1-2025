package primeraClase.ciclos;

import java.util.Scanner;

class numerosDeUnoAEne {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número N: ");
        int N = sc.nextInt();

        // Con for
        int suma = 0;
        for (int i = 1; i <= N; i++) {
            suma += i;
        }
        System.out.println("La suma es: " + suma);

        // Con while
        int suma2 = 0;
        int j = 1;
        while (j <= N) {
            suma2 += j;
            j++;
        }
        System.out.println("La suma (while) es: " + suma2);

    }
}