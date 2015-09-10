package carc;


public class Player {

	 private int FOLLOWERLIMIT = 7;
	 private int followernum;
	 
	private int Score;
	 
	 public Player() {
		followernum = FOLLOWERLIMIT;
		Score = 0;
	}

	public static void main(String[] args) {
		 Player player1 = new Player();
		 Player player2 = new Player();
		 
		System.out.println("player 1 has follower:" + player1.followernum);
		System.out.println("player 2 has follower:" + player2.followernum);
	}

	public int getScore(){
		return Score;
	}
	public void setScore(int score){
		Score = score;
	}
	
	public int getFollowernum() {
		return followernum;
	}

	public void setFollowernum(int followernum) {
		this.followernum = followernum;
	}
}
