package org.activity05;

import java.util.Locale;

import org.activity04.Road;
import org.activity04.Transport;

// TODO: implement Vehicle class as a subclass of Transport
	public class Vehicle extends Transport {
	// TODO #1: Create variable to store number of wheels for Vehicle
	// Allow access to variable only from the same or extended class

	/**
	 * @param id
	 * @param wheels
	 */
		protected int wheels;
		
	public Vehicle(String id, float consumption, int tankSize, int wheels) {
		// TODO #3: Set passed id and number of wheels for Vehicle
		// Set other properties of the Transport
		//super(id, consumption, tankSize);
		super(id, consumption, tankSize);
		this.wheels = wheels;
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
		int distanceForTransport = road.getDistance();
		float needFuelForDistance = distanceForTransport * this.getConsumption()/100;
		if(this.getFuelInTank() < needFuelForDistance ||(road instanceof WaterRoad)) {
			return "Cannot drive on " + road.toString();
		}
		else {
			this.setFuelInTank(this.getFuelInTank() - needFuelForDistance);
			return this.getType() + " is driving on " + road.toString() + " with " + wheels + " wheels";
		}
	}

}
