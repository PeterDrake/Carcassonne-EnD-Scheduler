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

	private Sector es;

	private Sector middle;

	private Sector ne;

	private Sector north;

	private Sector nw;

	private Sector se;

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
			} else if (tileEncoding.charAt(x) == 'e'){
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
	}

	public Terrain getEast() {
		return east.getTerrain();
	}

	public Terrain getEN() {
		return en.getTerrain();
	}

	public Terrain getES() {
		return es.getTerrain();
	}

	public Terrain getNE() {
		return ne.getTerrain();
	}

	public Terrain getNorth() {
		return north.getTerrain();
	}

	public Terrain getNW() {
		return nw.getTerrain();
	}

	public Terrain getSE() {
		return se.getTerrain();
	}

	public Terrain getSouth() {
		return south.getTerrain();
	}

	public Terrain getSW() {
		return sw.getTerrain();
	}

	public Terrain getWest() {
		return west.getTerrain();
	}

	public Terrain getWN() {
		return wn.getTerrain();
	}

	public Terrain getWS() {
		return ws.getTerrain();
	}

	public Tile returnTile() {
		return this;
	}

}
