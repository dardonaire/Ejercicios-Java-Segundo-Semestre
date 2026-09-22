package SistemaInversionFinanciera.instrumentos;

import SistemaInversionFinanciera.Interfaces.Liquidable;
import SistemaInversionFinanciera.base.InstruementoFinanciero;

public class Accion extends InstruementoFinanciero implements Liquidable {
    private double precioCompra;
    private double precioActual;
    private int cantidadAcciones;

    public Accion() {
    }

    public Accion(double precioCompra, double precioActual, int cantidadAcciones) {
        this.precioCompra = precioCompra;
        this.precioActual = precioActual;
        this.cantidadAcciones = cantidadAcciones;
    }

    public Accion(String codigo, String nombreInversion, double invertido, double precioCompra, double precioActual, int cantidadAcciones) {
        super(codigo, nombreInversion, invertido);
        this.precioCompra = precioCompra;
        this.precioActual = precioActual;
        this.cantidadAcciones = cantidadAcciones;
    }

    @Override
    public String toString() {
        return "Accion{" +
                "precioCompra=" + precioCompra +
                ", precioActual=" + precioActual +
                ", cantidadAcciones=" + cantidadAcciones +
                "} " + super.toString();
    }



    @Override
    public double calcularRentabilidad() {
        return (this.precioActual - this.precioCompra * this.cantidadAcciones);
    }

    @Override
    public double liquidar() {
        return this.precioActual + this.cantidadAcciones;
    }

    @Override
    public String obtenerNivelRiesgo() {
        return "Alto";
    }

}
