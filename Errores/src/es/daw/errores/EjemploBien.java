/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw.errores;

import es.daw.exeptions.LetraNoEncontrada;

/**
 *
 * @author alumnot
 */
public class EjemploBien {
    public static void main(String[] args){
        String cadena = "Esto es una cadena de caracteres";
        char[] letras = {'a', 'x', 'e'};
        for (char letra : letras) {
            try {
                System.out.println("Se ha encontrado la letra " + letra + 
                        " en " + buscarLetra(cadena, letra));
            } catch (LetraNoEncontrada ex) { 
                System.out.println(ex.getMessage());
            }
        }
    }
    
    // Devuelve la posición de la primera coincidencia que encuentre
    public static int buscarLetra(String cadena, char letra) throws LetraNoEncontrada{
        for (int i = 0; i < cadena.length(); i++)
            if (cadena.charAt(i) == letra)
                return i;
        throw new LetraNoEncontrada("No se ha encontrado la letra " + letra);
    }
}
