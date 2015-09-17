package carc;

import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import javax.swing.*;

public class GUI extends JFrame{
	
	private Board board;
	private static final int DEFAULT_HEIGHT=1200;
	private static final int DEFAULT_WIDTH=1200;	
	
	/**
	 * GUI builds frame, inserts GridBag into frame, and exits on close.
	 * @param initial board
	 */
	public GUI(Board b){
		board = b;
		JFrame frame = new JFrame();
		frame.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gameFrame = new GridBagLayout();
		frame.setLayout(gameFrame);
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridheight = 1;
		constraints.gridwidth = 1;
	}
	/**	
	 * 
	 * 
	 * updates display
	 */
	public void updateBoard(){
		
		
	}

}