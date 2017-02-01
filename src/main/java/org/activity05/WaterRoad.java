package org.activity05;

import org.activity04.Road;

public class WaterRoad extends Road {
	
	String from;
	String to;
	int dist;

	public WaterRoad(String from, String to, int dist) {
		// TODO Reuse Road constructor with passed parameters
		this.from = from;
		this.to = to;
		this.dist = dist;
	}

	public WaterRoad() {
		// TODO reuse Road constructor without parameters
		this.from = "";
		this.to = "";
		this.dist = 0;
	}

	// TODO override .toString() method for GroundRoad which returns string in
	// form: "Type From — To, 00km"
	// HINT use .getClass().getSimpleName() to get Type and reuse toString() of
	// Road
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " " + from + " — " + to + ", " + dist +"km";
	}

}
