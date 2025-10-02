package _02_metodos.ejercicios;

import java.util.Random;

public class Sorteo {
    public static void main(String[] args) {
        // int resultado;
        // resultado = (int) (Math.random() * 7) + 1;
        // System.out.println("Número ganador: " + resultado);

        int array[] = { 1, 2, 3, 4, 5, 6 };

        Random rand = new Random();

        // Algoritmo Fisher-Yates para desordenar el array
        for (int i = array.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        System.out.println("Asignación de ejercicios para cada grupo: ");

        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println("");
        // Algoritmo Fisher-Yates para desordenar el array
        for (int i = array.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        System.out.println("Orden de exposición para el próximo viernes: ");

        for (int num : array) {
            System.out.print(num + " ");
        }

    }
}
