package _04_encapsulamiento;

public class Main {
    public static void main(String[] args) {
        Rectangulo rect = new Rectangulo(1, 2);
        rect.base = 10; // No se puede acceder directamente a atributos privados
        rect.altura = 5; // No se puede acceder directamente a atributos privados

        // Forma correcta de acceder a los atributos privados
        rect.setAlto(10);
        rect.setAncho(5);

        float area = (float) rect.calcularArea();
        System.out.println("El área del rectángulo es: " + area);

    }
}
