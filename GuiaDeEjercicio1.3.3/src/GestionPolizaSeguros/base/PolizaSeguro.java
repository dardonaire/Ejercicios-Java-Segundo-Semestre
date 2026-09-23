package GestionPolizaSeguros.base;

public abstract class PolizaSeguro {
    private  int numeroPoliza;
    private String nombreCleinte;
    private double montoAsegurado;

    public PolizaSeguro() {
    }

    public PolizaSeguro(int numeroPoliza, String nombreCleinte, double montoAsegurado) {
        this.numeroPoliza = numeroPoliza;
        this.nombreCleinte = nombreCleinte;
        this.montoAsegurado = montoAsegurado;
    }

    public int getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(int numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public String getNombreCleinte() {
        return nombreCleinte;
    }

    public void setNombreCleinte(String nombreCleinte) {
        this.nombreCleinte = nombreCleinte;
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
                ", nombreCleinte='" + nombreCleinte + '\'' +
                ", montoAsegurado=" + montoAsegurado +
                '}';
    }

    public void mostrarInformacion(){
        System.out.println(this.toString());

    }

    public abstract double calcularPrima();

    public abstract String obtenerTipoCobertura();


}
