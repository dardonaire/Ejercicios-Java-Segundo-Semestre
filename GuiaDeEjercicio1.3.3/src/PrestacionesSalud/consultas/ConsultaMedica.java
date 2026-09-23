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
    public String toString() {
        return "ConsultaMedica{" +
                "especialidad='" + especialidad + '\'' +
                ", porcentajeAdicional=" + porcentajeAdicional +
                "} " + super.toString();
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Resumen Paciente");
        System.out.println("IDentificador:"+ super.getIdentificador());
        System.out.println("Nombre Paciente:" + super.getNombrePaciente());
        System.out.println("Valor GestionPolizaSeguros.GestionPolizaSeguros.base.base:" + super.getValorBase());
        System.out.println("Especialidad:" + especialidad);
        System.out.println("Porcentaje:" + porcentajeAdicional);
    }

    @Override
    public double calcularValorFinal() {
        return super.getValorBase() + (super.getValorBase() * this.porcentajeAdicional/100);
    }
}
