package _05_constructores;

class Persona {
    private String nombre;
    private int edad;

    // Constructor con uso de this
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}