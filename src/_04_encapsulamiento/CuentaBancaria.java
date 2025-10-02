package _04_encapsulamiento;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    public void setSaldo(double saldoRecibido) {
        if (saldoRecibido >= 0) {
            saldo = saldoRecibido;
        } else {
            System.out.println("El saldo no puede ser negativo");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    // 50
    public void depositar(double monto) {
        if (monto > 0) {
            // 0 = saldo actual + 50
            saldo += monto;
        } else {
            System.out.println("El monto a depositar debe ser mayor a 0");
        }
    }

    public void extraer(double monto) {
        if (monto > saldo) {
            System.out.println("No hay saldo suficiente");
        } else {
            saldo -= monto;// saldo = saldo - monto
        }

    }

}
