package _02_metodos.ejercicios;

public class EjerciciosMetodos {

    // ----- MÉTODOS SIN TIPO -----
    public static void saludar(String nombre) {
        System.out.println("Hola " + nombre + "!");
    }

    public static void imprimirTabla(int n) {
        System.out.println("Tabla del " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void contarHasta(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void mensajeBienvenida() {
        System.out.println("Bienvenidos a POO 1");
    }

    // ----- MÉTODOS CON TIPO -----
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static double promedio(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    public static boolean esPar(int n) {
        return n % 2 == 0;
    }

    public static double areaRectangulo(double base, double altura) {
        return base * altura;
    }

    // ----- MAIN para probar -----
    public static void main(String[] args) {
        // métodos void
        mensajeBienvenida();
        saludar("Mauricio");
        imprimirTabla(5);
        contarHasta(7);

        // métodos con retorno
        System.out.println("Suma: " + sumar(3, 4));
        System.out.printf("Promedio: %.2f%n", promedio(7, 8.5, 9));
        System.out.println("¿Es par 6? " + esPar(6));
        System.out.println("Área rectángulo 4x5: " + areaRectangulo(4, 5));
    }
}
