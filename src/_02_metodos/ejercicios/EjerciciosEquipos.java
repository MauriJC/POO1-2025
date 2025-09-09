package _02_metodos.ejercicios;

public class EjerciciosEquipos {
    public static String mayorConTipo(int a, int b) {
        if (a > b) {
            return a + " es mayor que " + b;
        } else if (b > a) {
            return b + " es mayor que " + a;
        } else {
            return "Los números son iguales";
        }
    }

    public static void mayorSinTipo(int a, int b) {
        if (a > b) {
            System.out.println(a + " es mayor que " + b);
        } else if (b > a) {
            System.out.println(b + " es mayor que " + a);
        } else {
            System.out.println("Los números son iguales");
        }
    }

    public static String saludarConRetorno(String nombre, int veces) {
        String resultado = "Hola ";
        for (int i = 0; i < veces; i++) {
            resultado += nombre + " ";
        }
        return resultado;
    }

    public static void saludarSinRetorno(String nombre, int veces) {
        System.out.print("Hola ");
        for (int i = 0; i < veces; i++) {
            System.out.print(nombre + " ");
        }
    }

}
