/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.Casa;
import modelo.Propietario;
import Controlador.Diccionario;
import controlador.GestionDato;
import Controlador.Lista;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pulpo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GestionDato gd = new GestionDato();
        
             
        System.err.println("*****************************************");
        System.err.println("            Agregar Propietarios ");
        System.err.println("*****************************************");
        
        Propietario p = new Propietario(123, "Juan Perez");
        Propietario p1 = new Propietario(456, "Marco Rene");
        Propietario p2 = new Propietario(2341, "Tito Durazno  ");
        Propietario p3 = new Propietario(223423, "Henry Guaman");
       
        Diccionario d = new Diccionario();
        d.agregarElemento(1, p);
        d.agregarElemento(2, p1);
        d.agregarElemento(3, p2);
        d.agregarElemento(4, p3);
        d.imprimir();
        
        
        
        
        System.err.println("*****************************************");
        System.err.println("         Eliminar un propietario");
        System.err.println("*****************************************");
        System.err.println("NOTA: EN ESTE CASO EL PROPIETARIO N°3");
        d.eliminarElemento(2);
        
        System.err.println("*****************************************");
        System.err.println("         Recuperar un propietario");
        System.err.println("*****************************************");
        System.err.println("NOTA: EN ESTE CASO EL PROPIETARIO N°4");
        d.recuperarElemento(3);
        
        System.err.println("*****************************************");
        System.err.println("        Recuperar todos propietario");
        System.err.println("*****************************************");
        d.recuperarElementos();
        
        d.imprimir();
        
        
        System.err.println("*****************************************");
        System.err.println("              Agregar Casas");
        System.err.println("*****************************************");
        
        Casa c = new Casa(1, p);
        Casa c1 = new Casa(2, p1);
        Casa c2 = new Casa(3, p);
        Casa c3 = new Casa(4, p1);
        
        Lista list = new Lista();
        list.agregarElemento(c);
        list.agregarElemento(c1);
        list.agregarElemento(c2);
        list.agregarElemento(c3);
        
        List<Casa> lista = new ArrayList();
        lista.add(c);
        lista.add(c1);
        lista.add(c2);
        lista.add(c3);
        
        list.imprimir();
        
        System.err.println("*****************************************");
        System.err.println("              Eliminar casa");
        System.err.println("*****************************************");
        list.eliminarElemento(c1);
        
        System.err.println("*****************************************");
        System.err.println("              Recuperar casa");
        System.err.println("*****************************************");
        System.err.println("NOTA: EN ESTE CASO LA CASA N°1");
        list.recuperarElemento(1);
        
        
        
        System.err.println("*****************************************");
        System.err.println("           Ordenamiento Burbuja");
        System.err.println("*****************************************");
        System.out.println(gd.OrdenarBurbuja(lista));
        
        
         
        System.err.println("*****************************************");
        System.err.println("           Ordenamiento QuickSort");
        System.err.println("*****************************************");
        System.out.println(gd.OrdenarQuicksort(lista, 0, 3));
        
       
        
       

    }

}
