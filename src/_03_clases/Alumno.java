package _03_clases;

public class Alumno {
    String nombre; // Juan
    double nota; // 7.5

    boolean estaAprobado() {
        return nota >= 6;
    }

    void imprimirEstado() {
        if (estaAprobado()) {
            System.out.println(nombre + " está aprobado");
        } else {
            System.out.println(nombre + " está reprobado");
        }
    }
}