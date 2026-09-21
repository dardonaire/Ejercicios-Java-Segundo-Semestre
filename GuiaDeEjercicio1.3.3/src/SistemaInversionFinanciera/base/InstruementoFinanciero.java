package SistemaInversionFinanciera.base;

public abstract class InstruementoFinanciero {
    private String codigo;
    private String nombreInversion;
    private String invertido;

    public InstruementoFinanciero() {
    }

    public InstruementoFinanciero(String codigo, String nombreInversion, String invertido) {
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

    public String getInvertido() {
        return invertido;
    }

    public void setInvertido(String invertido) {
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

    }

    public abstract double calcularRentabilidad();
    public abstract String obtenerNivelRiesgo();
}
