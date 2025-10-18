package _06_herencia;

public class Auto extends Vehiculo {

    public Auto(String patente, String modelo, int anio, String color) {
        super(patente, modelo, anio, color);
    }

    public void tocarBocina() {
        System.out.println("El auto está tocando la bocina");
    }
}
