package SistemaGestionMaquinaria.base;

public abstract class Maquinaria {
    protected String codigoMaquina;
    protected int horasUso;
    protected int potencia;

    public Maquinaria() {
    }

    public Maquinaria(String codigoMaquina, int horasUso, int potencia) {
        //this.codigoMaquina = codigoMaquina;
        this.setCodigoMaquina(codigoMaquina);
        //this.horasUso = horasUso;
        this.setHorasUso(horasUso);
        this.setPotencia(potencia);
    }

    public String getCodigoMaquina() {
        return codigoMaquina;
    }

    public void setCodigoMaquina(String codigoMaquina) {
        if (codigoMaquina == null || codigoMaquina.trim().isEmpty() ){
            throw new IllegalArgumentException("El texto no puede estar vacio");
        }
        this.codigoMaquina = codigoMaquina;
    }

    public int getHorasUso() {
        return horasUso;
    }

    public void setHorasUso(int horasUso) {
        if (horasUso < 0 || horasUso > 20000){
            throw new IllegalArgumentException("Las horas de uso deben estar en un rango de 0 y 20.000");
        }

        this.horasUso = horasUso;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        if (potencia <= 0){
            throw new IllegalArgumentException("EL valor debe ser mayor a 0");
        }
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Maquinaria" +
                "Codigo: '" + codigoMaquina + "|" +
                "Horas: " + horasUso;
    }

    public abstract double calcularCosto();



}
