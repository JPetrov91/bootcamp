package org.activity04;

public class Road {
	private String from; // Start point
	private String to; // End point
	private int distance; // distance in km

	public int getDistance() {
		// TODO return distance of the road
		return 0;
	}

	@Override
	public String toString() {
		// TODO return string in form: "From — To, 00km"
		// Note that — is not dash ("minus key" in jargon), but m-dash!
		// See more at: https://en.wikipedia.org/wiki/Dash
		return "";
	}



	public Road() {
		// TODO implement Road constructor that without parameters
		// values are set to "" or 0;
	}

	public Road(String from, String to, int distance) {
		// TODO save passed values into road properties
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
	
}
