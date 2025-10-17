package _07_parcial2;

public class CuentaBancaria {
    private int numeroCuenta;
    private float saldo;

    public CuentaBancaria(int numeroCuenta, float saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public float getSaldo() {
        return saldo;
    }
}
