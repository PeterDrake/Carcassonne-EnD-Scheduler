package carc;


public class Board {
	
	private static final int BOARD_WIDTH = 60;
	private Tile[][] tiles;
	private Player[] players;
	private int tileCount = 72;
	


	public Board(int numberplayers){
		tiles = new Tile[BOARD_WIDTH][BOARD_WIDTH];
		players = new Player[numberplayers];
		for(int i = 0; i < numberplayers ; i++){
			players[i] = new Player();
		}
	}
	
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
	
	public boolean isGameOver(){
		return tileCount == 0;
	}

	public void run() {
		Tile t = new Tile();
		placeTile(t, 30, 30);
		displayScore();
		System.out.println("Board Created");
		System.out.println("Tile placed at 30, 30");
	}

}
