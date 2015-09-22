package carc;

import static org.junit.Assert.*;
import org.junit.Test;
import static carc.Terrain.*;

public class TileTest {

	@Test
	public void testFirstTile() {
		Tile t = Tile.getInitialTile();
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
		Tile t = new Tile("nrnrrccffffffn");
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
		Tile t = new Tile("nrnrrccffffffn");
		assertEquals(" c n c\nf     f\nr  r  r\nf     f\n f n f", t.toString());
	}

	@Test
	public void testHasFollower(){
		Tile t = Tile.getInitialTile();
		Tile t2 = Tile.getInitialTile();
		Player p = new Player();
		t.getSW().setFollower(p);
		assertEquals(null, t2.hasFollower());
		assertEquals("sw", t.hasFollower());
	}
}
