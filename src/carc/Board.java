package carc;


public class Board {
	
	private final int boardSize = 60;
	private Tile[][] tiles;
	private Player[] players;
	private int tilecount = 72;
	


	public Board(int numberplayers){
		tiles = new Tile[boardSize][boardSize];
		for(int i = 0; i< boardSize; i++){
			for(int j = 0; j< boardSize; j++){
				tiles[i][j] =null;
			}
		}
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
	
	public int getTilecount() {
		return tilecount;
	}

	public void setTilecount(int tc) {
		this.tilecount = tc;
	}
	
	public boolean isGameOver(){
		if( getTilecount() == 0){
			return true;
		}
		else{
			return false;
		}
	}

	public void run() {
		Tile t = new Tile();
		placeTile(t, 30, 30);
		displayScore();
		System.out.println("Board Created");
		System.out.println("Tile placed at 30, 30");
		
	}
	
	
	
}
