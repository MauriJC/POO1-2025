package _07_parcial2;

public class Producto {
    private int codigo;
    private float precio;

    public Producto(int codigo, float precio) {
        this.codigo = codigo;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public float getPrecio() {
        return precio;
    }
}
