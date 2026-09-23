package GestionPolizaSeguros.Seguros;

import GestionPolizaSeguros.base.PolizaSeguro;

public class SeguroVida extends PolizaSeguro {
    private int edad;
    private int duracionContrato;

    public SeguroVida() {
    }

    public SeguroVida(int edad, int duracionContrato) {
        this.edad = edad;
        this.duracionContrato = duracionContrato;
    }

    public SeguroVida(int numeroPoliza, String nombreCleinte, double montoAsegurado, int edad, int duracionContrato) {
        super(numeroPoliza, nombreCleinte, montoAsegurado);
        this.edad = edad;
        this.duracionContrato = duracionContrato;
    }

    public SeguroVida(int numeroPoliza, String nombreCleinte, double montoAsegurado) {
        super(numeroPoliza, nombreCleinte, montoAsegurado);
    }

    @Override
    public double calcularPrima() {
        return 0;
    }

    @Override
    public String obtenerTipoCobertura() {
        return "";
    }
}
