package SistemaGestionMaquinaria;

import SistemaGestionMaquinaria.Maquinas.Excavadora;
import SistemaGestionMaquinaria.base.Maquinaria;

import java.util.ArrayList;

public class GestorMaquina {
    //declaro el el atributo que almacenara la coleccion

    private ArrayList<Maquinaria> listaMaquinarias;

    //Creo el constructor:


    public GestorMaquina() {
    //dentro del constructor creo la lista:

        this.listaMaquinarias = new ArrayList<>();

    }
    //creo el metodo para registar maquinaria

    public void registrarMaquinaria(Maquinaria maquinaria){ //recibe como parametro lo q se quiere guardar y el nombre

        //nombre de la lista + .add que en sus parametros recibe el objeto
        listaMaquinarias.add(maquinaria);
        System.out.println(maquinaria.getCodigoMaquina()+ "(" + maquinaria.getClass().getSimpleName() + ")"+"registrada correctamente ");
    }
//creo el metodo para buscar dentro de la lista, el tipo de dato q retorna es de tipo lista

    public ArrayList<Maquinaria> buscarMaquinaria (String criterio){
        //creo una nueva lista para guardar y retornar las coincidencias
        ArrayList<Maquinaria> resultado = new ArrayList<>();
        for (Maquinaria maquinaria : listaMaquinarias){

            if (maquinaria.getCodigoMaquina().equals(criterio)){
                resultado.add(maquinaria);
            }

        }
        if (resultado.isEmpty()){
            System.out.println("No se encontraron resultados");
        }
        return resultado;

    }

    public void listarMaquinaria(){
        for (Maquinaria maquina : listaMaquinarias) {
            System.out.println(maquina);
        }
    }



}
