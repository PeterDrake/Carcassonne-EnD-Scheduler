package carc;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class Board {
	
	private static final int BOARD_WIDTH = 60;
	
	private Tile[][] tiles;
	
	private Player[] players;
	
	/**Number of remaining tiles*/
	private int tileCount = 72;
	
	private ArrayList<Tile> tilesFaceDown;
	
	/**This is the constructor for the board given the number of players.*/
	public Board(int numberplayers){
		tiles = new Tile[BOARD_WIDTH][BOARD_WIDTH];
		tilesFaceDown = new ArrayList();
		String[] names = readFileName(); 
		for(int i = 0; i < tileCount; i++){
			tilesFaceDown.add(new Tile(names[i]));
			
		}
		players = new Player[numberplayers];
		for(int i = 0; i < numberplayers ; i++){
			players[i] = new Player();
		}

	}
	
	/**Playes a tile at a given x and y in the array.*/
	public void placeTile(Tile tile, int x, int y){
		tiles[x][y] = tile;
		tileCount--;
		
	}
	
	public Tile getTileAt(int x, int y){
		return tiles[x][y];
	}
	
	
	
	
	
	public int[] displayScore(){
		System.out.println("Current Score:");
		int[] scores = new int[players.length];
		for(int i = 0; i < players.length; i++){
			scores[i] = players[i].getScore();
			System.out.println(players[i].getName() + "'s " + "score:"+ scores[i]);
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
 /** Run method. Also lets people enter their names*/
	public void run() {
		Tile t = Tile.getInitialTile();
		int x,y;
		Scanner scan = new Scanner(System.in);
		placeTile(t, 30, 30);
		
		for(int i = 1; i< players.length+1; i++){
			System.out.println("Enter name for player " + i + ": ");
			players[i-1].setName(scan.next());
		}
		displayScore();
		System.out.println("Board Created");
		System.out.println("Tile placed at 30, 30");
		for(int i = 0; i< players.length; i++){
			System.out.println(players[i].getName() + " has " + players[i].getFollowernum() + " followers");
		}
		System.out.println("Game over = " + isGameOver());
		
		//readFileName();
	}
	

	
	public ArrayList<Tile> getTilesFaceDown() {
		return tilesFaceDown;
	}


	public boolean placeFollower(Player p, String s, int x, int y){
		if(getTileAt(x,y) == null || p.getFollowernum() == 0 || s == null){
			return false;
		}
		switch(s){
		case "ne" :  getTileAt(x,y).getNE().setFollower(p);
		break;
		case "nw" : getTileAt(x,y).getNW().setFollower(p);
		break;
		case "se" :  getTileAt(x,y).getSE().setFollower(p);
		break;
		case "sw" : getTileAt(x,y).getSW().setFollower(p);
		break;
		case "en" :  getTileAt(x,y).getES().setFollower(p);
		break;
		case "es" : getTileAt(x,y).getES().setFollower(p);
		break;
		case "ws" :  getTileAt(x,y).getWS().setFollower(p);
		break;
		case "wn" : getTileAt(x,y).getWN().setFollower(p);
		break;
		case "middle" :  getTileAt(x,y).getMiddle().setFollower(p);
		break;
		case "north" : getTileAt(x,y).getNorth().setFollower(p);
		break;
		case "east" : getTileAt(x,y).getEast().setFollower(p);
		break;
		case "south" : getTileAt(x,y).getSouth().setFollower(p);
		break;
		case "west" : getTileAt(x,y).getWest().setFollower(p);
		break;
		}
		
		
		p.setFollowernum(p.getFollowernum() - 1);
		return true;
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

	/**Gets a random Tile index for our getRandomTile() method*/
	public int getRandomTileIndex(){
		return (int)(Math.random()*tilesFaceDown.size());
	}
	
	/**Gets a random Tile that is faced down*/
	public Tile getRandomTile(){
		Tile t = tilesFaceDown.get(getRandomTileIndex());
		tilesFaceDown.remove(t);
		return t;
	}
}
