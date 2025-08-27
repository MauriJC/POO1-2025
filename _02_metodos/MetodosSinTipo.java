package _02_metodos;

/**
 * public static void saludar(...) no retorna nada, solo ejecuta.
 *
 * Se llama con MetodosSinTipo.saludar("Mauricio");.
 */

public class MetodosSinTipo {

    // Método estático sin tipo: solo imprime un mensaje
    public static void saludar(String nombre) {
        System.out.println("¡Hola, " + nombre + "!");
    }

    public static void main(String[] args) {
        // Llamamos directamente al método sin crear objeto
        MetodosSinTipo.saludar("Mauricio");
    }

}
