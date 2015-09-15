package carc;


public class Player {

	 private int FOLLOWERLIMIT = 7;
	 private int followernum;
	 private String name;
	

	private int Score;
	 /** Constructor for player. Sets follower number, player name, and player score*/
	 public Player() {
		followernum = FOLLOWERLIMIT;
		name = "player";
		Score = 0;
	}

	/** Returns player's score*/
	public int getScore(){
		return Score;
	}
	
	/** Sets player's score*/
	public void setScore(int score){
		Score = score;
	}
	
	/** Returns player's name */
	public String getName() {
		return name;
	}

	/** Set the player's name*/
	public void setName(String name) {
		this.name = name;
	}
	
	/** Returns the number of followers a player has */
	public int getFollowernum() {
		return followernum;
	}

	/** Sets the number of followers a player has*/
	public void setFollowernum(int followernum) {
		this.followernum = followernum;
	}
}
