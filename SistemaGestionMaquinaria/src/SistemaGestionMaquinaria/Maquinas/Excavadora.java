package SistemaGestionMaquinaria.Maquinas;

import SistemaGestionMaquinaria.Certificable;
import SistemaGestionMaquinaria.base.Maquinaria;

public class Excavadora extends Maquinaria implements Certificable {
    private double peso;
    private boolean mantencionAlDia,certificacionActiva;

    public Excavadora() {
        //super();
    }

    public Excavadora(String codigoMaquina, int horasUso, int potencia, double peso, boolean mantencionAlDia) {
        super(codigoMaquina, horasUso, potencia);
        //this.peso = peso;
        this.setPeso(peso);
        //this.mantencionAlDia = mantencionAlDia;
        this.setMantencionAlDia(mantencionAlDia);
        //this.certificacionActiva = false;
        this.setCertificacionActiva(certificacionActiva);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isMantencionAlDia() {
        return mantencionAlDia;
    }

    public void setMantencionAlDia(boolean mantencionAlDia) {
        this.mantencionAlDia = mantencionAlDia;
    }

    public boolean isCertificacionActiva() {
        return certificacionActiva;
    }

    public void setCertificacionActiva(boolean certificacionActiva) {
        this.certificacionActiva = certificacionActiva;
    }

    @Override
    public double calcularCosto() {
        double costo = 150000;
        if (mantencionAlDia){
            return costo;
        }
        return (costo * 1.25);

    }


    @Override
    public boolean certificacionActiva() {

        return certificacionActiva;
    }

    @Override
    public void asignarCertificado() {

        certificacionActiva = true;
    }

}
