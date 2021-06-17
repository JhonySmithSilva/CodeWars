package Desafios;

import junit.framework.TestCase;

public class MultiplyTest extends TestCase {

    private Desafios.Multiply mult;
    
    public MultiplyTest(String testName) {
        super(testName);        
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mult = new Desafios.Multiply();
    }
    
    protected void tearDonw() throws Exception {
        super.tearDown();
    }
    
    public void testMultiply(double a, double b){
        assertEquals(4, mult.multiply(2, 2));
    }
}
