package carc;

public class Score {

	private final int COMPCLOISTER =  9;
	
	/** Constructor for the score class */
	public Score() {
		// TODO Auto-generated constructor stub
	}
	
	/** Returns the score for the number of cloisters completed*/
	public int scoreCloister (int completed){
		return completed * COMPCLOISTER; 
	}

}
