package primeraClase;
import java.util.Scanner;

/*
 * PROBLEMAS COMUNES CON SCANNER:
 * 
 * 1. InputMismatchException:
 *    - Occurs cuando intentas leer un tipo de dato pero el input no coincide
 *    - Ejemplo: esperas int pero usuario ingresa "abc"
 * 
 * 2. Problema de Buffer:
 *    - next(), nextInt(), nextDouble(), etc. NO consumen el salto de línea (\n)
 *    - nextLine() SÍ consume todo hasta el salto de línea
 *    - Solución: usar nextLine() después de métodos que no consumen \n
 */

public class tiposDeScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- Leer String ---
        System.out.print("Ingrese su nombre completo: ");
        String nombre = sc.nextLine();  // toda la línea - CONSUME el \n
        System.out.println("Hola, " + nombre + "!");

        System.out.print("Ingrese su primer nombre: ");
        String primerNombre = sc.next();  // solo hasta el primer espacio - NO CONSUME el \n
        System.out.println("Primer nombre: " + primerNombre);
        
        // IMPORTANTE: Limpiar el buffer después de sc.next()
        sc.nextLine(); // Consume el salto de línea restante (\n)

        // --- Leer enteros ---
        System.out.print("Ingrese su edad (int): ");
        int edad = sc.nextInt(); // NO consume el \n
        System.out.println("Edad: " + edad);
        sc.nextLine(); // Limpiar buffer

        System.out.print("Ingrese un número largo (long): ");
        long numeroGrande = sc.nextLong(); // NO consume el \n
        System.out.println("Número largo: " + numeroGrande);
        sc.nextLine(); // Limpiar buffer

        // --- Leer decimales ---
        System.out.print("Ingrese su altura (float): ");
        float altura = sc.nextFloat(); // NO consume el \n
        System.out.println("Altura: " + altura);
        sc.nextLine(); // Limpiar buffer

        System.out.print("Ingrese su peso (double): ");
        double peso = sc.nextDouble(); // NO consume el \n
        System.out.println("Peso: " + peso);
        sc.nextLine(); // Limpiar buffer

        // --- Leer booleanos ---
        System.out.print("¿Es estudiante? (true/false): ");
        boolean esEstudiante = sc.nextBoolean(); // NO consume el \n
        System.out.println("Es estudiante: " + esEstudiante);
        sc.nextLine(); // Limpiar buffer

        // --- Leer un solo caracter (no hay nextChar, usamos String y charAt) ---
        System.out.print("Ingrese la inicial de su nombre: ");
        char inicial = sc.next().charAt(0); // NO consume el \n
        System.out.println("Inicial: " + inicial);

        sc.close(); // opcional si no van a leer más
    }
}
