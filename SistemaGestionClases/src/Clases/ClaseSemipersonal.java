package Clases;

import Base.Clase;

public class ClaseSemipersonal extends Clase {

    private int cantidadParticipantes;

    public ClaseSemipersonal() {
    }

    public ClaseSemipersonal(String nombre, int cupoMaximo, int duracion, int cantidadParticipantes) {
        super(nombre, cupoMaximo, duracion);
//        this.cantidadParticipantes = cantidadParticipantes;
        this.setCantidadParticipantes(cantidadParticipantes);
    }

    public int getCantidadParticipantes() {
        return cantidadParticipantes;
    }

    public void setCantidadParticipantes(int cantidadParticipantes) {
        this.cantidadParticipantes = cantidadParticipantes;
    }

    @Override
    public double calcularCosto() {
        double costo = 18000;
        if (cantidadParticipantes > 3){
            costo = costo * 1.10;
        }

        return costo;
    }
}
