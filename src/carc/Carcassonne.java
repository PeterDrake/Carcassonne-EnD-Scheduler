package carc;

import java.io.IOException;

public class Carcassonne {

	public static void main(String [] args){
		
		int numberofplayers = 2;
		System.out.print("Please Enter Number of Players: ");
		try {
			numberofplayers = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Board b = new Board(numberofplayers);
		b.run();
		
		
	}
	
}
