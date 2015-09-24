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
	
	@Test
	public void isLegalTilePlacementTest(){
		int x=20, y=20;
		Tile t = new Tile("rrrreffffffffn");
		assertTrue(b.isLegalTilePlacement(t, x, y));
		b.placeTile(t, x, y);
		Tile s = new Tile("nrrreffffffffn");
		assertTrue(b.isLegalTilePlacement(s, x+1, y));
		Tile r = new Tile("nnnnccccccccs");
		assertFalse(b.isLegalTilePlacement(r, x+1, y));
	}
}

