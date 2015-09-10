package carc;

import static org.junit.Assert.*;

import org.junit.Test;
import carc.Tile;
import carc.Board;


public class ScoreTest {
	
	int NUMPLAYERS = 2;
	Board b = new Board(NUMPLAYERS);
	
	@Test
	public void testScoreCloister() {
		Score s = new Score();
		assertEquals("completed cloister scoring", 18, s.scoreCloister(2));
	}

	
}
