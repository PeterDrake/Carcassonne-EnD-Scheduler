package carc;

import java.io.File;

public class Board {
	
	private static final int BOARD_WIDTH = 60;
	
	private Tile[][] tiles;
	
	private Player[] players;
	
	/**Number of remaining tiles*/
	private int tileCount = 72;
	
	private Tile[] tilesFaceDown;
	
	/**This is the constructor for the board given the number of players.*/
	public Board(int numberplayers){
		tiles = new Tile[BOARD_WIDTH][BOARD_WIDTH];
		tilesFaceDown = new Tile[tileCount];
		String[] names = readFileName(); 
		for(int i = 0; i < tileCount; i++){
			tilesFaceDown[i] = new Tile(names[i]);
		}
		players = new Player[numberplayers];
		for(int i = 0; i < numberplayers ; i++){
			players[i] = new Player();
		}
		Tile t = new Tile();
		placeTile(t, 30, 30);
	}
	
	/**Playes a tile at a given x and y in the array.*/
	public void placeTile(Tile tile, int x, int y){
		tiles[x][y] = tile;
	}
	
	public Tile getTile(int x, int y){
		return tiles[x][y];
	}
	
	public int[] displayScore(){
		int[] scores = new int[players.length];
		for(int i = 0; i < players.length; i++){
			scores[i] = players[i].getScore();
			System.out.println("Player " + i + " score: "+ scores[i]);
		}
		return scores;
	}
	
	public Player[] getPlayers(){
		return players;
	}
	
	public int getTileCount() {
		return tileCount;
	}

	public void setTileCount(int tc) {
		this.tileCount = tc;
	}
	
	/**Checks if the game is over based on the number of remaining tiles.*/
	public boolean isGameOver(){
		return tileCount == 0;
	}

	public void run() {
		Tile t = new Tile();
		placeTile(t, 30, 30);
		displayScore();
		System.out.println("Board Created");
		System.out.println("Tile placed at 30, 30");
		//readFileName();
	}
	
	public String[] readFileName(){
		File folder = new File("Tiles");
		File[] listOfFiles = folder.listFiles();
		String[] names = new String[tileCount];
		for(int i = 0; i<listOfFiles.length;i++ ){
			names[i] = listOfFiles[i].getName();
		}
		return names;
	}

}
