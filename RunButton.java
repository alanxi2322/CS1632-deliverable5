/*
 * CS 1632 Deliverable 5 
 * @ Lun Xi 
 *
 */
package conwaygame;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class RunButton extends JButton {

    private MainPanel _m;
    
    public RunButton(MainPanel m) {
	super("Run");
	_m = m;
	addActionListener(new RunButtonListener());
    }

    class RunButtonListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
	    _m.run();
	}
    }    
    
}
