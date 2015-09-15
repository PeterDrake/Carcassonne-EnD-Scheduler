package carc;

import static org.junit.Assert.*;
import org.junit.Test;
import static carc.Terrain.*;

public class TileTest {

	@Test
	public void testFirstTile() {
		Tile t = new Tile();
		assertEquals(null, t.getNorth());
		assertEquals(ROAD, t.getEast());
		assertEquals(null, t.getSouth());
		assertEquals(ROAD, t.getWest());
		assertEquals(CASTLE, t.getNE());
		assertEquals(CASTLE, t.getNW());
		assertEquals(FARM, t.getWN());
		assertEquals(FARM, t.getWS());
		assertEquals(FARM, t.getSW());
		assertEquals(FARM, t.getSE());
		assertEquals(FARM, t.getES());
		assertEquals(FARM, t.getEN());

	}
	
	@Test
	public void testTile() {
		Tile t = new Tile("nrnrrccffffff");
		assertEquals(null, t.getNorth());
		assertEquals(ROAD, t.getEast());
		assertEquals(null, t.getSouth());
		assertEquals(ROAD, t.getWest());
		assertEquals(CASTLE, t.getNE());
		assertEquals(CASTLE, t.getNW());
		assertEquals(FARM, t.getWN());
		assertEquals(FARM, t.getWS());
		assertEquals(FARM, t.getSW());
		assertEquals(FARM, t.getSE());
		assertEquals(FARM, t.getES());
		assertEquals(FARM, t.getEN());
	}

}
