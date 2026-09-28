package GestionPolizaSeguros.base;

public abstract class PolizaSeguro {

    private int numeroPoliza;
    private String nombreCliente;
    private double montoAsegurado;

    public PolizaSeguro() {
    }

    public PolizaSeguro(int numeroPoliza, String nombreCliente, double montoAsegurado) {
        this.numeroPoliza = numeroPoliza;
        this.nombreCliente = nombreCliente;
        this.montoAsegurado = montoAsegurado;
    }

    public int getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(int numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getMontoAsegurado() {
        return montoAsegurado;
    }

    public void setMontoAsegurado(double montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

    @Override
    public String toString() {
        return "PolizaSeguro{" +
                "numeroPoliza=" + numeroPoliza +
                ", nombreCliente='" + nombreCliente + '\'' +
                ", montoAsegurado=" + montoAsegurado +
                '}';
    }

    public void mostrarInformacion() {
        System.out.println(this.toString());
    }

    public boolean coincideConCliente(String texto) {
        return this.nombreCliente.toLowerCase()
                .contains(texto.toLowerCase());
    }

    public abstract double calcularPrima();

    public abstract String obtenerTipoCobertura();
}