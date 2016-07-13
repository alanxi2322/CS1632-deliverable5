/*
 * CS 1632 Deliverable 5 
 */
package conwaygame;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lun Xi 
 */
public class CellTest {
    
    public CellTest() {
        
        Cell cell = new Cell();
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
     * Test of toString method, of class Cell.
     */
    @Test
    public void AftertestToString() {
        System.out.println("After toString");
        Cell instance = new Cell();
        String expResult = "";
        String result = instance.toString();
        assertEquals(".", result);
    }
    
    @Test
    public void BeforetestToString() {
        System.out.println("Before toString");
        Cell instance = new Cell();
        String expResult = "";
        String result = instance.oldtoString();
        assertEquals(".", result);
    
    }
    
    @Test
    public void AlivetestToString() {
        System.out.println("toString");
        Cell instance = new Cell();
        String expResult = "";
        instance.setAlive(true);
        String result = instance.oldtoString();
        
        assertEquals("X", result);
    }
}