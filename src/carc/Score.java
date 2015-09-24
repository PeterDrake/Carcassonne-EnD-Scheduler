package carc;

public class Score {

	private Board board;

	/** Constructor for the score class */
	public Score(Board b) {
		board = b;
	}

	/** Detects if a cloisters is completed */
	public boolean detectCompleteCloister(int x, int y, Player player) {
		int score = 0;
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
		if(score == 8){
			return true;
		}
		return false;
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

}
