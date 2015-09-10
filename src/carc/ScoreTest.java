package carc;

import static org.junit.Assert.*;

import org.junit.Test;

public class ScoreTest {

	@Test
	public void testScoreCloister() {
		Score s = new Score();
		assertEquals("completed cloister scoring", 18, s.scoreCloister(2));
	}


}
