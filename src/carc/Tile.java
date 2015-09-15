package carc;

import static carc.Terrain.*;

public class Tile {

	public Terrain getNE() {
		return ne;
	}

	public Terrain getNW() {
		return nw;
	}
	
	public Terrain getWN() {
		return wn;
	}

	public Terrain getWS() {
		return ws;
	}

	public Terrain getSW() {
		return sw;
	}

	public Terrain getSE() {
		return se;
	}

	public Terrain getES() {
		return es;
	}

	public Terrain getEN() {
		return en;
	}

	private Terrain east;
	private Terrain north;
	private Terrain south;
	private Terrain west;
	private Terrain middle;
	private Terrain nw;
	private Terrain ne;
	private Terrain wn;
	private Terrain ws;
	private Terrain sw;
	private Terrain se;
	private Terrain es;
	private Terrain en;

	/** this constructor creates the first tile**/
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
		Terrain[] tileStuff=new Terrain[tileEncoding.length()];
		for(int x=0; x<tileEncoding.length(); x++){
			if(tileEncoding.charAt(x)=='r'){
				tileStuff[x]=ROAD;
			}else if(tileEncoding.charAt(x)=='l'){
				tileStuff[x]=CLOISTER;
			}else if(tileEncoding.charAt(x)=='c'){
				tileStuff[x]=CASTLE;
			}else if(tileEncoding.charAt(x)=='f'){
				tileStuff[x]=FARM;
			}else{
				tileStuff[x]=null;
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

	public Terrain getNorth() {
		return north;
	}

	public Terrain getSouth() {
		return south;
	}

	public Terrain getWest() {
		return west;
	}

	public Tile returnTile() {
		return this;
	}
}
