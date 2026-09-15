package PrestacionesSalud.base;

public abstract class PrestacionSalud {
    private String identificador;
    private String nombrePaciente;
    private  double valorBase;

    public PrestacionSalud() {
    }

    public PrestacionSalud(String identificador, String nombrePaciente, double valorBase) {
        this.identificador = identificador;
        this.nombrePaciente = nombrePaciente;
        this.valorBase = valorBase;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }
    public void mostrarInformacion(){

    }
    public abstract double calcularValorFinal();

    public boolean coincideConPaciente(String texto){

    }

}
