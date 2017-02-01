package org.activity05;

public class Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Vehicle("ss", 4, 30, 2);
		Ship ship = new Ship("gr", 3, 35, (byte)12);
		System.out.println(vehicle.getConsumption());
		System.out.println(ship.getConsumption());

	}

}
