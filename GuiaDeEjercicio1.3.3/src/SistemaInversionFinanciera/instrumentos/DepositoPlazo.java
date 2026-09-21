package SistemaInversionFinanciera.instrumentos;

import SistemaInversionFinanciera.base.InstruementoFinanciero;

public class DepositoPlazo extends InstruementoFinanciero {
    private double tazaInteres;
    private int plazomeses;

    public DepositoPlazo() {
    }

    public DepositoPlazo(double tazaInteres, int plazomeses) {
        this.tazaInteres = tazaInteres;
        this.plazomeses = plazomeses;
    }

    public double getTazaInteres() {
        return tazaInteres;
    }

    public void setTazaInteres(double tazaInteres) {
        this.tazaInteres = tazaInteres;
    }

    public int getPlazomeses() {
        return plazomeses;
    }

    public void setPlazomeses(int plazomeses) {
        this.plazomeses = plazomeses;
    }

    @Override
    public String toString() {
        return "DepositoPlazo{" +
                "tazaInteres=" + tazaInteres +
                ", plazomeses=" + plazomeses +
                '}';
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
