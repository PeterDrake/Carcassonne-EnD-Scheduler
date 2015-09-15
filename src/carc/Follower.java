package carc;

public class Follower {
	
	private String location;
	
	private String owner;
	
	public Follower(String located, String name){
		location = located;
		owner = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	
}
