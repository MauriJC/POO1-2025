package _05_constructores;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        // nombre = nombre; // <= Rompe encapsulamiento
        // precio = precio;
        setNombre(nombre);
        setPrecio(precio);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            this.precio = 1.0;
        }
    }

    public void mostrarInfo() {
        System.out.println("Nombre del producto: " + nombre + ", Precio: " + precio);
    }
}
