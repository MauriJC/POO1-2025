package _06_herencia;

public class Main {
    public static void main(String[] args) {
        // TODO: Create the example for inheritance

        /*
         * Animal animal = new Animal("Genérico", 5);
         * animal.hacerSonido();
         * // animal.ronronear();
         * 
         * Gato gato = new Gato("Miau", 3);
         * gato.hacerSonido();
         * gato.ronronear();
         */

        Vehiculo vehiculo1 = new Auto("ABC123", "Toyota", 2020, "Rojo");

        Tractor tractor1 = new Tractor("TRC456", "John Deere", 2018, "Verde", 150);
        tractor1.arar();

        Auto auto1 = new Auto("XYZ789", "Honda", 2021, "Azul");
        auto1.tocarBocina();

        Avion avion1 = new Avion("AVN321", "Boeing", 2015, "Blanco");
        avion1.tocarBocina();
    }
}
