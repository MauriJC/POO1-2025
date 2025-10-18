package _06_herencia;

public class Tractor extends Vehiculo {
    private int potencia;

    public Tractor(String patente, String modelo, int anio, String color, int potencia) {
        super(patente, modelo, anio, color);
        this.potencia = potencia;
    }

    public void arar() {
        System.out.println("El tractor está arando el campo");
    }
}
