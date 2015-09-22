package carc;

import java.io.IOException;
import java.util.Scanner;

public class Carcassonne {

	/** Main method creates board, enters number of players, and calls Gui*/
	public static void main(String [] args){		
		int numplayers = 0;
		Scanner s = new Scanner(System.in);
		while(numplayers < 2 || numplayers > 5){
			System.out.println("Enter number of players: ");
			numplayers = s.nextInt();
		}
	
		Board b = new Board(numplayers);
		b.run();
		GUI display = new GUI(b);
		Tile initial = Tile.getInitialTile();
		b.placeTile(initial, 6, 6);
		display.updateBoard();

		while(true){
			Tile t = b.getRandomTile();
			System.out.println("Where would you like to place this tile? \n" + t);
			System.out.println("Enter x coordinate: ");
			int x = s.nextInt();
			System.out.println("Enter y coordinate: ");
			int y = s.nextInt();
			b.placeTile(t, x, y);
			display.pack();
			display.validate();
			display.repaint();
			display.updateBoard();
		}
		

	}
	
}
