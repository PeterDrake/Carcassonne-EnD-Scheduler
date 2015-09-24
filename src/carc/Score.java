package carc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Score {

	private Board board;

	/** Constructor for the score class */
	public Score(Board b) {
		board = b;
	}

	/** Detects if a cloisters is completed */
	public boolean detectCompleteCloister(int x, int y, Player player) {
		int score = 1;
		if (board.getTileAt(x, y + 1) != null) {
			score++;
		}
		if (board.getTileAt(x, y - 1) != null) {
			score++;
		}
		if (board.getTileAt(x + 1, y) != null) {
			score++;
		}
		if (board.getTileAt(x - 1, y) != null) {
			score++;
		}
		if (board.getTileAt(x + 1, y - 1) != null) {
			score++;
		}
		if (board.getTileAt(x + 1, y + 1) != null) {
			score++;
		}
		if (board.getTileAt(x - 1, y - 1) != null) {
			score++;
		}
		if (board.getTileAt(x - 1, y + 1) != null) {
			score++;
		}
		return score == 9;
	}

	/** Returns the score for the number of cloisters completed */
	public void scoreCloister(int x, int y, Player player) {
		int score = 1;
		if (board.getTileAt(x, y + 1) != null) {
			score++;
		}
		if (board.getTileAt(x, y - 1) != null) {
			score++;
		}
		if (board.getTileAt(x + 1, y) != null) {
			score++;
		}
		if (board.getTileAt(x - 1, y) != null) {
			score++;
		}
		if (board.getTileAt(x + 1, y - 1) != null) {
			score++;
		}
		if (board.getTileAt(x + 1, y + 1) != null) {
			score++;
		}
		if (board.getTileAt(x - 1, y - 1) != null) {
			score++;
		}
		if (board.getTileAt(x - 1, y + 1) != null) {
			score++;
		}
		player.setScore(player.getScore() + score);
	}

	public static void highScore(Player [] p){
		int [] scores = new int[10];
		int i = 0;
		int temp;
		try {
			Scanner scan = new Scanner(new File ("scores.txt"));
			while(scan.hasNextInt()){
				scores[i] = scan.nextInt();
				i++;
			}
			scan.close();
			for(Player play : p){
				boolean flag = false;
					for(int j = 0; j < scores.length; j++){
						if(play.getScore() > scores[j]){
							flag = true;
							temp = scores[j];
							scores[j] = play.getScore();
							for(int k = j+1; k < scores.length; k++){
								int temp2 = temp;
								temp = scores[k];
								scores[k] = temp2;
							}
							}
						if(flag) break;
						}
					
				}
			
			System.out.println("result");
			PrintWriter writer = new PrintWriter("scores.txt", "UTF-8");
			for(int n = 0; n < scores.length; n++){
				writer.println(scores[n]);
			}
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void printHighScores(){
	
		try {
			System.out.println("High Scores:");
			Scanner scan = new Scanner(new File ("scores.txt"));
			while(scan.hasNextInt()){
				System.out.println(scan.nextInt());
			}
			scan.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
