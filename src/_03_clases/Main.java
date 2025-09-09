package _03_clases;

public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.modelo = "Model S";
        auto1.color = "Rojo";
        auto1.esNuevo = true;
        auto1.marca = "Tesla";
        auto1.esDigital = true;

        // System.out.println(auto1.modelo);
        auto1.arrancar();
        // auto1.moverse();
        // auto1.doblar();
        // auto1.frenar();
        // persona1.saludar();
        // Persona.despedirse();

        Auto auto2 = new Auto();
        auto2.modelo = "Model 3";
        auto2.color = "Blanco";
        auto2.esNuevo = false;
        auto2.marca = "Tesla";
        auto2.esDigital = true;

        auto2.arrancar();

    }
}
