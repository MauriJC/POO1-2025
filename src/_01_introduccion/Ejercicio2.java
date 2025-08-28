package _01_introduccion;

import java.util.Scanner;

public class Ejercicio2 {
    // Suma dos números enteros ingresados por el usuario
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingrese segundo número: ");
        int b = sc.nextInt();
        System.out.println("La suma es: " + (a + b));
    }
}
