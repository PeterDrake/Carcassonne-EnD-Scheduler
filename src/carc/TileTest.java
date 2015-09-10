package carc;

import static org.junit.Assert.*;
import org.junit.Test;
import static carc.TileOptions.*;

public class TileTest {

	@Test
	public void testFirstTile() {
		Tile t = new Tile();
		assertEquals(CASTLE, t.getNorth());
		assertEquals(ROAD, t.getEast());
		assertEquals(FARM, t.getSouth());
		assertEquals(ROAD, t.getWest());
	}
	
	@Test
	public void testTile() {
		Tile t = new Tile(ROAD, CASTLE, FARM, FARM, false);
		assertEquals(ROAD, t.getNorth());
		assertEquals(FARM, t.getEast());
		assertEquals(FARM, t.getSouth());
		assertEquals(CASTLE, t.getWest());
	}
}
