package SistemaInversionFinanciera.instrumentos;

import SistemaInversionFinanciera.base.InstruementoFinanciero;

public class Accion extends InstruementoFinanciero {
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

    public Accion(String codigo, String nombreInversion, String invertido, double precioCompra, double precioActual, int cantidadAcciones) {
        super(codigo, nombreInversion, invertido);
        this.precioCompra = precioCompra;
        this.precioActual = precioActual;
        this.cantidadAcciones = cantidadAcciones;
    }

    @Override
    public void mostrarResumen() {
        super.mostrarResumen();
    }

    @Override
    public double calcularRentabilidad() {
        return 0;
    }

    @Override
    public String obtenerNivelRiesgo() {
        return "";
    }

}
