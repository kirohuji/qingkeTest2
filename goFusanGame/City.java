package goFusanGame;

import java.util.Random;

public enum City {
	Fusan(100), Shouer(100), Renchuan(100);
	private int distance;

	City(int distance) {
		this.distance = distance;
	}

	public int getDistance() {
		return distance;
	}

}
