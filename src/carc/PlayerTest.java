package carc;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest {

	@Test
	public void test() {
		Player player = new Player();
		assertEquals("followet limit", 7 , player.followernum);
	}


}
