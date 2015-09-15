package carc;

public class Sector {
	
	private Terrain terrain;
	
	private Player owner;
	
	public Sector(Terrain t){
		terrain = t;
	}	
	
	public void setTerrain(Terrain t){
		terrain = t;
	}
	
	public void setFollower(Player p){
		owner = p;
	}
	
		
	public Terrain getTerrain() {
		return terrain;
	}

	public Player getFollowerOwner() {
		return owner;
	}


}
