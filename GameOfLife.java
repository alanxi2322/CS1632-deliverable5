/*
 * CS 1632 Deliverable 5 
 * @ Lun Xi 
 *
 */
package conwaygame;


public class GameOfLife {

    private static void showErrorMessage() {
	System.out.println("Usage: java GameOfLife <size>");
	System.out.println("Size must be a positive integer");
	System.exit(1);
    }
    
    public static void main(String[] args) {
	int size = 10;
	
	/*if (args.length != 1) {
	    showErrorMessage();
	}
	*/
	try {
	    size = 10;
	} catch (Exception ex) {
	    showErrorMessage();
	}
	    
	MainFrame mf = new MainFrame(size);
    }
    
}
