package org.activity04;

public class TrafficManagementSystem {
	static Transport[] transports;
	static Road[] roads;

	/**
	 * This method is called to set up TransportManagementSystem
	 * 
	 * @param roads
	 * @param transport
	 */
	
	public static void main(String[] args) {
		Road road = new Road("Riga", "Ventspils", 180);
		System.out.println(road);
		System.out.println(road.getFrom());
		System.out.println(road.getTo());
		System.out.println(road.getDistance());
		Transport transport = new Transport("C", 8f, 12);
		System.out.println(transport.getConsumption());
		System.out.println(transport.getFuelInTank());
		System.out.println(transport.getId());
		System.out.println(transport.getTankSize());
		System.out.println(transport.move(road));
		addTransport(5);
		for(int i = 0; i < transports.length; i++) {
			transports[i] = transport;
		}
		for(int i = 0; i < transports.length; i++) {
			System.out.println(transports[i]);
		}
	}
	public static void initSystem(int roads, int transport) {
		addRoads(roads);
		addTransport(transport);
	}

	public static Transport[] getTransports() {
		// TODO return required value
		return transports;
	}

	public static void addTransport(int i) {
		// TODO create new array of transports in size of passed value
		transports = new Transport[i];
	}

	public static void setVehicle(Transport transport, int i) {
		// TODO set passed transport into transports array cell of passed index
		transports[i] = transport;
	}

	public static void addRoads(int i) {
		// TODO create new array of roads in size of passed value
		roads = new Road[i];
	}

	public static Road[] getRoads() {
		// TODO return required value
		return roads;
	}

	public static void setRoad(Road road, int i) {
		// TODO set passed road into passed cell of roads array
		roads[i] = road;
	}

}
