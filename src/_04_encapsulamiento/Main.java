package _04_encapsulamiento;

public class Main {
    public static void main(String[] args) {
        // Rectangulo rect = new Rectangulo();
        // rect.ancho = 4;
        // rect.setAlto(10);
        // rect.setAncho(5);
        // rect.calcularArea();
        // double area = rect.calcularArea();
        // System.out.println("El área del rectángulo es: " + area);

        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setSaldo(100);
        cuenta.depositar(50);
        cuenta.extraer(149);
        System.out.println("El dinero restante es: " + cuenta.getSaldo() + " pesos");
    }
}
