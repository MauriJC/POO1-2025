package _01_introduccion;

public class CicloWhile {
    // while (condición) {
    // instrucciones a repetir
    // }

    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println("Número: " + i);
            i = i + 1; // incrementar manualmente
        }
    }
}