/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Desafios;

import junit.framework.TestCase;

/**
 *
 * @author jony_
 */
public class SumTest extends TestCase {
    
    private Desafios.Sum soma;
    
    public SumTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        soma = new Desafios.Sum();
    }
    
    
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of GetSum method, of class Sum.
     */
    public void testGetSum() {
        assertEquals(-1, soma.GetSum(0, -1));
        assertEquals(1, soma.GetSum(0, 1));
    }
    
}
