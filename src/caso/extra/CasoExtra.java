/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso.extra;

import gui.VentanaPrincipal;
import java.awt.Point;

/**
 *
 * @author curso
 */
public class CasoExtra {

    /*public static void main(String[] args) {

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
        
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.
        }
    */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
        
    }
