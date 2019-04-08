

import calculator.domain.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Calculator calculator = new Calculator();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testMethodAdd() {
        Calculator calculator = new Calculator();
        int x = 3;
        int y = 4;
        
        assertEquals(7.0,calculator.add(x,y),0.001);
               
    }
    @Test
    public void testMethodSub() {
        Calculator calculator = new Calculator();
        int x = 35;
        int y = 43;
        
        assertEquals(-8.0,calculator.sub(x,y),0.001);
               
    }
    @Test
    public void testMethodMult() {
        Calculator calculator = new Calculator();
        int x = 4;
        int y = 7;
        
        assertEquals(28.0,calculator.mult(x,y),0.001);
    }
    @Test
    public void testMethodFact() {
        Calculator calculator = new Calculator();
        int x = 4;
        
        assertEquals(24.0,calculator.fact(x),0.001);
    }
}
