package GestionPolizaSeguros.Seguros;

import GestionPolizaSeguros.base.PolizaSeguro;

public class SeguroVehiculo extends PolizaSeguro implements Renovable{

    private String marca;
    private int ano;
    private double valorComercial;

    public SeguroVehiculo() {
    }

    public SeguroVehiculo(int numeroPoliza, String nombreCliente,
                          double montoAsegurado, String marca,
                          int ano, double valorComercial) {

        super(numeroPoliza, nombreCliente, montoAsegurado);
        this.marca = marca;
        this.ano = ano;
        this.valorComercial = valorComercial;
    }

    @Override
    public double calcularPrima() {
        if (this.ano >= 2020) {
            return this.valorComercial * 2 / 100;
        } else {
            return this.valorComercial * 3 / 100;
        }
    }

    @Override
    public String obtenerTipoCobertura() {
        return "Cobertura para vehículo " + this.marca;
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