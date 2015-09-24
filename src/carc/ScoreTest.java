package carc;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

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
		p2 = new Player();
		
	}

	@Test
	public void testScoreCloister() {
		b.placeTile(new Tile("nnnnlffffffffn"), 10, 10);
		s.scoreCloister(10, 10, p1);
		assertEquals(1, p1.getScore());
		p1.setScore(0);
		b.placeTile(new Tile("nnnnfffffffffn"), 11, 10);
		s.scoreCloister(10, 10, p1);
		assertEquals(2, p1.getScore());
	}

	@Test
	public void testSetHighScore(){
		PrintWriter writer;
		try {
			writer = new PrintWriter("scores.txt", "UTF-8");
			for(int n = 10; n >0; n--){
				writer.println(n*10);
			}
			writer.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		p1.setScore(200);
		p2.setScore(5);
		Player p[] = new Player[] {p1, p2};
		int[] correct = new int[]{200,100,90,80,70,60,50,40,30,20}; 
		Score.highScore(p);
		int i = 0;
		int [] scores = new int[10];
		Scanner scan;
		try {
			scan = new Scanner(new File ("scores.txt"));
			while(scan.hasNextInt()){
				scores[i] = scan.nextInt();
				i++;
			}
			assertArrayEquals(correct, scores);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
