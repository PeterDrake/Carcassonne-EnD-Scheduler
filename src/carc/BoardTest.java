package carc;

import static org.junit.Assert.*;
import static carc.TileOptions.*;
import org.junit.Test;

public class BoardTest {
	int numPlayers = 2;
Board b = new Board(numPlayers);

	@Test
	public void placeTileTest() {
		Tile tile = new Tile();
		b.placeTile(tile, 1, 1);
		assertEquals(tile, b.getTile( 1, 1));
	}

	@Test
	public void displayScoreTest(){
		Player players[] = b.getPlayers();
		int[] test = new int[players.length];
		for(int i =0 ; i < players.length; i++){
			players[i].setScore(i);
			test[i]=i;
		}
		assertArrayEquals(test, b.displayScore());
	}
	
	@Test
	public void cloisterCompletionTest(){
		Tile t = new Tile(FARM,FARM,FARM,FARM,true);
		b.placeTile(t , 1,1 );
		b.placeTile(new Tile(FARM,FARM,FARM,FARM,false), 0,0 );
		b.placeTile(new Tile(FARM,FARM,FARM,FARM,false), 0,1 );
		b.placeTile(new Tile(FARM,FARM,FARM,FARM,false), 0,2 );
		b.placeTile(new Tile(FARM,FARM,FARM,FARM,false), 1,0 );
		b.placeTile(new Tile(FARM,FARM,FARM,FARM,false), 1,2 );
		b.placeTile(new Tile(FARM,FARM,FARM,FARM,false), 2,0 );
		b.placeTile(new Tile(FARM,FARM,FARM,FARM,false), 2,1 );
		b.placeTile(new Tile(FARM,FARM,FARM,FARM,false), 2,2 );
		assertEquals(9, b.cloisterCompletion(t));
	}
}
