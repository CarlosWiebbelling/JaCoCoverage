/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jacocoverage_example;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author carlos
 */
public class JaCoCoverage_exampleTest {
    
    public JaCoCoverage_exampleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class JaCoCoverage_example.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        JaCoCoverage_example.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class JaCoCoverage_example.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        int a = 0;
        int b = 0;
        JaCoCoverage_example instance = new JaCoCoverage_example();
        double expResult = 0.0;
        double result = instance.divide(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
