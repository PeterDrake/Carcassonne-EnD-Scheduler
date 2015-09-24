package carc;

import static carc.Terrain.*;

/**
 * A game tile.
 * 
 * The tile has 13 Terrains on it. They are referred to by direction. In the
 * corners there are two: ne is the upper (north) side of the northeast corner,
 * while en is the right (east) side of the northeast corner.
 */
public class Tile {
	private Sector east;

	private Sector en;

	public String encoding;

	private Sector es;

	private Sector middle;

	private Sector ne;

	private Sector north;

	private Sector nw;

	private Sector se;

	private boolean sheild;

	private Sector south;

	private Sector sw;

	private Sector west;

	private Sector wn;

	private Sector ws;

	/** This constructor creates the initial tile. */
	public Tile() {
		nw = new Sector(CASTLE);
		ne = new Sector(CASTLE);
		wn = new Sector(FARM);
		ws = new Sector(FARM);
		sw = new Sector(FARM);
		se = new Sector(FARM);
		es = new Sector(FARM);
		en = new Sector(FARM);
		west = new Sector(ROAD);
		east = new Sector(ROAD);
		middle = new Sector(ROAD);
		north = new Sector(null);
		south = new Sector(null);
	}

	/**
	 * Constructor for all tiles(except initial tile).
	 *
	 */
	public Tile(String tileEncoding) {
		Terrain[] tileStuff = new Terrain[tileEncoding.length()];
		encoding = tileEncoding;
		for (int x = 0; x < tileEncoding.length(); x++) {
			if (tileEncoding.charAt(x) == 'r') {
				tileStuff[x] = ROAD;
			} else if (tileEncoding.charAt(x) == 'l') {
				tileStuff[x] = CLOISTER;
			} else if (tileEncoding.charAt(x) == 'c') {
				tileStuff[x] = CASTLE;
			} else if (tileEncoding.charAt(x) == 'f') {
				tileStuff[x] = FARM;
			} else if (tileEncoding.charAt(x) == 'e') {
				tileStuff[x] = ROAD_END;
			} else {
				tileStuff[x] = null;
			}
		}
		north = new Sector(tileStuff[0]);
		east = new Sector(tileStuff[1]);
		south = new Sector(tileStuff[2]);
		west = new Sector(tileStuff[3]);
		middle = new Sector(tileStuff[4]);
		nw = new Sector(tileStuff[5]);
		ne = new Sector(tileStuff[6]);
		en = new Sector(tileStuff[7]);
		es = new Sector(tileStuff[8]);
		se = new Sector(tileStuff[9]);
		sw = new Sector(tileStuff[10]);
		ws = new Sector(tileStuff[11]);
		wn = new Sector(tileStuff[12]);
		if (tileEncoding.charAt(13) == 's') {
			sheild = true;
		} else {
			sheild = false;
		}
	}

	/** Getters for the Sectors */
	public Sector getEast() {
		return east;
	}

	/** Getters for the terrain for each tile. */
	public Terrain getEastTerrain() {
		return east.getTerrain();
	}

	public Sector getEN() {
		return en;
	}

	public Terrain getENTerrain() {
		return en.getTerrain();
	}

	public Sector getES() {
		return es;
	}

	public Terrain getESTerrain() {
		return es.getTerrain();
	}

	public Sector getMiddle() {
		return middle;
	}

	public Terrain getMiddleTerrain() {
		return middle.getTerrain();
	}

	public Sector getNE() {
		return ne;
	}

	public Terrain getNETerrain() {
		return ne.getTerrain();
	}

	public Sector getNorth() {
		return north;
	}

	public Terrain getNorthTerrain() {
		return north.getTerrain();
	}

	public Sector getNW() {
		return nw;
	}

	public Terrain getNWTerrain() {
		return nw.getTerrain();
	}

	public Sector getSE() {
		return se;
	}

	public Terrain getSETerrain() {
		return se.getTerrain();
	}

	public boolean getSheild() {
		return sheild;
	}

	public Sector getSouth() {
		return south;
	}

	public Terrain getSouthTerrain() {
		return south.getTerrain();
	}

	public Sector getSW() {
		return sw;
	}

	public Terrain getSWTerrain() {
		return sw.getTerrain();
	}

	public Sector getWest() {
		return west;
	}

	public Terrain getWestTerrain() {
		return west.getTerrain();
	}

	public Sector getWN() {
		return wn;
	}

	public Terrain getWNTerrain() {
		return wn.getTerrain();
	}

	public Sector getWS() {
		return ws;
	}

	public Terrain getWSTerrain() {
		return ws.getTerrain();
	}

	/** Checks the tile in every Sector to see if it has a follower on it */
	public boolean hasFollower() {
		if (east.getFollowerOwner() != null) {
			return true;
		} else if (en.getFollowerOwner() != null) {
			return true;
		} else if (es.getFollowerOwner() != null) {
			return true;
		} else if (middle.getFollowerOwner() != null) {
			return true;
		} else if (ne.getFollowerOwner() != null) {
			return true;
		} else if (north.getFollowerOwner() != null) {
			return true;
		} else if (nw.getFollowerOwner() != null) {
			return true;
		} else if (se.getFollowerOwner() != null) {
			return true;
		} else if (south.getFollowerOwner() != null) {
			return true;
		} else if (sw.getFollowerOwner() != null) {
			return true;
		} else if (west.getFollowerOwner() != null) {
			return true;
		} else if (wn.getFollowerOwner() != null) {
			return true;
		} else if (ws.getFollowerOwner() != null) {
			return true;
		}
		return false;
	}

	public Tile returnTile() {
		return this;
	}

	public String toString() {
		
		return " " + encoding.charAt(5) + " " + encoding.charAt(0) + " " + encoding.charAt(6) + "\n"
				+ encoding.charAt(12) + "     " + encoding.charAt(7) + "\n" + encoding.charAt(3) + "  "
				+ encoding.charAt(4) + "  " + encoding.charAt(1) + "\n" + encoding.charAt(11) + "     "
				+ encoding.charAt(8) + "\n " + encoding.charAt(10) + " " + encoding.charAt(2) + " "
				+ encoding.charAt(9);
	}
	
	/** 
	 * creates then returns initial tile
	 * @return
	 */
	public static Tile getInitialTile(){
		return new Tile("nrnrrccffffffn");
	}

}
