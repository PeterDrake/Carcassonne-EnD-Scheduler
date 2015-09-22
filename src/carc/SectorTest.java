package carc;

import static org.junit.Assert.*;

import org.junit.Test;
import static carc.Terrain.*;

public class SectorTest {

	@Test
	
	public void test() {
		Sector s = new Sector("sw", FARM);
		Player p = new Player();
		p.setName("Joe");
		s.setFollower(p);
		assertEquals(s.getFollowerOwner(),p);
		assertEquals(s.getTerrain(), FARM);
	}

}
