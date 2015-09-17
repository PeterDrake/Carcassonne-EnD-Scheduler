package carc;

public class Carcassonne {

	public static void main(String [] args){
		Board b = new Board(2);
		GUI display = new GUI(b);
		Tile t = new Tile();
		b.placeTile(t, 29, 29);
		System.out.println("initial tile: " + b.getTile(30, 30));
		System.out.println("second tile: " + b.getTile(29, 29));
		System.out.println("third tile: " + b.getTile(2, 2));
		display.updateBoard();
		
	}
	
}
