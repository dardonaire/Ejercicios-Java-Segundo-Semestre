package SistemaGestionMaquinaria;

import SistemaGestionMaquinaria.Maquinas.CargadorFrontal;
import SistemaGestionMaquinaria.Maquinas.Excavadora;
import SistemaGestionMaquinaria.base.Maquinaria;

import java.util.ArrayList;

/* Programacion Orientada a Objetos:
Este programa ordena la solucion mediante clases y objetos, permitiendo ocupar encapsulamiento, herencias y polimorfismo

A diferencia de la programacion que sigue intrucciones paso a paso, en poo podemos maostarr la informacion mediante objetos
con sus atributos y metodos.

Ademas, los objetos pueden reutilizar metodos mediante la herencia, en este caso como Excavadora y CargadorFrontal

 */


public class main {
    public static void main (String[] args) {
        try {

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

            System.out.println("=== BUSQUEDA POR CODIGO: MAQ-EX01 === " );
            Excavadora excavadora = (Excavadora) maquinaria;
            System.out.println("Tipo: Excavadora " + "Codigo: " + excavadora.getCodigoMaquina() +" Horas: " + excavadora.getHorasUso()
            + "  Potencia: " + excavadora.getPotencia() +" HP"
            + "  Peso: " + excavadora.getPeso()+ " ton" + "  Mantencion al dia: " + (excavadora.isMantencionAlDia() ? "Si" : "NO " ) +
                    "  Certificación seguridad: " + (excavadora.isCertificacionActiva() ? "Si" : "No")+ "  Costo Servicio: " + excavadora.calcularCosto());



        System.out.println("===Listado de MAquinaria===");
        gestor1.listarMaquinaria();




        }} catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
}}


