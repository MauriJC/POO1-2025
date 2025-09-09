package _02_metodos.ejercicios;

public class Sorteo {
    public static void main(String[] args) {
        int resultado;
        resultado = (int) (Math.random() * 7) + 1;
        System.out.println("Número ganador: " + resultado);
    }
}
