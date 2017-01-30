package org.activity05;

import org.activity04.Road;
import org.activity04.Transport;

// TODO: implement Vehicle class as a subclass of Transport
	public class Vehicle {
	// TODO #1: Create variable to store number of wheels for Vehicle
	// Allow access to variable only from the same or extended class

	/**
	 * @param id
	 * @param wheels
	 */
	public Vehicle(String id, float consumption, int tankSize, int wheels) {
		// TODO #3: Set passed id and number of wheels for Vehicle
		// Set other properties of the Transport
	}

	/*
	 * @see org.activity06.Transport#move()
	 */
	// TODO #4: implement method move() for vehicle, which returns
	// String in form: "ID Vehicle is driving on From — To, 00km with x wheels"
	// where:
	// From — To, 00km is String representation of road
	// x is actual number of wheels
	// Else return "Cannot drive on " + Road representation as String
	public String move(Road road) {
		return "";
	}

}
