package SistemaInversionFinanciera.instrumentos;

import SistemaInversionFinanciera.base.InstruementoFinanciero;

public class FondoInversion extends InstruementoFinanciero {
    private double variacionPorcentual;
    private double comisionAdministracion;

    public FondoInversion() {
    }

    public FondoInversion(double variacionPorcentual, double comisionAdministracion) {
        this.variacionPorcentual = variacionPorcentual;
        this.comisionAdministracion = comisionAdministracion;
    }

    public FondoInversion(String codigo, String nombreInversion, String invertido, double variacionPorcentual, double comisionAdministracion) {
        super(codigo, nombreInversion, invertido);
        this.variacionPorcentual = variacionPorcentual;
        this.comisionAdministracion = comisionAdministracion;
    }

    public double getVariacionPorcentual() {
        return variacionPorcentual;
    }

    public void setVariacionPorcentual(double variacionPorcentual) {
        this.variacionPorcentual = variacionPorcentual;
    }

    public double getComisionAdministracion() {
        return comisionAdministracion;
    }

    public void setComisionAdministracion(double comisionAdministracion) {
        this.comisionAdministracion = comisionAdministracion;
    }

    @Override
    public String toString() {
        return "FondoInversion{" +
                "variacionPorcentual=" + variacionPorcentual +
                ", comisionAdministracion=" + comisionAdministracion +
                "} " + super.toString();
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
