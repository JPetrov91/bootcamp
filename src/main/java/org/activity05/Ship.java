package org.activity05;


import org.activity04.Road;
import org.activity04.Transport;

// TODO #1: implement Ship class as a subclass of Transport
	public class Ship extends Transport {
	// TODO #2: Create variable to store number of sails for ship
	// Allow access to variable only from the same or extended class

	/**
	 * @param id
	 * @param sails
	 */
		protected String id;
		protected byte sails;
		
	public Ship(String id, byte sails) {
		// TODO #3: Set passed id and number of sails for ship
		// Set other properties of the Transport
		super(id);
		//this.id = id;
		this.sails = (byte)sails;
	}

	/*
	 * @see org.activity06.Transport#move()
	 */

	// TODO #4: implement similar method move() for ship, which returns
	// String in form: "ID Ship is sailing on WaterRoad with x sails"
	// where x is actual number of sails
	// Else return "Cannot sail on " + Road representation as String
	public String move(Road road) {
//		int distanceForTransport = road.getDistance();
//		float needFuelForDistance = distanceForTransport * this.getConsumption()/100;
//		this.setFuelInTank(this.getFuelInTank() - needFuelForDistance);
		if(road instanceof WaterRoad) {
		return this.getType() + " is sailing on " + road.toString() +  " with " + sails + " sails";
		}
		else return "Cannot sail on " + road.toString();
	}
}
