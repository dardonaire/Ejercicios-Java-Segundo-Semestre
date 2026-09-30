package SistemaGestionMaquinaria.Maquinas;

import SistemaGestionMaquinaria.base.Maquinaria;

public class CargadorFrontal extends Maquinaria {

    private double capacidadBalde;

    public CargadorFrontal() {
    }

    public CargadorFrontal(String codigoMaquina, int horasUso, int potencia, double capacidadBalde) {
        super(codigoMaquina, horasUso, potencia);
        this.setCapacidadBalde(capacidadBalde);
    }

    public double getCapacidadBalde() {
        return capacidadBalde;
    }

    public void setCapacidadBalde(double capacidadBalde) {
        this.capacidadBalde = capacidadBalde;
    }

    @Override
    public double calcularCosto() {

        double costo = 120000;
        if (capacidadBalde > 3){
            costo  = costo * 1.20;
        }
        return costo;
    }
}

