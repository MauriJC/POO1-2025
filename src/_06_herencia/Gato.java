package _06_herencia;

public class Gato extends Animal {

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    public void ronronear() {
        System.out.println("El gato está ronroneando");
    }
}
