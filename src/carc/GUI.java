package carc;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.filechooser.FileSystemView;
import javax.swing.*;

public class GUI extends JFrame {

	private static final int DEFAULT_HEIGHT = 1200;
	private static final int DEFAULT_WIDTH = 1200;
	private ActionListener[][] action = new ActionListener[12][12];
	private Board board;
	private JButton[][] button = new JButton[12][12];
	private GridBagConstraints constraints;
	private int x = 0;
	private int y = 0;
	

	/**
	 * GUI builds frame, inserts GridBag into frame, and exits on close.
	 * 
	 * @param initial
	 *            board
	 */
	public GUI(Board b) {
		board = b;
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gameFrame = new GridBagLayout();
		setLayout(gameFrame);
		constraints = new GridBagConstraints();
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 12; j++) {
				button[i][j] = new JButton(i + "," + j);
				action[i][j] = new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String action = e.getActionCommand();
						for (int i = 0; i < 12; i++) {
							for (int j = 0; j < 12; j++) {
								if (action.equals(i + "," + j)) {
									board.placeTile(board.getRandomTile(), i, j);
									setXY(i, j);
								}
							}
						}
					}
				};
				button[i][j].addActionListener(action[i][j]);
				constraints.gridx = i;
				constraints.gridy = j;
				constraints.gridheight = 1;
				constraints.gridwidth = 1;
				add(button[i][j], constraints);
			}
		}
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setXY(int i, int j) {
		x = i;
		y = j;
	}

	/**
	 * 
	 * 
	 * updates display
	 */
	public void updateBoard() {

		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 12; j++) {
				if (board.getTileAt(i, j) != null) {
					String check = "Tiles/" + board.getTileAt(i, j).encoding
							+ ".png";
					//System.out.println(check);
					Icon img = new ImageIcon(check);
					button[i][j].setIcon(img);
					constraints.gridx = i;
					constraints.gridy = j;
					constraints.gridheight = 1;
					constraints.gridwidth = 1;
					add(button[i][j], constraints);
				}
			}
		}
	}

}