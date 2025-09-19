package _03_clases;

public class Main {
    public static void main(String[] args) {
        // Calculadora calc = new Calculadora();
        // int resultadoSuma = calc.sumaEnteraDeDosNumeros(2, 3);

        // System.out.println("El resultado de la suma es: " + resultadoSuma);

        /* 
         Alumno al = new Alumno();
          al.nombre = "Juan";
          al.nota = 7.5;
          al.imprimirEstado();
          
          Alumno al2 = new Alumno();
          al2.nombre = "Ana";
          al2.nota = 5.9;
          al2.imprimirEstado();
         */

        Tienda tienda = new Tienda();
        tienda.precioUnitario = 100;
        tienda.cantidad = 2;
        tienda.imprimirTicket();

    }
}
