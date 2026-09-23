package PrestacionesSalud.consultas;

import PrestacionesSalud.base.PrestacionSalud;

public class SesionKinesiologia extends PrestacionSalud {
    private int duracionMinutos;
    private double valorAdicionalMinuto;

    public SesionKinesiologia() {
    }

    public SesionKinesiologia(String identificador, String nombrePaciente, double valorBase, int duracionMinutos, double valorAdicionalMinuto) {
        super(identificador, nombrePaciente, valorBase);
        this.duracionMinutos = duracionMinutos;
        this.valorAdicionalMinuto = valorAdicionalMinuto;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public double getValorAdicionalMinuto() {
        return valorAdicionalMinuto;
    }

    public void setValorAdicionalMinuto(double valorAdicionalMinuto) {
        this.valorAdicionalMinuto = valorAdicionalMinuto;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Resumen Paciente");
        System.out.println("IDentificador:"+ super.getIdentificador());
        System.out.println("Nombre Paciente:" + super.getNombrePaciente());
        System.out.println("Valor GestionPolizaSeguros.GestionPolizaSeguros.base.base:" + super.getValorBase());
        System.out.println("Duración de minutos:" + duracionMinutos);
        System.out.println("Valor adicional al minuto:" + valorAdicionalMinuto);
    }

    @Override
    public double calcularValorFinal() {
        return super.getValorBase() + (this.duracionMinutos * this.valorAdicionalMinuto);

    }
}
