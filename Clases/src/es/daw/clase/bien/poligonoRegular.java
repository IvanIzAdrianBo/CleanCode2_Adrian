/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw.clase.bien;

/**
 *
 * @author adrian
 */
public class poligonoRegular {
    private int numeroLados;
    private double longitudLado;
    
    public poligonoRegular(int numeroLados, double longitudLado){
        this.numeroLados = numeroLados;
        this.longitudLado = longitudLado;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public double getLongitudLado() {
        return longitudLado;
    }

    public void setLongitudLado(double longitudLado) {
        this.longitudLado = longitudLado;
    }

    
    
    
}
