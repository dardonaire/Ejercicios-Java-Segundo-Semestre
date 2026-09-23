package PrestacionesSalud.consultas;

import PrestacionesSalud.base.PrestacionSalud;

public class ExamenLaboratorio extends PrestacionSalud {
    private String examen;
    private boolean condicionUrgencia;
    private double recargo;

    public ExamenLaboratorio() {
    }

    public ExamenLaboratorio(String identificador, String nombrePaciente, double valorBase, String examen, boolean condicionUrgencia, double recargo) {
        super(identificador, nombrePaciente, valorBase);
        this.examen = examen;
        this.condicionUrgencia = condicionUrgencia;
        this.recargo = recargo;
    }

    public String getExamen() {
        return examen;
    }

    public void setExamen(String examen) {
        this.examen = examen;
    }

    public boolean isCondicionUrgencia() {
        return condicionUrgencia;
    }

    public void setCondicionUrgencia(boolean condicionUrgencia) {
        this.condicionUrgencia = condicionUrgencia;
    }

    public double getRecargo() {
        return recargo;
    }

    public void setRecargo(double recargo) {
        this.recargo = recargo;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("Resumen Paciente");
        System.out.println("IDentificador:"+ super.getIdentificador());
        System.out.println("Nombre Paciente:" + super.getNombrePaciente());
        System.out.println("Valor GestionPolizaSeguros.GestionPolizaSeguros.base.base:" + super.getValorBase());
        System.out.println("Examen:" + examen);
        System.out.println("Condicion Urgencia:" + condicionUrgencia);
        System.out.println("Recargo:" + recargo);
    }

    @Override
    public double calcularValorFinal() {
        if (this.condicionUrgencia){
            return super.getValorBase() + (super.getValorBase()* this.recargo/ 100);
        }else{
            return super.getValorBase();
        }

    }

}
