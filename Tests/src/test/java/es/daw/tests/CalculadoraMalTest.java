/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// El nombre de este test no es correcto
// Debería ser "nombre clase" + Test
public class CalculadoraMalTest {
    
    @Test
    public void testSumar() {
        System.out.println("sumar");
        double a = 1;
        double b = 2;
        double solucionSuma = 3;
        assertEquals(solucionSuma, Calculadora.sumar(a, b));
    }
    
    @Test
    public void testResta() {
        System.out.println("resta");
        double a = 1;   // } Codigo repetido
        double b = 2;   // }
        double solucionResta = -1;
        assertEquals(solucionResta, Calculadora.restar(a, b));
    }
    
    @Test
    public void testProducto() {
        System.out.println("producto");
        double a = 1;   // } Codigo repetido
        double b = 2;   // }
        double solucionProducto = 2;
        assertEquals(solucionProducto, Calculadora.producto(a, b));
    }
    
    @Test
    public void testDivision() {
        System.out.println("division");
        double a = 1;   // } Codigo repetido
        double b = 2;   // }
        double solucionDivision = 0.5;
        assertEquals(solucionDivision, Calculadora.division(a, b));
    }
    
    // Mal: Evitar numerar funciones con el mismo nombre
    @Test
    public void testEsPositivo1(){assertFalse(Calculadora.esPositivo(Integer.MIN_VALUE));}
    @Test
    public void testEsPositivo2(){assertFalse(Calculadora.esPositivo(-1));}
    @Test
    public void testEsPositivo3(){assertFalse(Calculadora.esPositivo(0));}
    @Test
    public void testEsPositivo4(){assertTrue(Calculadora.esPositivo(1));}
    @Test
    public void testEsPositivo5(){assertTrue(Calculadora.esPositivo(Integer.MAX_VALUE));}
    
    
    @Test
    public void testEsPositivo(){
        // Mal, solo debe haber un assert por test
        assertFalse(Calculadora.esPositivo(Integer.MIN_VALUE));
        assertFalse(Calculadora.esPositivo(-1));
        assertFalse(Calculadora.esPositivo(0));
        assertTrue(Calculadora.esPositivo(1));
        assertTrue(Calculadora.esPositivo(Integer.MAX_VALUE));
    }
    
    @Test
    public void testUnMontonDeCosasQueNoTienenQueVerUnaConLaOtraLoCualNoSeConsiderariaCleanCode(){
        assertEquals(5, Calculadora.sumar(2, 3));
        assertEquals(2, Calculadora.restar(6, 4));
        assertEquals(12, Calculadora.producto(6, 2));
        assertEquals(3, Calculadora.division(9, 3));
        assertFalse(Calculadora.esPositivo(Integer.MIN_VALUE));
        assertFalse(Calculadora.esPositivo(-1));
        assertFalse(Calculadora.esPositivo(0));
        assertTrue(Calculadora.esPositivo(1));
        assertTrue(Calculadora.esPositivo(Integer.MAX_VALUE));
    }
}
