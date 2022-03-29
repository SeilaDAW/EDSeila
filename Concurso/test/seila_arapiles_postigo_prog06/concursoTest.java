/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seila_arapiles_postigo_prog06;

/**
 *
 * @author Seila
 */
public class concursoTest {

    public concursoTest() {
    }

    /**
     * Test of valida method, of class Fechaa.
     */
    @Test
    public void testNumRondas() {
        //caso1
        System.out.println("valido");
        R rondasValidas = new R(3);
        boolean result = rondasValidas.valida();
        assertTrue(result);

        //caso2
        System.out.println("valido");
        R rondasValidas2 = new R(5);
        result = rondasValidas.valida();
        assertTrue(result);
        
                //caso3
        System.out.println("valido");
        R rondasValidas3 = new R(10);
        result = rondasValidas.valida();
        assertTrue(result);
        
                //caso4
        System.out.println("valido");
        R rondasValidas4 = new R(20);
        result = rondasValidas.valida();
        assertTrue(result);
        
                //caso5
        System.out.println("error");
        R rondasNoValidas = new R(0);
        result = rondasValidas.valida();
        assertFalse(result);
        
                        //caso6
        System.out.println("error");
        R rondasNoValidas2 = new R(21);
        result = rondasValidas.valida();
        assertFalse(result);
        
                                //caso7
        System.out.println("error");
        R rondasNoValidas3 = new R(-1);
        result = rondasValidas.valida();
        assertFalse(result);
    }
}
