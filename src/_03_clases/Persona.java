package _03_clases;

public class Persona {
    String nombre;
    int edad;
    int[] numerosFavoritos = { 5, 2, 3, 4, 5 };

    void saludar() {
        System.out.println("Hola! mi nombre es " + this.nombre + " y tengo " + this.edad + " años.");
    }

    public static void despedirse() {
        System.out.println("Adiós!");
    }
}
