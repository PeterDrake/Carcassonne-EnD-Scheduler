package carc;

public class Carcassonne {

	public static void main(String [] args){
		Board b = new Board(2);
		GUI display = new GUI(b);
		Tile initial = Tile.getInitialTile();
		b.placeTile(initial, 29, 29);
		System.out.println("initial tile: " + b.getTileAt(30, 30));
		System.out.println("initial tile: " + b.getTileAt(29, 29));
	//	System.out.println("third tile: " + b.getTileAt(2, 2).toString());
		display.updateBoard();
		
	}
	
}
