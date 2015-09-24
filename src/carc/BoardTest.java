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
		Tile tile = Tile.getInitialTile();
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
		b.placeTile(Tile.getInitialTile(), 1, 1);
		
		assertTrue(b.placeFollower(b.getPlayers()[0],"sw", 1, 1));
		assertFalse(b.placeFollower(b.getPlayers()[0],"middle", 1, 2));
		assertEquals(6, b.getPlayers()[0].getFollowernum());
	}

	@Test
	public void getRandomTileIndexTest(){
		int frequency[] = new int[72];
		for(int i = 0; i<frequency.length; i++){
			frequency[i]=0;
		}
		double trials = 1000000;
		for(int i = 0; i<trials; i++){
			frequency[b.getRandomTileIndex()]++;
		}
		for(int i = 0; i< frequency.length; i++){
			assertEquals(1.0/72.0,frequency[i]/trials,0.01);
		}
		
	}
	
}

