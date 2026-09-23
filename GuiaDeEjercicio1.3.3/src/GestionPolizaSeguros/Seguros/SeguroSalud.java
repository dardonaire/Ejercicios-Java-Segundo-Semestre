package GestionPolizaSeguros.Seguros;

import GestionPolizaSeguros.base.PolizaSeguro;

public class SeguroSalud extends PolizaSeguro {

    private int edadAsegurado;
    private double porcentajeCobertura;


    public SeguroSalud() {
    }

    public SeguroSalud(int numeroPoliza, String nombreCleinte, double montoAsegurado, int edadAsegurado, double porcentajeCobertura) {
        super(numeroPoliza, nombreCleinte, montoAsegurado);
        this.edadAsegurado = edadAsegurado;
        this.porcentajeCobertura = porcentajeCobertura;
    }

    public int getEdadAsegurado() {
        return edadAsegurado;
    }

    public void setEdadAsegurado(int edadAsegurado) {
        this.edadAsegurado = edadAsegurado;
    }

    public double getPorcentajeCobertura() {
        return porcentajeCobertura;
    }

    public void setPorcentajeCobertura(double porcentajeCobertura) {
        this.porcentajeCobertura = porcentajeCobertura;
    }

    @Override
    public double calcularPrima() {
        if (this.edadAsegurado > 0 && this.edadAsegurado < 60) {
            return (super.getMontoAsegurado() * 2 /100);
    }else {
            return (this.edadAsegurado * 3 / 100);
        }
    }

    @Override
    public String obtenerTipoCobertura() {
        return "";
    }
}
