package GestionProductoBancario.productos;

import GestionProductoBancario.base.ProductoBancario;

public class CuentaAhorro extends ProductoBancario {
    private double tasaInteres;

    public CuentaAhorro() {
    }

    public CuentaAhorro(String numeroproducto, String titular, double saldo, double tasaInteres) {
        super(numeroproducto, titular, saldo);
        this.tasaInteres = tasaInteres;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" +
                "tasaInteres=" + tasaInteres +
                "} " + super.toString();
    }

    @Override
    public void mostrarResumen() {
        System.out.println("****Resumen Productos***");
        System.out.println("Numero producto: " + super.getNumeroproducto());
        System.out.println("Nombre titular: " + super.getTitular());
        System.out.println("Saldo disponible: " + super.getSaldo());
        System.out.println("TasaInteres = " + tasaInteres);

    }

    @Override
    public void depositar(double monto) {
        super.depositar(monto);
    }


    @Override
    public boolean girar(double monto) {
        if (monto <= 0){
            System.out.println("Ingrese monto mayor a 0");
            return false;
        }
        if (super.getSaldo() >= monto){
            super.setSaldo(super.getSaldo() - monto);
            return true;

    }
        System.out.println("Saldo insuficiente");
        return false;
}
    public void aplicarInteres(){
        super.setSaldo(super.getSaldo() + (super.getSaldo() * this.tasaInteres / 100));

    }

    }