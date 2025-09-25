package _04_encapsulamiento;

public class Rectangulo {
    // Atributos privados
    private double ancho;
    private double alto;

    // Constructor
    public Rectangulo(double valorAncho, double valorAlto) {
        setAncho(valorAncho); // usamos setters para validar
        setAlto(valorAlto);
    }

    // Getter de ancho
    public double getAncho() {
        return ancho;
    }

    // Setter con validación
    public void setAncho(double valorAncho) {
        if (valorAncho > 0) {
            ancho = valorAncho;
        } else {
            System.out.println("Error: El ancho debe ser mayor que 0.");
        }
    }

    // Getter de alto
    public double getAlto() {
        return alto;
    }

    // Setter con validación
    public void setAlto(double valorAlto) {
        if (valorAlto > 0) {
            alto = valorAlto;
        } else {
            System.out.println("Error: El alto debe ser mayor que 0.");
        }
    }

    // Método para calcular el área
    public double calcularArea() {
        return ancho * alto;
    }
}
