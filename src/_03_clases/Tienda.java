package _03_clases;

public class Tienda {
    double precioUnitario;
    int cantidad;

    double calcularTotalDeLaCompra() {
        double resultado = precioUnitario * cantidad;
        return resultado;
        /*
         * Tambien se puede hacer en una sola linea:
         * return precioUnitario * cantidad;
         */
    }

    void imprimirTicket() {
        double total = calcularTotalDeLaCompra();
        System.out.println("----- TICKET -----");
        System.out.println("Precio Unitario: " + precioUnitario);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Total: " + total);
        System.out.println("------------------");
    }

}
