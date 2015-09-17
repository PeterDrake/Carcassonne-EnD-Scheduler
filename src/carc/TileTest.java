package carc;

import static org.junit.Assert.*;
import org.junit.Test;
import static carc.Terrain.*;

public class TileTest {

	@Test
	public void testFirstTile() {
		Tile t = new Tile();
		assertEquals(null, t.getNorthTerrain());
		assertEquals(ROAD, t.getEastTerrain());
		assertEquals(null, t.getSouthTerrain());
		assertEquals(ROAD, t.getWestTerrain());
		assertEquals(CASTLE, t.getNETerrain());
		assertEquals(CASTLE, t.getNWTerrain());
		assertEquals(FARM, t.getWNTerrain());
		assertEquals(FARM, t.getWSTerrain());
		assertEquals(FARM, t.getSWTerrain());
		assertEquals(FARM, t.getSETerrain());
		assertEquals(FARM, t.getESTerrain());
		assertEquals(FARM, t.getENTerrain());

	}
	
	@Test
	public void testTile() {
		Tile t = new Tile("nrnrrccffffff");
		assertEquals(null, t.getNorthTerrain());
		assertEquals(ROAD, t.getEastTerrain());
		assertEquals(null, t.getSouthTerrain());
		assertEquals(ROAD, t.getWestTerrain());
		assertEquals(CASTLE, t.getNETerrain());
		assertEquals(CASTLE, t.getNWTerrain());
		assertEquals(FARM, t.getWNTerrain());
		assertEquals(FARM, t.getWSTerrain());
		assertEquals(FARM, t.getSWTerrain());
		assertEquals(FARM, t.getSETerrain());
		assertEquals(FARM, t.getESTerrain());
		assertEquals(FARM, t.getENTerrain());
	}
	
	@Test
	public void testToString(){
		Tile t = new Tile("nrnrrccffffff");
		assertEquals(" c n c\nf     f\nr  r  r\nf     f\n f n f", t.toString());
	}

	@Test
	public void testHasFollower(){
		Tile t = new Tile("nrnrrccffffff");
		Tile t2 = new Tile("nrnrrccffffff");
		Player p = new Player();
		t.getSW().setFollower(p);
		assertFalse( t2.hasFollower());
		assertTrue(t.hasFollower());
	}
}
