/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso.extra;

import java.util.ArrayList;

/**
 *
 * @author curso
 * @param <T>
 */
public class Grafo <T>{
    
    private ArrayList<Nodo<T>> listaNodos;
    private ArrayList<Arco<T>> listaArcos;
    
    public Grafo() {
        listaNodos = new ArrayList<Nodo<T>>();
        listaArcos = new ArrayList<Arco<T>>();
    }
    
    public Nodo<T> agregarNodo(T pValue){       
        Nodo<T> nuevoNodo = new Nodo(pValue);
        listaNodos.add(nuevoNodo);
        return nuevoNodo;
    }
    
    public void agregarArco(Nodo<T> origen, Nodo<T> destino, int peso){
        Arco<T> nuevoArco = new Arco(origen, destino, peso);
        listaArcos.add(nuevoArco);     
        origen.agregarArco(nuevoArco);
        
        nuevoArco = new Arco(destino, origen, peso);
        listaArcos.add(nuevoArco);        
        destino.agregarArco(nuevoArco);        
    }
    
    
    
    public ArrayList<Nodo<T>> getNodos(){
        return listaNodos;
    }

    @Override
    public String toString() {
        return "Grafo{" + "listaNodos=" + listaNodos + ", listaArcos=" + listaArcos + '}';
    }

    
    
    
    
    
}
