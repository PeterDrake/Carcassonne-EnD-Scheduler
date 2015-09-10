package carc;

import static carc.TileOptions.*;

public class Tile {

	public TileOptions getNE() {
		return ne;
	}

	public TileOptions getNW() {
		return nw;
	}
	
	public TileOptions getWN() {
		return wn;
	}

	public TileOptions getWS() {
		return ws;
	}

	public TileOptions getSW() {
		return sw;
	}

	public TileOptions getSE() {
		return se;
	}

	public TileOptions getES() {
		return es;
	}

	public TileOptions getEN() {
		return en;
	}

	private TileOptions east;
	private TileOptions north;
	private TileOptions south;
	private TileOptions west;
	private TileOptions middle;
	private TileOptions nw;
	private TileOptions ne;
	private TileOptions wn;
	private TileOptions ws;
	private TileOptions sw;
	private TileOptions se;
	private TileOptions es;
	private TileOptions en;

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
		TileOptions[] tileStuff=new TileOptions[tileEncoding.length()];
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
