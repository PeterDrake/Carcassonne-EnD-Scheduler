package carc;

import java.awt.*;

import javax.swing.*;

public class GUI extends JFrame{
	
	private Board board;
	private static final int DEFAULT_HEIGHT=1200;
	private static final int DEFAULT_WIDTH=1200;
	private GridBagConstraints constraints;
//	private JButton button = new JButton("string");
	
	/**
	 * GUI builds frame, inserts GridBag into frame, and exits on close.
	 * @param initial board
	 */
	public GUI(Board b){
		board = b;
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gameFrame = new GridBagLayout();
		setLayout(gameFrame);
		constraints = new GridBagConstraints();
	}
	/**	
	 * 
	 * 
	 * updates display
	 */
	public void updateBoard(){
		for(int i=0; i<60; i++){
			for(int j=0; j<60; j++){
				if(board.getTileAt(i, j)!=null){
					String check = "Tiles/" + board.getTileAt(i, j).encoding + ".png";
					JButton b = new JButton(new ImageIcon(check));
					constraints.gridx=i;
					constraints.gridy=j;
					constraints.gridheight = 1;
					constraints.gridwidth = 1;
					add(b, constraints);
				}
			}
		}
	}

}