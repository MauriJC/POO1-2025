package _01_introduccion.ciclos;

public class Pares {
    public static void main(String[] args) {
        int cantidadPares = 0;
        // Imprimir números pares del 1 al 10 usando for
        System.out.println("Números pares del 1 al 10 (for):");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                cantidadPares++;
            }
        }
        System.out.println("Cantidad de números pares (for): " + cantidadPares);

        cantidadPares = 0;
        // Imprimir números pares del 1 al 10 usando while
        System.out.println("Números pares del 1 al 10 (while):");
        int j = 1;
        while (j <= 10) {
            if (j % 2 == 0) {
                System.out.println(j);
                cantidadPares++;
            }
            j++; // Incrementar j j= j+1
        }
        System.out.println("Cantidad de números pares (while): " + cantidadPares);
    }
}
