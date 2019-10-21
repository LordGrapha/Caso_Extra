/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso.extra;

import java.awt.Point;
import java.util.Observable;

/**
 *
 * @author curso
 */
public class MapManager extends Observable{
    
    private Grafo<Point> grafo;
    private Nodo<Point> ultimoAgregado;
    
    public MapManager(){
        grafo = new Grafo();
        ultimoAgregado = null;
    }
    
    public Nodo<Point> agregarPunto(int x, int y){
        
        Point nuevoPunto = new Point(x, y);
        Nodo<Point> nuevo = grafo.agregarNodo(nuevoPunto);
        
        if (ultimoAgregado!=null) {
            grafo.agregarArco(ultimoAgregado, nuevo, 1);
        }
        ultimoAgregado = nuevo;
        this.setChanged();
        this.notifyObservers(nuevo);
        return nuevo;
        
    }

    public Nodo<Point> agregarArco(Nodo<Point> destino){
        
        grafo.agregarArco(ultimoAgregado, destino, 1);
        ultimoAgregado = destino;
        return destino;
    }
    
    public Nodo<Point> getUltiAgregado(){
        return this.ultimoAgregado;
    }
    
    public void anchuraDelGrafo(Nodo<Point> pPartida){
        grafo.recorridoAnchura(pPartida);
    }
    
    public void profundidadDelGrafo(Nodo<Point> pPartida){
        grafo.recorridoProfundidad(pPartida);
    }
    
}
