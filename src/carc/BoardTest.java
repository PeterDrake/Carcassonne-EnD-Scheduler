package carc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BoardTest {
	
	private int numPlayers;
	
    private Board b;

    @Before
    public void setUp() {
    		numPlayers = 2;
    		b = new Board(numPlayers);
    }

	@Test
	public void placeTileTest() {
		Tile tile = new Tile();
		b.placeTile(tile, 1, 1);
		assertEquals(tile, b.getTileAt( 1, 1));
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
	
	@Test
	public void placeFollwerTest(){
		b.placeTile(new Tile(), 1, 1);
		
		assertTrue(b.placeFollower(b.getPlayers()[0], 1, 1));
		assertFalse(b.placeFollower(b.getPlayers()[0], 1, 2));
		assertEquals(6, b.getPlayers()[0].getFollowernum());
	}

}

