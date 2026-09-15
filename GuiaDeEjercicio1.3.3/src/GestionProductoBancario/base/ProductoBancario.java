package GestionProductoBancario.base;

public abstract class ProductoBancario {
    private String numeroproducto;
    private String  titular;
    private double saldo;


    public ProductoBancario() {
    }

    public ProductoBancario(String numeroproducto, String titular, double saldo) {
        this.numeroproducto = numeroproducto;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumeroproducto() {
        return numeroproducto;
    }

    public void setNumeroproducto(String numeroproducto) {
        this.numeroproducto = numeroproducto;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ProductoBancario{" +
                "numeroproducto=" + numeroproducto +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public abstract void mostrarResumen();


    public void depositar(double monto){
        if (monto > 0){
            this.saldo += monto;
        }else {
            System.out.println("Monto debe ser mayor a 0");
        }
    }


    public abstract boolean girar(double monto);



}
