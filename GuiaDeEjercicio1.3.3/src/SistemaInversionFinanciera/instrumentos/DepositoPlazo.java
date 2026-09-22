package SistemaInversionFinanciera.instrumentos;

import SistemaInversionFinanciera.Interfaces.Liquidable;
import SistemaInversionFinanciera.base.InstruementoFinanciero;

public class DepositoPlazo extends InstruementoFinanciero implements Liquidable {
    private double tasainteres;
    private int plazomeses;

    public DepositoPlazo(double tasainteres, int plazomeses) {
        this.tasainteres = tasainteres;
        this.plazomeses = plazomeses;
    }

    public DepositoPlazo() {
    }

    public DepositoPlazo(String codigo, String nombreInversion, double invertido, double tasainteres, int plazomeses) {
        super(codigo, nombreInversion, invertido);
        this.tasainteres = tasainteres;
        this.plazomeses = plazomeses;
    }


    @Override
    public String toString() {
        return "DepositoPlazo{" +
                "tasaInteres=" + tasainteres +
                ", plazomeses=" + plazomeses +
                '}';
    }

    public double getTasainteres() {
        return tasainteres;
    }

    public void setTasainteres(double tasainteres) {
        this.tasainteres = tasainteres;
    }

    public int getPlazomeses() {
        return plazomeses;
    }

    public void setPlazomeses(int plazomeses) {
        this.plazomeses = plazomeses;
    }

    @Override
    public double calcularRentabilidad() {
        return (super.getInvertido() * this.tasainteres/ 100) * this.plazomeses;

    }

    @Override
    public String obtenerNivelRiesgo() {
        return "bajo";
    }

    @Override
    public double liquidar() {
        return super.getInvertido() + calcularRentabilidad();
    }
}
