package SistemaInversionFinanciera;

import SistemaInversionFinanciera.base.InstruementoFinanciero;
import SistemaInversionFinanciera.instrumentos.Accion;
import SistemaInversionFinanciera.instrumentos.DepositoPlazo;
import SistemaInversionFinanciera.instrumentos.FondoInversion;
import SistemaInversionFinanciera.Interfaces.Liquidable;

public class Main {
    public static void main(String[] args){

        InstruementoFinanciero instrumento1 = new DepositoPlazo("DP001",
                "Depósito a plazo",
                100000,
                2,
                6);
        InstruementoFinanciero instrumento2 = new FondoInversion("FI001",
                "Fondo de inversión",
                100000,
                10,
                2,
                1500);
        InstruementoFinanciero instrumento3 = new Accion("AC001",
                "Acciones",
                10000,
                1000,
                1200,
                10);

        instrumento1.mostrarResumen();
        instrumento2.mostrarResumen();
        instrumento3.mostrarResumen();

        instrumento1.calcularRentabilidad();
        instrumento2.calcularRentabilidad();
        instrumento3.calcularRentabilidad();

        instrumento1.obtenerNivelRiesgo();
        instrumento2.obtenerNivelRiesgo();
        instrumento3.obtenerNivelRiesgo();

        System.out.println(instrumento1.calcularRentabilidad());
        System.out.println(instrumento2.calcularRentabilidad());
        System.out.println(instrumento3.calcularRentabilidad());

        System.out.println(instrumento1.obtenerNivelRiesgo());
        System.out.println(instrumento2.obtenerNivelRiesgo());
        System.out.println(instrumento3.obtenerNivelRiesgo());

        if (instrumento1 instanceof Liquidable) {
            Liquidable liquidable = (Liquidable) instrumento1;
            System.out.println(liquidable.liquidar());
        }

        if (instrumento2 instanceof Liquidable) {
            Liquidable liquidable = (Liquidable) instrumento2;
            System.out.println(liquidable.liquidar());
        }

        if (instrumento3 instanceof Liquidable) {
            Liquidable liquidable = (Liquidable) instrumento3;
            System.out.println(liquidable.liquidar());
        }


    }
}
