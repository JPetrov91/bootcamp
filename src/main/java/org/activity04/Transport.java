package org.activity04;

import java.util.Locale;

public class Transport {
	// Do not change access modifiers to encapsulate internal properties!
	private String id; // Transport registration number
	private float consumption; // fuel consumption in litres per 100km
	private int tankSize; // tank size in litres
	private float fuelInTank; // fuel in tank
	

	public Transport(String id, float consumption, int tankSize) {
		// TODO save passed values for Transport
		// make fuel tank full
		this.id = id;
		this.consumption = consumption;
		this.tankSize = tankSize;
		this.fuelInTank = tankSize;
	}
	
	public Transport(String id) {
		this.id = id;
	}

	public float getConsumption() {
		// TODO return required value
		return this.consumption;
	}

	public int getTankSize() {
		// TODO return required value
		return this.tankSize;
	}

	public String getId() {
		// TODO return required value
		return this.id;
	}
	
	public void setFuelInTank(float fuelInTank) {
		this.fuelInTank = fuelInTank;
	}

	// Return transport id and type as string e.g. "AAA Transport"
	// HINT: use this.getClass().getSimpleName(); to get type of transport
	protected final String getType() {
		// TODO return required value
		String type = this.getClass().getSimpleName();
		return id + " " + type;
	}

	// HINT: use getType() to describe transport and road.toString() to describe
	// road
	// HINT: String.format(Locale.US, "%.2f", float) to format float number with
	// fixed mask
	public String move(Road road) {
		// TODO If transport has enough fuel, decrease actual amount of fuel by
		// necessary amount and return String in form:
		// "AAA Type is moving on From–To, 180km"
		// TODO If there is no enough fuel in tank, return string in form:
		// "Cannot move on From–To, 180km. Necessary
		// fuel:0.00l, fuel in tank:0.00l"
		int distanceForTransport = road.getDistance();
		float needFuelForDistance = distanceForTransport * this.getConsumption()/100;
		if(this.getFuelInTank() < needFuelForDistance) {
			return "Cannot move on " + road.toString() + ". Necessary fuel:" + (String.format(Locale.US, "%.2f", needFuelForDistance)) + "l, fuel in tank:"
					+ (String.format(Locale.US, "%.2f", this.getFuelInTank())) + "l";
		}
		else {
			this.fuelInTank = this.fuelInTank - needFuelForDistance;
			return this.getType() + " is moving on " + road.toString();
		}
	}

	public float getFuelInTank() {
		// TODO return required value
		return this.fuelInTank;
	}

	// HINT: use String.format(Locale.US, "%.2f", float) to limit shown numbers
	// to 2 decimal for fractions, and dot as a decimal delimiter.
	@Override
	public String toString() {
		// TODO return string in form:
		// "Id:ID cons:0.0l/100km, tank:00l, fuel:00.00l"
		return "Id:" + this.getId() + " cons:" + this.getConsumption() + "l/100km," + " tank:" +this.getTankSize() + "l," + " fuel:"
				+ (String.format(Locale.US, "%.2f", this.getFuelInTank())) +"l";
	}



}
