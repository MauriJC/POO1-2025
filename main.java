import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Clase Cliente
class Cliente {
    private String nombre;
    private String telefono;
    
    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    public String getNombre() { return nombre; }
    public String getTelefono() { return telefono; }
    
    @Override
    public String toString() {
        return "Cliente: " + nombre + " (" + telefono + ")";
    }
}

// Clase abstracta Animal
abstract class Animal {
    protected String nombre;
    protected int edad;
    
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    
    public abstract String hacerSonido();
    
    @Override
    public String toString() {
        return nombre + " (" + edad + " años)";
    }
}

// Clase Perro que extiende Animal
class Perro extends Animal {
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }
    
    @Override
    public String hacerSonido() {
        return "Guau!";
    }
    
    @Override
    public String toString() {
        return "Perro: " + super.toString();
    }
}

// Clase Venta
class Venta {
    private Cliente cliente;
    private Animal animal;
    
    public Venta(Cliente cliente, Animal animal) {
        this.cliente = cliente;
        this.animal = animal;
    }
    
    public void mostrarDetalle() {
        System.out.println("=== DETALLE DE VENTA ===");
        System.out.println(cliente);
        System.out.println(animal);
        System.out.println("Sonido del animal: " + animal.hacerSonido());
        System.out.println("========================");
    }
}

class TiendaGUI extends JFrame {
    private JTextField txtNombreCliente, txtTelefono, txtNombreAnimal;
    private JButton btnVender;
    private JTextArea areaVentas;

    public TiendaGUI() {
        setTitle("Tienda de Mascotas");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panelForm = new JPanel(new GridLayout(4, 2));
        panelForm.add(new JLabel("Nombre Cliente:"));
        txtNombreCliente = new JTextField();
        panelForm.add(txtNombreCliente);

        panelForm.add(new JLabel("Teléfono:"));
        txtTelefono = new JTextField();
        panelForm.add(txtTelefono);

        panelForm.add(new JLabel("Animal:"));
        txtNombreAnimal = new JTextField();
        panelForm.add(txtNombreAnimal);

        btnVender = new JButton("Registrar Venta");
        panelForm.add(btnVender);

        areaVentas = new JTextArea();
        add(panelForm, BorderLayout.NORTH);
        add(new JScrollPane(areaVentas), BorderLayout.CENTER);

        btnVender.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Cliente cliente = new Cliente(txtNombreCliente.getText(), txtTelefono.getText());
                Animal animal = new Perro(txtNombreAnimal.getText(), 2); // fijo edad para ejemplo
                Venta venta = new Venta(cliente, animal);
                venta.mostrarDetalle();
                areaVentas.append("Venta registrada: " + animal + "\n");
            }
        });
    }
}

class Main {
    public static void main(String[] args) {
        new TiendaGUI().setVisible(true);
    }
}
