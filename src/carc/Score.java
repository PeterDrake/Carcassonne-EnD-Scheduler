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
		if (board.getTile(x, y + 1) != null) {
			score++;
		}
		if (board.getTile(x, y - 1) != null) {
			score++;
		}
		if (board.getTile(x + 1, y) != null) {
			score++;
		}
		if (board.getTile(x - 1, y) != null) {
			score++;
		}
		if (board.getTile(x + 1, y - 1) != null) {
			score++;
		}
		if (board.getTile(x + 1, y + 1) != null) {
			score++;
		}
		if (board.getTile(x - 1, y - 1) != null) {
			score++;
		}
		if (board.getTile(x - 1, y + 1) != null) {
			score++;
		}
		return score == 8;
	}

	/** Returns the score for the number of cloisters completed */
	public void scoreCloister(int x, int y, Player player) {
		int score = 0;
		if (board.getTile(x, y + 1) != null) {
			score++;
		}
		if (board.getTile(x, y - 1) != null) {
			score++;
		}
		if (board.getTile(x + 1, y) != null) {
			score++;
		}
		if (board.getTile(x - 1, y) != null) {
			score++;
		}
		if (board.getTile(x + 1, y - 1) != null) {
			score++;
		}
		if (board.getTile(x + 1, y + 1) != null) {
			score++;
		}
		if (board.getTile(x - 1, y - 1) != null) {
			score++;
		}
		if (board.getTile(x - 1, y + 1) != null) {
			score++;
		}
		player.setScore(player.getScore() + score);
	}

}
