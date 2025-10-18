package _07_parcial2;// Borrar esta linea

public class Vehiculo {
    private int anioFabricacion;
    private float kilometraje;

    public Vehiculo(int anioFabricacion, float kilometraje) {
        this.anioFabricacion = anioFabricacion;
        this.kilometraje = kilometraje;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public float getKilometraje() {
        return kilometraje;
    }
}
