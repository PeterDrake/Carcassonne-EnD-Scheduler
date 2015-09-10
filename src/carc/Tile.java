package carc;

import static carc.TileOptions.*;

public class Tile {

	private boolean cloister;
	private TileOptions east;
	private TileOptions north;
	private TileOptions south;
	private TileOptions west;

	/** this constructor creates the first tile**/
	public Tile() {
		north = CASTLE;
		west = ROAD;
		south = FARM;
		east = ROAD;
	}

	public Tile(TileOptions northReference, TileOptions westReference, TileOptions southReference,
			TileOptions eastReference, boolean cloister) {
		north = northReference;
		west = westReference;
		south = southReference;
		east = eastReference;
		cloister = this.cloister;
	}

	public TileOptions getEast() {
		return east;
	}

	public TileOptions getNorth() {
		return north;
	}

	public TileOptions getSouth() {
		return south;
	}

	public TileOptions getWest() {
		return west;
	}

	public Tile returnTile() {
		return this;
	}
}
