package Clases;

import Base.Clase;

import java.util.ArrayList;

public class GestorCentro {

    private ArrayList<Clase> listaClases;

    public GestorCentro() {

        this.listaClases = new ArrayList<>();
    }

    public void registrarClase(Clase claseRegistrada){

        listaClases.add(claseRegistrada);
        System.out.println(claseRegistrada.getNombre() + claseRegistrada.getClass() + "registrada correctamente");
    }

    public ArrayList<Clase> buscarClase(String criterio){

        ArrayList<Clase> listaEncontrada = new ArrayList<>();

        for (Clase encontrado : listaClases){
            if (encontrado.getNombre().equals(criterio)){
                listaEncontrada.add(encontrado);

            }

        }
        return listaEncontrada;

    }
    public void listarClases(){
        for (Clase clases : listaClases){
            System.out.println(clases);

        }
    }
}
