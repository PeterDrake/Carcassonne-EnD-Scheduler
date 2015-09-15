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
	
	
	
	private Terrain east;

	private Terrain en;

	private Terrain es;

	private Terrain middle;

	private Terrain ne;

	private Terrain north;

	private Terrain nw;

	private Terrain se;

	private Terrain south;

	private Terrain sw;

	private Terrain west;

	private Terrain wn;

	private Terrain ws;

	/** This constructor creates the initial tile. */
	public Tile() {
		nw = CASTLE;
		ne = CASTLE;
		wn = FARM;
		ws = FARM;
		sw = FARM;
		se = FARM;
		es = FARM;
		en = FARM;
		west = ROAD;
		east = ROAD;
		middle = ROAD;
	}

	public Tile(String tileEncoding) {
		Terrain[] tileStuff = new Terrain[tileEncoding.length()];
		for (int x = 0; x < tileEncoding.length(); x++) {
			if (tileEncoding.charAt(x) == 'r') {
				tileStuff[x] = ROAD;
			} else if (tileEncoding.charAt(x) == 'l') {
				tileStuff[x] = CLOISTER;
			} else if (tileEncoding.charAt(x) == 'c') {
				tileStuff[x] = CASTLE;
			} else if (tileEncoding.charAt(x) == 'f') {
				tileStuff[x] = FARM;
			} else {
				tileStuff[x] = null;
			}
		}
		north = tileStuff[0];
		east = tileStuff[1];
		south = tileStuff[2];
		west = tileStuff[3];
		middle = tileStuff[4];
		nw = tileStuff[5];
		ne = tileStuff[6];
		en = tileStuff[7];
		es = tileStuff[8];
		se = tileStuff[9];
		sw = tileStuff[10];
		ws = tileStuff[11];
		wn = tileStuff[12];
	}

	public Terrain getEast() {
		return east;
	}

	public Terrain getEN() {
		return en;
	}

	public Terrain getES() {
		return es;
	}

	public Terrain getNE() {
		return ne;
	}

	public Terrain getNorth() {
		return north;
	}

	public Terrain getNW() {
		return nw;
	}

	public Terrain getSE() {
		return se;
	}

	public Terrain getSouth() {
		return south;
	}

	public Terrain getSW() {
		return sw;
	}

	public Terrain getWest() {
		return west;
	}

	public Terrain getWN() {
		return wn;
	}

	public Terrain getWS() {
		return ws;
	}

	public Tile returnTile() {
		return this;
	}

}
