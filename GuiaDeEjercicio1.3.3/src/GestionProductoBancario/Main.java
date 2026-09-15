package GestionProductoBancario;

import GestionProductoBancario.base.ProductoBancario;
import GestionProductoBancario.productos.CuentaAhorro;
import GestionProductoBancario.productos.CuentaCorriente;

public class Main {
    public static void main(String[] args) {
        //creo una variable llamada cuenta 1 y que va a guardar una nueva CuentaCorriente

        ProductoBancario producto1 = new CuentaCorriente("001",
                "Darinka", 100000,50000);
        ProductoBancario producto2 = new CuentaAhorro("002", "Darinka", 100000, 5);

        producto1.depositar(20000);
        producto2.depositar(30000);

        producto1.mostrarResumen();
        producto2.mostrarResumen();
    }
}
