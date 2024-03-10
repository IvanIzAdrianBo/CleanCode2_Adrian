/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw.clase.bien;

/**
 *
 * @author adrian
 */
public class Utilidades {
    
    static public double calcularPerimetro(poligonoRegular poligono){
        return poligono.getNumeroLados() * poligono.getLongitudLado();
    }
    
}
