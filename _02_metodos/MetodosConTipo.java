package _02_metodos;

/**
 * static permite llamar al método con Clase.metodo() sin tener que
 * instanciar el objeto con new.
 *
 * public static int sumar(...) devuelve un entero.
 *
 * En main, se usa MetodosConTipo.sumar(5, 7).
 */

public class MetodosConTipo {

    // Método estático con tipo int: devuelve un número entero
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Llamamos directamente al método sumar sin crear objeto
        int resultado = MetodosConTipo.sumar(5, 7);

        System.out.println("El resultado de la suma es: " + resultado);
    }
}
