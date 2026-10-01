package Base;

public abstract class Clase {
    protected String nombre;
    protected int cupoMaximo;
    protected int duracion;

    public Clase() {
    }

    public Clase(String nombre, int cupoMaximo, int duracion) {
//        this.nombre = nombre;
        this.setNombre(nombre);
//        this.cupoMaximo = cupoMaximo;
        this.setCupoMaximo(cupoMaximo);
//        this.duracion = duracion;
        this.setDuracion(duracion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        if (nombre == null || nombre.trim().isEmpty()){
            throw new IllegalArgumentException("EL nombre no puede estar vacio");
        }
        this.nombre = nombre;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(int cupoMaximo) {
        if (cupoMaximo < 1 || cupoMaximo > 30){
            throw new IllegalArgumentException("Ingrese valor entre 1 y 30");
        }
        this.cupoMaximo = cupoMaximo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        if (duracion <= 0){
            throw new IllegalArgumentException("Ingrese valor mayor a 0");
        }
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Clase: " +
                "Nombre: " + nombre + '\'' +
                "Cupo máximo: " + cupoMaximo;
    }

    public abstract double calcularCosto();

}
