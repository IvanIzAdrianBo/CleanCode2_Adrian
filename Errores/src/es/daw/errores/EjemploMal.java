/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw.errores;

/**
 *
 * @author alumnot
 */
public class EjemploMal {
    public static void main(String[] args){
        String cadena = "Esto es una cadena de caracteres";
        char[] letras = {'a', 'x', 'e'};
        for (char letra : letras) {
            int pos = buscarLetra(cadena, letra);
            if (pos != -1)
                System.out.println("Se ha encontrado la letra " + letra + " en " + pos);
            else
                System.out.println("No se ha encontrado la letra " + letra);
        }
    }
    
    // Devuelve la posición de la primera coincidencia que encuentre
    public static int buscarLetra(String cadena, char letra){
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letra)
                return i;
        }
        //return null; // Esto no funca
        return -1;
    }
}
