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
		String [] scoreNames = new String[10];
		int i = 0;
		int temp;
		String tempName;
		try {
			Scanner scan = new Scanner(new File ("scores.txt"));
			while(scan.hasNextInt()){
				scores[i] = scan.nextInt();
				i++;
			}
			i=0;
			scan = new Scanner(new File("scoreNames.txt"));
			while(scan.hasNext()){
				scoreNames[i] = scan.next();
				i++;
			}
			scan.close();
			for(Player play : p){
				boolean flag = false;
					for(int j = 0; j < scores.length; j++){
						if(play.getScore() > scores[j]){
							flag = true;
							temp = scores[j];
							tempName= scoreNames[j];
							scores[j] = play.getScore();
							scoreNames[j] = play.getName();
							for(int k = j+1; k < scores.length; k++){
								int temp2 = temp;
								temp = scores[k];
								scores[k] = temp2;
								
								String tn2 = tempName;
								tempName = scoreNames[k];
								scoreNames[k] = tn2;
							}
							}
						if(flag) break;
						}
					
				}
			
			PrintWriter writer = new PrintWriter("scores.txt", "UTF-8");
			for(int n = 0; n < scores.length; n++){
				writer.println(scores[n]);
			}
			writer.close();
			PrintWriter writer2 = new PrintWriter("scoreNames.txt", "UTF-8");
			for(int n = 0; n < scoreNames.length; n++){
				writer2.println(scoreNames[n]);
				System.out.println(scoreNames[n]);
			}
			writer2.close();
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
			Scanner scan2 = new Scanner(new File("scoreNames.txt"));
			while(scan.hasNextInt()){
				System.out.print(scan2.next() + " ");
				System.out.println(scan.nextInt());
				
			}
			scan.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
