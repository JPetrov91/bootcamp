package org.extra02;

/**
 * @author Student
 * 
 *         This class represents a bus driving in route, stopping at bus stops
 *         and adding passengers.
 */
public class LetsRide {
	int busStopCount;// bus stop count
	int passengersAtStart;// passengers at the start in bus
	int passengersCount;// overall passengers count in bus
	int seatsCount;// bus seats count

	public LetsRide(int busStopCount, int passengersInStop, int seatsCount) {
		// TODO #1: Set passed values to LetsRide object
		this.busStopCount = busStopCount;
		this.passengersCount = passengersCount + passengersInStop;
		this.seatsCount = seatsCount;
	}

	public int passengersAtRouteEnd() {
		// TODO #2: Calculate how many passengers will be in bus at the end of
		// route. Overall passenger count
		// is incremented by bus stop number. Example: In bus stop No.2
		// passenger count will be increased by 2, in stop No.4 it
		// will be increased by 4 and so on until bus reaches route end.
		// Note: Overall passenger count can't exceed seat count
		return passengersCount;
	}

	public int freeSeats() {
		int freeSeats = 0;
		freeSeats = this.seatsCount - this.passengersCount;
		// TODO #3: Calculate how much seats are free in bus
		return freeSeats;
	}

	public boolean isFull() {
		boolean status = false;
		// TODO #4: Check if bus is full.
		if(freeSeats() == 0) {
			status = true;
		}
		return status;
	}

	public int getBusStopCount() {
		return busStopCount;
	}

	public void setBusStopCount(int busStopCount) {
		this.busStopCount = busStopCount;
	}

	public int getPassengersAtStart() {
		return passengersAtStart;
	}

	public void setPassengersAtStart(int passengersAtStart) {
		this.passengersAtStart = passengersAtStart;
	}

	public int getPassengersCount() {
		return passengersCount;
	}

	public void setPassengersCount(int passengersCount) {
		this.passengersCount = passengersCount;
	}

	public int getSeatsCount() {
		return seatsCount;
	}

	public void setSeatsCount(int seatsCount) {
		this.seatsCount = seatsCount;
	}

}
