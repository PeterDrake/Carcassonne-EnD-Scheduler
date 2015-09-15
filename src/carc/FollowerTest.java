package carc;

import static org.junit.Assert.*;

import org.junit.Test;

public class FollowerTest {

	@Test
	
	
	public void Followertest() {
		Player p = new Player();
		p.setName("Joe");
		Follower f = new Follower("ne", p.getName());;
		assertEquals(f.getOwner(), p.getName());
		assertEquals(f.getLocation(), "ne");
	}

}
