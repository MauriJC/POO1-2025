package _04_encapsulamiento;

public class Rectangulo {
    private double alto;
    private double ancho;

    // Getters: sirven para la lectura de atributos privados
    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }

    // Setters : sirven para la modificacion de atributos privados
    public void setAlto(double altoAAsignar) {
        if (altoAAsignar > 0) {
            alto = altoAAsignar;
        } else {
            System.out.println("El alto debe ser mayor a 0");
        }
    }

    public void setAncho(double anchoAAsignar) {
        if (anchoAAsignar > 0) {
            ancho = anchoAAsignar;
        } else {
            System.out.println("El ancho debe ser mayor a 0");
        }
    }

    public void calcularArea() {
        System.out.println("El área del rectángulo es: " + (alto * ancho));
    }
}
