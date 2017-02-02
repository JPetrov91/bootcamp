package org.activity05;

import org.activity04.Road;

public class Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Vehicle("ss", 4, 30, 2);
		Ship ship = new Ship("Gg", (byte) 2);
		System.out.println(ship.getConsumption());
		WaterRoad wr = new WaterRoad("Riga", "Daugavpils", 255);
		Road road = new Road("Riga", "Sigulda", 55);
		System.out.println(ship.move(wr));
		System.out.println(vehicle.move(road));
		Amphibia amphibia = new Amphibia("IAmAmPhibia", 2.5f, 12, (byte)1, 100);
		System.out.println(amphibia.move(wr));
		System.out.println(amphibia.move(road));
	}

}
