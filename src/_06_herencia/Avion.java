package _06_herencia;

public class Avion extends Vehiculo {
    public Avion(String patente, String modelo, int anio, String color) {
        super(patente, modelo, anio, color);
    }

    public void tocarBocina() {
        System.out.println("El avión está tocando la bocina");
    }

}
