package PrestacionesSalud.consultas;

import PrestacionesSalud.base.PrestacionSalud;

public class ExamenLaboratorio extends PrestacionSalud {
    private String examen;
    private String condicionUrgencia;

    public ExamenLaboratorio() {
    }

    public ExamenLaboratorio(String identificador, String nombrePaciente, double valorBase, String examen, String condicionUrgencia) {
        super(identificador, nombrePaciente, valorBase);
        this.examen = examen;
        this.condicionUrgencia = condicionUrgencia;
    }

    public String getExamen() {
        return examen;
    }

    public void setExamen(String examen) {
        this.examen = examen;
    }

    public String getCondicionUrgencia() {
        return condicionUrgencia;
    }

    public void setCondicionUrgencia(String condicionUrgencia) {
        this.condicionUrgencia = condicionUrgencia;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
    }

    @Override
    public double calcularValorFinal() {
        return 0;
    }

}
