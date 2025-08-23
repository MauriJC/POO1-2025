package primeraClase;
import java.util.Scanner;


public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese nota 1: ");
        double n1 = sc.nextDouble();
        System.out.print("Ingrese nota 2: ");
        double n2 = sc.nextDouble();
        System.out.print("Ingrese nota 3: ");
        double n3 = sc.nextDouble();
        double promedio = (n1 + n2 + n3) / 3;
        System.out.println("El promedio es: " + promedio);
    }
}
