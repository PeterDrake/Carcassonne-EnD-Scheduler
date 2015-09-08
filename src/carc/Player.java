package carc;


public class Player {

	 private int FOLLOWERLIMIT = 7;
	 public int followernum;
	 
	 public Player() {
		followernum = FOLLOWERLIMIT;
	}

	public static void main(String[] args) {
		 Player player1 = new Player();
		 Player player2 = new Player();
		 
		System.out.println("player 1 has follower:" + player1.followernum);
		System.out.println("player 2 has follower:" + player2.followernum);
	}

}
