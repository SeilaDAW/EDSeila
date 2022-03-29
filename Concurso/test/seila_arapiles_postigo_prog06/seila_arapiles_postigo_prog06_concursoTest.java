/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package seila_arapiles_postigo_prog06;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Seila
 */
public class seila_arapiles_postigo_prog06_concursoTest {
    
    public seila_arapiles_postigo_prog06_concursoTest() {
    }
    
    /**
     * Test of exprMat method, of class seila_arapiles_postigo_prog06_concurso.
     */
    @Test
    public void testExprMat() {
        System.out.println("exprMat");
        String expResult = "";
        String result = seila_arapiles_postigo_prog06_concurso.exprMat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of numeroRandom method, of class seila_arapiles_postigo_prog06_concurso.
     */
    @Test
    public void testNumeroRandom() {
        System.out.println("numeroRandom");
        int min = 0;
        int max = 0;
        int expResult = 0;
        int result = seila_arapiles_postigo_prog06_concurso.numeroRandom(min, max);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of evaluarExpresion method, of class seila_arapiles_postigo_prog06_concurso.
     */
    @Test
    public void testEvaluarExpresion() {
        System.out.println("evaluarExpresion");
        String expresion = "";
        int expResult = 0;
        int result = seila_arapiles_postigo_prog06_concurso.evaluarExpresion(expresion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class seila_arapiles_postigo_prog06_concurso.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        seila_arapiles_postigo_prog06_concurso.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
