/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es.daw.datos;

import es.daw.datos.model.Punto;
import es.daw.datos.model.Recta;

/**
 *
 * @author adrian
 */
public class Datos {

    public static void main(String[] args) {
        Recta recta = new Recta(new Punto(0,2), new Punto(4,2));
        
        System.out.println(recta.getP1().getY());   // Mal
        
        System.out.println(recta.getY1());          // Bien
    }
    
}
