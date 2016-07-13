/*
 * CS 1632 Deliverable 5 
 * @ Lun Xi 
 *
 */
 
 package conwaygame;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class MainPanelTest {
    
    public MainPanelTest() {
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
     * Test of runContinuous method, of class MainPanel.
     */
   /* @Test
    public void testRunContinuous() {
        System.out.println("runContinuous");
        int _r = 1000;
        boolean _running = false;
        MainPanel instance = new MainPanel(10);
        int _maxCount = 10000;
        
        instance.runContinuous();
        
        int _size = instance.getCellsSize();
        _running = true;
	while (_running) {
	    System.out.println("Running...");
	    int origR = _r;
	    try {
		Thread.sleep(20);
	    } catch (InterruptedException iex) { }
	    for (int j=0; j < _maxCount; j++) {
	    	_r += (j % _size) % _maxCount;
		_r += _maxCount;
            }
          
	    _r = origR;
	    instance.backup();
	    instance.calculateNextIteration();
        }
    
    }
*/
    /**
     * Test of checkSimilarity method, of class MainPanel.
     */
    @Test
    public void AftertesttoString() {
        System.out.println("After toWrite");
        
        MainPanel instance = new MainPanel(2);
        String result = instance.toString();
        assertEquals("..\n..\n", result);
     }
    
    @Test
    public void BeforetesttoString() {
        System.out.println("Before toWrite");
        
        MainPanel instance = new MainPanel(2);
        String result = instance.oldtoString();
        assertEquals("..\n..\n", result);
     }
    
    @Test
    public void testtoString() {
        System.out.println("toWrite");
        
        Cell[][] cells = new Cell[2][2];
        for(int i=0 ; i<2; i++)
        {
            for(int j=0 ; j<2; j++)
            {
                cells[i][j] = new Cell();
                cells[i][j].setAlive(true);
            }
        }
        MainPanel instance = new MainPanel(2);
        instance.setCells(cells);
        String result = instance.oldtoString();
        assertEquals("XX\nXX\n", result);
     }

}