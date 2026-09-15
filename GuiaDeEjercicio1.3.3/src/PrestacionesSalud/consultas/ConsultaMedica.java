package PrestacionesSalud.consultas;

import PrestacionesSalud.base.PrestacionSalud;

public class ConsultaMedica extends PrestacionSalud {
    private String especialidad;
    private double porcentajeAdicional;

    public ConsultaMedica() {
    }

    public ConsultaMedica(String identificador, String nombrePaciente, double valorBase, String especialidad, double porcentajeAdicional) {
        super(identificador, nombrePaciente, valorBase);
        this.especialidad = especialidad;
        this.porcentajeAdicional = porcentajeAdicional;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getPorcentajeAdicional() {
        return porcentajeAdicional;
    }

    public void setPorcentajeAdicional(double porcentajeAdicional) {
        this.porcentajeAdicional = porcentajeAdicional;
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
