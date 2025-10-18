package _06_herencia;

public class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }

    public void dormir() {
        System.out.println("El animal está durmiendo");
    }

    public void comer() {
        System.out.println("El animal está comiendo");
    }
}
