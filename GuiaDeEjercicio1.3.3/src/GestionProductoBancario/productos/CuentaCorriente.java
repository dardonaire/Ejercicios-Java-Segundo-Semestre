package GestionProductoBancario.productos;

import GestionProductoBancario.base.ProductoBancario;

public class CuentaCorriente extends ProductoBancario {

    private double lineaCredito;

    public CuentaCorriente() {
    }

    public CuentaCorriente(String numeroproducto, String titular, double saldo, double lineaCredito) {
        super(numeroproducto, titular, saldo);
        this.lineaCredito = lineaCredito;
    }

    public double getLineaCredito() {
        return lineaCredito;
    }

    public void setLineaCredito(double lineaCredito) {
        this.lineaCredito = lineaCredito;
    }


    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "lineaCredito=" + lineaCredito +
                "} " + super.toString();
    }



    @Override
    public void mostrarResumen() {

        System.out.println("****Resumen Productos***");
        System.out.println("Numero producto: " + super.getNumeroproducto());
        System.out.println("Nombre titular: " + super.getTitular());
        System.out.println("Saldo disponible: " + super.getSaldo());


        System.out.println("linea = " + lineaCredito);

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
        }else if(this.lineaCredito >= (monto - getSaldo())){
            this.lineaCredito -= (monto - getSaldo());
            super.setSaldo(0);
            return true;
        }

        return false;
    }
}
