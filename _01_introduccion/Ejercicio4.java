package _01_introduccion;

import java.util.Scanner;

public class Ejercicio4 {
    // Determina si un número entero ingresado por el usuario es par o impar
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " es par");
        } else {
            System.out.println(n + " es impar");
        }
    }
}