package carc;

public class Board {
	private final int boardSize = 60;
	
	Tile[][] tiles;
	
	public Board(){
		tiles = new Tile[boardSize][boardSize];
		for(int i = 0; i< boardSize; i++){
			for(int j = 0; j< boardSize; j++){
				tiles[i][j] =null;
			}
		}
	}
	
	public void placeTile(Tile, int x, int y){
		
	}
}
