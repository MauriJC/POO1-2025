package _03_clases;

public class Auto {
    // Para modelar en clase
    // Atributos (características)
    String modelo;
    String color;
    boolean esNuevo; // true significa que es nuevo, false que es usado
    String marca;
    boolean esDigital; // true significa que es digital, false que es analógico

    // Métodos, basicamente, que puede hacer un objeto de esta clase
    void arrancar() {
        System.out.println("El auto está arrancando");
    }
    // Como pueden ver, estos metodos no requieren tener un public static al ser
    // declarados, esto es debido a que son metodos de instancia, es decir, que se
    // llaman desde un objeto de la clase.
}
