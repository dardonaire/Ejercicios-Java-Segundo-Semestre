package Clases;

import Base.Clase;

public class ClasePersonal extends Clase implements Cancelable{

    private String nombreInstructor;
    private boolean cuentaEvaluacion;
    private boolean cancelacionActiva;

    public ClasePersonal() {
    }

    public ClasePersonal(String nombre, int cupoMaximo, int duracion, String nombreInstructor, boolean cuentaEvaluacion, boolean cancelacionActiva) {
        super(nombre, cupoMaximo, duracion);
//        this.nombreInstructor = nombreInstructor;
        this.setNombre(nombre);
//        this.cuentaEvaluacion = cuentaEvaluacion;
        this.setCuentaEvaluacion(cuentaEvaluacion);
//        this.cancelacionActiva = cancelacionActiva;
        this.setCancelacionActiva(cancelacionActiva);
    }

    public String getNombreInstructor() {
        return nombreInstructor;
    }

    public void setNombreInstructor(String nombreInstructor) {
        this.nombreInstructor = nombreInstructor;
    }

    public boolean isCuentaEvaluacion() {
        return cuentaEvaluacion;
    }

    public void setCuentaEvaluacion(boolean cuentaEvaluacion) {
        this.cuentaEvaluacion = cuentaEvaluacion;
    }

    public boolean isCancelacionActiva() {
        return cancelacionActiva;
    }

    public void setCancelacionActiva(boolean cancelacionActiva) {
        this.cancelacionActiva = cancelacionActiva;
    }

    @Override
    public double calcularCosto() {
        double costo = 35000;
        if (!cuentaEvaluacion){
            costo = costo * 1.20;
            return costo;
        }
        return costo;

    }

    @Override
    public boolean cancelacionActiva() {
        return cancelacionActiva;
    }

    @Override
    public void registrarCancelacion() {
        cuentaEvaluacion = true;

    }
}
