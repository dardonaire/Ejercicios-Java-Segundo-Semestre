package SistemaInversionFinanciera.instrumentos;

import SistemaInversionFinanciera.Interfaces.Liquidable;
import SistemaInversionFinanciera.base.InstruementoFinanciero;

public class FondoInversion extends InstruementoFinanciero implements Liquidable {
    private double variacionPorcentual;
    private double comisionAdministracion;
    private double comisionLiquidacion;

    public FondoInversion() {
    }

    public FondoInversion(double variacionPorcentual, double comisionAdministracion, double comisionLiquidacion) {
        this.variacionPorcentual = variacionPorcentual;
        this.comisionAdministracion = comisionAdministracion;
        this.comisionLiquidacion = comisionLiquidacion;
    }

    public FondoInversion(String codigo, String nombreInversion, double invertido, double variacionPorcentual, double comisionAdministracion, double comisionLiquidacion) {
        super(codigo, nombreInversion, invertido);
        this.variacionPorcentual = variacionPorcentual;
        this.comisionAdministracion = comisionAdministracion;
        this.comisionLiquidacion = comisionLiquidacion;
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

    public double getComisionLiquidacion() {
        return comisionLiquidacion;
    }

    public void setComisionLiquidacion(double comisionLiquidacion) {
        this.comisionLiquidacion = comisionLiquidacion;
    }

    @Override
    public String toString() {
        return "FondoInversion{" +
                "variacionPorcentual=" + variacionPorcentual +
                ", comisionAdministracion=" + comisionAdministracion +
                ", comisionLiquidacion=" + comisionLiquidacion +
                "} " + super.toString();
    }



    @Override
    public double calcularRentabilidad() {
        return (super.getInvertido() * this.variacionPorcentual / 100) - (super.getInvertido() * this.comisionAdministracion / 100);
    }


    @Override
    public String obtenerNivelRiesgo() {
        return "Medio";
    }

    @Override
    public double liquidar() {
        return (super.getInvertido() + calcularRentabilidad() - this.comisionLiquidacion );
    }
}
