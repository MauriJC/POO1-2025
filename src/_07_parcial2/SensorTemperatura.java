package _07_parcial2;

public class SensorTemperatura {
    private int idSensor;
    private float temperaturaActual;

    public SensorTemperatura(int idSensor, float temperaturaActual) {
        this.idSensor = idSensor;
        this.temperaturaActual = temperaturaActual;
    }

    public int getIdSensor() {
        return idSensor;
    }

    public float getTemperaturaActual() {
        return temperaturaActual;
    }
}
