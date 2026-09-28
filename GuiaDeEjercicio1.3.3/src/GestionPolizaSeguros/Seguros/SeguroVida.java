package GestionPolizaSeguros.Seguros;

import GestionPolizaSeguros.base.PolizaSeguro;

public class SeguroVida extends PolizaSeguro implements Renovable {

    private int edad;
    private int duracionContrato;

    public SeguroVida() {
    }

    public SeguroVida(int numeroPoliza, String nombreCliente,
                      double montoAsegurado, int edad,
                      int duracionContrato) {

        super(numeroPoliza, nombreCliente, montoAsegurado);
        this.edad = edad;
        this.duracionContrato = duracionContrato;
    }

    @Override
    public double calcularPrima() {
        if (this.edad < 60) {
            return (super.getMontoAsegurado() * 2 / 100)
                    + (this.duracionContrato * 1000);
        } else {
            return (super.getMontoAsegurado() * 4 / 100)
                    + (this.duracionContrato * 1000);
        }
    }

    @Override
    public String obtenerTipoCobertura() {
        return "Cobertura de seguro de vida por "
                + this.duracionContrato + " meses";
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