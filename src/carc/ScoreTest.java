package carc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ScoreTest {

	Board b;
	Score s;
	Player p1;
	Player p2;

	@Before
	public void setUp() {
		b = new Board(2);
		s = new Score(b);
		p1 = new Player();
	}

	@Test
	public void testScoreCloister() {
		b.placeTile(new Tile("nnnnlffffffff"), 10, 10);
		s.scoreCloister(10, 10, p1);
		assertEquals(0, p1.getScore());
		b.placeTile(new Tile("nnnnfffffffff"), 11, 10);
		s.scoreCloister(10, 10, p1);
		assertEquals(1, p1.getScore());
	}

}
