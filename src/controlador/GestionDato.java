/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Controlador.Lista;
import modelo.Casa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jose
 */
public class GestionDato {
    
    int cont=0;

    public List OrdenarBurbuja(List<Casa> lista) {
        
        System.err.println("Ordenamiento Burbuja");
        for (int i = 0; i < lista.size(); i++) {

            for (int j = i + 1; j < lista.size(); j++) {

                if (lista.get(i).getCodigo() > lista.get(j).getCodigo()) {

                    Casa aux = lista.get(i);
                    lista.set(i, lista.get(j));
                    lista.set(j, aux);

                }

            }

        }
        
        return lista;
    }

    public List OrdenarQuicksort(List<Casa> lista, int izq, int der) {
        
        
        if(cont==0){
             System.err.println("Ordenamiento QuickSort");
        }
       
        Casa pivote = lista.get(izq); // tomamos primer elemento como pivote
        int i = izq; // i realiza la búsqueda de izquierda a derecha
        int j = der; // j realiza la búsqueda de derecha a izquierda
        Casa aux;

        while (i < j) {            // mientras no se crucen las búsquedas
            while (lista.get(i).getCodigo() <= pivote.getCodigo() && i < j) {
                i++; // busca elemento mayor que pivote
            }
            while (lista.get(j).getCodigo() > pivote.getCodigo()) {
                j--;         // busca elemento menor que pivote
            }
            if (i < j) {                      // si no se han cruzado                      
                aux = lista.get(i);                  // los intercambia
                lista.set(i, lista.get(j));
                lista.set(j, aux);
            }
        }
        lista.set(izq, lista.get(j)); // se coloca el pivote en su lugar de forma que tendremos
        lista.set(j, pivote); // los menores a su izquierda y los mayores a su derecha
        if (izq < j - 1) {
            cont++;
            OrdenarQuicksort(lista, izq, j - 1); // ordenamos subarray izquierdo
        }
        if (j + 1 < der) {
            cont++;
            OrdenarQuicksort(lista, j + 1, der); // ordenamos subarray derecho
        }
        
        return lista;
    }

}
