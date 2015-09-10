package carc.Board;

import static org.junit.Assert.*;

import org.junit.Test;
import carc.Tile;

public class BoardTest {

	@Test
	public void placeTileTest() {
		Board b = new Board();
		Tile tile = new Tile();
		b.placeTile(tile, 1, 1);
		assertEquals(tile, b.getTile( 1, 1));
	}

}
