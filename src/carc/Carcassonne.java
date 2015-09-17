package carc;

import java.io.IOException;
import java.util.Scanner;

public class Carcassonne {

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
		
		
	}
	
}
