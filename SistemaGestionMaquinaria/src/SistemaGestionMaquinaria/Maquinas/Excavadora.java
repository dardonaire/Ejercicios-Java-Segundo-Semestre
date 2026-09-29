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
        this.peso = peso;
        this.mantencionAlDia = mantencionAlDia;
        this.certificacionActiva = false;
    }

    @Override
    public double calcularCosto() {
        return 0;
    }

    @Override
    public boolean certificacionActiva() {
        return false;
    }

    @Override
    public boolean asignarCertificado() {
        return false;
    }
}
