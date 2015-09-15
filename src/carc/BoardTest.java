package carc;

import static org.junit.Assert.*;

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
	public void isGameOverTest(){
		assertFalse(b.isGameOver());
		b.setTileCount(0);
		assertTrue(b.isGameOver());
		
	}
}

