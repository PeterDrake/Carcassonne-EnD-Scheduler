package carc;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest {

	@Test
	public void test() {
		Player player1 = new Player();
		assertEquals("followet limit", 7 , player1.getFollowernum());
		player1.setName("Bob");
		assertEquals("Bob", player1.getName());
		
	}


}
