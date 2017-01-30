package org.activity05;

import org.activity04.Road;
import org.activity04.Transport;

// TODO #1: Implement Amphibia class in a such way, that it
// "is a Transport" and "looks like a Ship and a Vehicle"
// (has properties and methods of both).

	public class Amphibia {

	// TODO #2. Create variables to store necessary properties of
	// Ship and Vehicle into Amphibia.
	// Provide access to these properties only from current object.
	// Think, how to store only missing parts without redundancy.


	// TODO #3: Implement constructor, which set id, number of sails and
	// wheels for amphibia.
	public Amphibia(String id, float consumption, int tankSize, byte sails,
			int wheels) {
	}

	// TODO #5: implement method which shows how amphibia moves
	// If passed is WaterRoad road:
	// "ID Amphibia is sailing with X sails on WaterRoad From — To, 00km"
	// If passed is Road, return:
	// "ID Amphibia is driving with X wheels on Road From — To, 00km",
	// where: "From — To, 00km" is String representation of road
	// but "X" is actual number of sails or wheels.
	// Else return "Cannot drive on " + Road representation as String
	// Note, that on road amphibia should behave in the same way as a Transport,
	// but on water road — as a Ship.
	public String move(Road road) {
		return "";
	}

}
