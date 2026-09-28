package GestionPolizaSeguros.Seguros;

import GestionPolizaSeguros.base.PolizaSeguro;

public class SeguroSalud extends PolizaSeguro implements Renovable {

    private int edadAsegurado;
    private double porcentajeCobertura;

    public SeguroSalud() {
    }

    public SeguroSalud(int numeroPoliza, String nombreCliente,
                       double montoAsegurado, int edadAsegurado,
                       double porcentajeCobertura) {

        super(numeroPoliza, nombreCliente, montoAsegurado);
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
        if (this.edadAsegurado < 60) {
            return super.getMontoAsegurado() * 2 / 100;
        } else {
            return super.getMontoAsegurado() * 3 / 100;
        }
    }

    @Override
    public String obtenerTipoCobertura() {
        return "Cobertura de salud: " + this.porcentajeCobertura + "%";
    }

    @Override
    public boolean renovar(int cantidadMeses) {
        if (cantidadMeses > 0) {
            return true;
        } else {
            return false;
        }
    }
    }
