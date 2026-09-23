package GestionPolizaSeguros.Seguros;

import GestionPolizaSeguros.base.PolizaSeguro;

public class SeguroVehiculo extends PolizaSeguro {

    private String marca;
    private int ano;
    private double valorComercial;

    public SeguroVehiculo() {
    }

    public SeguroVehiculo(String marca, int ano, double valorComercial) {
        this.marca = marca;
        this.ano = ano;
        this.valorComercial = valorComercial;
    }

    public SeguroVehiculo(int numeroPoliza, String nombreCleinte, double montoAsegurado, String marca, int ano, double valorComercial) {
        super(numeroPoliza, nombreCleinte, montoAsegurado);
        this.marca = marca;
        this.ano = ano;
        this.valorComercial = valorComercial;
    }

    public SeguroVehiculo(int numeroPoliza, String nombreCleinte, double montoAsegurado) {
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
