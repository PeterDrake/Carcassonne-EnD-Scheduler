package carc;

import java.awt.*;

import javax.swing.*;

public class GUI extends JFrame{
	
	private Board board;
	private static final int DEFAULT_HEIGHT=1200;
	private static final int DEFAULT_WIDTH=1200;
	private GridBagConstraints constraints;
//	private JButton button = new JButton("string");
	private JFrame frame;
	private Image image;
	
	/**
	 * GUI builds frame, inserts GridBag into frame, and exits on close.
	 * @param initial board
	 */
	public GUI(Board b){
		board = b;
		frame = new JFrame();
		frame.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gameFrame = new GridBagLayout();
		frame.setLayout(gameFrame);
		constraints = new GridBagConstraints();
//		image = new ImageIcon("Tiles/" + board.getTileAt(i, j).encoding + ".png").getImage();
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
//					image = new ImageIcon("Tiles/" + board.getTileAt(i, j).encoding + ".png").getImage();
//					JFrame tilePanel = new JFrame();
//					tilePanel.add(image);
					JButton b = new JButton(board.getTileAt(i, j).encoding);
					constraints.gridx=i;
					constraints.gridy=j;
					constraints.gridheight = 1;
					constraints.gridwidth = 1;
					frame.add(b, constraints);
				}
			}
		}
	}
	
//	public void paintComponent(Graphics g){
//		g.drawImage(image, 0, 0, this);
//		
//	}
}