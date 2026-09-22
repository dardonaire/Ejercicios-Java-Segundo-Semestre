package SistemaInversionFinanciera.base;

public abstract class InstruementoFinanciero {
    private String codigo;
    private String nombreInversion;
    private double invertido;

    public InstruementoFinanciero() {
    }

    public InstruementoFinanciero(String codigo, String nombreInversion, double invertido) {
        this.codigo = codigo;
        this.nombreInversion = nombreInversion;
        this.invertido = invertido;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreInversion() {
        return nombreInversion;
    }

    public void setNombreInversion(String nombreInversion) {
        this.nombreInversion = nombreInversion;
    }

    public double getInvertido() {
        return invertido;
    }

    public void setInvertido(double invertido) {
        this.invertido = invertido;
    }

    @Override
    public String toString() {
        return "InstruementoFinanciero{" +
                "codigo='" + codigo + '\'' +
                ", nombreInversion='" + nombreInversion + '\'' +
                ", invertido='" + invertido + '\'' +
                '}';
    }

    public void mostrarResumen(){
        System.out.println(this.toString());

    }

    public abstract double calcularRentabilidad();
    public abstract String obtenerNivelRiesgo();
}
