package carc.Board;

import carc.Tile;

public class Board {
	
	private final int boardSize = 60;
	private Tile[][] tiles;
	
	public Board(){
		tiles = new Tile[boardSize][boardSize];
		for(int i = 0; i< boardSize; i++){
			for(int j = 0; j< boardSize; j++){
				tiles[i][j] =null;
			}
		}
	}
	
	public void placeTile(Tile tile, int x, int y){
		
	}
	
	
}
