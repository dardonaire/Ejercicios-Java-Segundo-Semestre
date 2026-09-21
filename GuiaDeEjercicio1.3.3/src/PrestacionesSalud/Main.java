package PrestacionesSalud;

import PrestacionesSalud.base.PrestacionSalud;
import PrestacionesSalud.consultas.ConsultaMedica;
import PrestacionesSalud.consultas.ExamenLaboratorio;
import PrestacionesSalud.consultas.SesionKinesiologia;

public class Main {
    public static void main(String[] args) {
        PrestacionSalud prestacion1 = new ConsultaMedica("CM0001","Alejandro Fernandez",25000,"Medicina General",15);
        PrestacionSalud prestacion2 = new ExamenLaboratorio("EL002","CAMILA ROJAS",18000,"Examen de sangre",true,20);
        PrestacionSalud prestacion3 = new SesionKinesiologia("SK003","MATIAS SOTO",15000,45,300);

        System.out.println(prestacion1.calcularValorFinal());
        System.out.println(prestacion2.calcularValorFinal());
        System.out.println(prestacion3.calcularValorFinal());
        System.out.println(prestacion1.coincideConPaciente("ALEJANDRO"));

        prestacion1.mostrarInformacion();
        prestacion2.mostrarInformacion();
        prestacion3.mostrarInformacion();

    }
}
