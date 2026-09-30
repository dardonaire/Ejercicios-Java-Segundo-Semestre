package SistemaGestionMaquinaria;

import SistemaGestionMaquinaria.Maquinas.CargadorFrontal;
import SistemaGestionMaquinaria.Maquinas.Excavadora;
import SistemaGestionMaquinaria.base.Maquinaria;

import java.util.ArrayList;


public class main {
    public static void main (String[] args) {

        Excavadora excavadora1 = new Excavadora("MAQ-EX01", 3200, 210,
                18.5,false);
        Excavadora excavadora2 = new Excavadora("MAQ-EX02", 800,
                180, 14.0, true );
        CargadorFrontal cargaFrontal1 = new CargadorFrontal("MAQ-CG01",1500,
                150, 3.5);
        CargadorFrontal cargaFrontal2 = new CargadorFrontal("MAQ-CG02", 400 ,
                130,2.0);


        excavadora1.asignarCertificado();

        GestorMaquina gestor1 = new GestorMaquina();

        gestor1.registrarMaquinaria(excavadora1);
        gestor1.registrarMaquinaria(excavadora2);
        gestor1.registrarMaquinaria(cargaFrontal1);
        gestor1.registrarMaquinaria(cargaFrontal2);


        ArrayList<Maquinaria> busqueda = gestor1.buscarMaquinaria("MAQ-EX01");

        for (Maquinaria maquinaria : busqueda){
            if (maquinaria instanceof Excavadora) {
                Excavadora excavadora = (Excavadora) maquinaria;
                System.out.println(excavadora.getCodigoMaquina());
                System.out.println(excavadora.getHorasUso());
                System.out.println(excavadora.getPotencia());
                System.out.println(excavadora.getPeso());
                System.out.println(excavadora.isMantencionAlDia());
                System.out.println(excavadora.certificacionActiva());
                System.out.println(excavadora.calcularCosto());

            }




    }

}
}


