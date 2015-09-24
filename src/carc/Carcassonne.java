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
		Score.printHighScores();

		while(b.isGameOver()==false){

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
			System.out.println("There are " + b.getTileCount() + " tiles left");
			System.out.println("Do you want to place a follower on this tile? y/n");
			if(s.next().equals("y")){
				System.out.println("Which sector do you want to place them in? ne/nw/en/es/se/sw/ws/wn/middle/north/south/east/west");
				String sec = s.next();
				boolean bool = b.placeFollower(b.getPlayers()[0],sec,x, y);
				b.getPlayers()[0].setScore(b.getPlayers()[0].getScore() + 100);
				System.out.println("After setting the follower your new score is " + b.getPlayers()[0].getScore() );
				if(bool == true){
					System.out.println("The tile at coordinates " + x + "," + y + " has a follower at " + b.getTileAt(x, y).hasFollower() + "owned by " + b.getPlayers()[0].getName() + " who has " + b.getPlayers()[0].getFollowernum() + " followers left");
				}else{
					System.out.println("Cannot set follower at Coordinates " + x + ", " +y);
				}
			}

		}
		Score.highScore(b.getPlayers());
		Score.printHighScores();
	}
		
		
	
	
}
