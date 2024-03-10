/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package es.daw.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alumnot
 */
public class CalculadoraTest {
    
    public static double a, b, solucionSuma, solucionResta, solucionProducto, solucionDivision;
    
    public CalculadoraTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        a = 1;
        b = 2;
        solucionSuma = 3;
        solucionResta = -1;
        solucionProducto = 2;
        solucionDivision = 0.5;
    }
    
    @AfterAll
    public static void tearDownClass() {
        // Limpiar cosas
    }
    
    @BeforeEach
    public void setUp() {
        // Antes de ejecutar cada test
    }
    
    @AfterEach
    public void tearDown() {
        // Después de ejecutar cada test
    }

    /**
     * Test of sumar method, of class Calculadora.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        assertEquals(solucionSuma, Calculadora.sumar(a, b));
    }

    /**
     * Test of restar method, of class Calculadora.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        assertEquals(solucionResta, Calculadora.restar(a, b));
    }

    /**
     * Test of division method, of class Calculadora.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        assertEquals(solucionDivision, Calculadora.division(a, b));
    }

    /**
     * Test of producto method, of class Calculadora.
     */
    @Test
    public void testProducto() {
        System.out.println("producto");
        assertEquals(solucionProducto, Calculadora.producto(a, b));
    }

    /**
     * Test of esPositivo method, of class Calculadora.
     */
    @Test
    public void testEsPositivo() {
        System.out.println("esPositivo");
        assertAll(() -> {
            assertFalse(Calculadora.esPositivo(Integer.MIN_VALUE));
            assertFalse(Calculadora.esPositivo(-1));
            assertFalse(Calculadora.esPositivo(0));
            assertTrue(Calculadora.esPositivo(1));
            assertTrue(Calculadora.esPositivo(Integer.MAX_VALUE));
        });
    }
    
}
