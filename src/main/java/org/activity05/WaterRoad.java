package org.activity05;

import org.activity04.Road;

public class WaterRoad extends Road {

	public WaterRoad(String from, String to, int dist) {
		// TODO Reuse Road constructor with passed parameters
	}

	public WaterRoad() {
		// TODO reuse Road constructor without parameters
	}

	// TODO override .toString() method for GroundRoad which returns string in
	// form: "Type From — To, 00km"
	// HINT use .getClass().getSimpleName() to get Type and reuse toString() of
	// Road
	@Override
	public String toString() {
		return "";
	}

}
