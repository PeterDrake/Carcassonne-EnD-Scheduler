package carc;

public class Sector {
	
	private Terrain terrain;
	
	private Player owner;
	
	
	/**Constructor for the Sector*/
	public Sector(Terrain t){
		terrain = t;
	}	
	/**Setter to set Terrain*/
	public void setTerrain(Terrain t){
		terrain = t;
	}
	/**Setter to set Followers Owner*/
	public void setFollower(Player p){
		owner = p;
	}
	
	/**Getter to get Terrain*/
	public Terrain getTerrain() {
		return terrain;
	}
	
	/**Getter to get Followers Owner*/
	public Player getFollowerOwner() {
		return owner;
	}


}
