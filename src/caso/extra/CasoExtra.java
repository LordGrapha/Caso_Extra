/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso.extra;

import java.awt.Point;

/**
 *
 * @author curso
 */
public class CasoExtra {

    public static void main(String[] args) {

        MapManager nuevoMap = new MapManager();
        
        Nodo<Point> nodo1 = nuevoMap.agregarPunto(12, 20);
        Nodo<Point> nodo2 = nuevoMap.agregarPunto(30, 40);
        Nodo<Point> nodo3 = nuevoMap.agregarPunto(6, 5);
        
        Point nuevoPunto = new Point(5, 5);
        Nodo<Point> nuevoNodo1 = new Nodo<>(nuevoPunto);
        nuevoMap.agregarArco(nuevoNodo1);
        
        System.out.println(nodo1.getValor().toString());
        System.out.println(nodo2.getArcos().get(0).getDestino().toString());
        System.out.println(nodo2.getArcos().toString());     
        
        
        
        }
    
        
    }
