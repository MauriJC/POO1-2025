package _05_constructores;

public class Main {
    public static void main(String[] args) {
        // Persona p1 = new Persona("Ana", 20);
        // p1.mostrarInfo(); // Nombre: Ana, Edad: 20

        Producto producto = new Producto("Camiseta", 19.99);
        Producto prod2 = new Producto("Remera", 0);

        producto.mostrarInfo(); // Nombre del producto: Camiseta, Precio: 19.99
        prod2.mostrarInfo(); // Nombre del producto: Remera, Precio: 1
    }
}
