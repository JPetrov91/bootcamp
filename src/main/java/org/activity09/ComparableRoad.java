package org.activity09;

import org.activity04.Road;

//TODO Extend activity05.Road as ComparableRoad class, and
//implement Comparable<Road> interface

public class ComparableRoad extends Road implements Comparable<Road>
	{

	@Override
	public int compareTo(Road o) {
		// TODO Auto-generated method stub
		System.out.println("In compareTo method");
		if(this.equals(o)) return 0;
		if(!(this.getFrom().equals(o.getFrom())) || !(this.getTo().equals(o.getTo()))) {
			if(this.getTo().compareTo(o.getTo()) > 0) return 1;
			else if(this.getTo().compareTo(o.getTo()) < 0) return -1;
			else {
				if(this.getFrom().compareTo(o.getFrom()) > 0) return 1;
				if(this.getFrom().compareTo(o.getFrom()) < 0) return -1;
			}
		}
		else if(this.getDistance() > o.getDistance()) return 1;
		else if(this.getDistance() < o.getDistance()) return -1;
		return 0;
	}
	
	public ComparableRoad() {
		super();
	}
	
	public ComparableRoad(String from, String to, int distance) {
		super(from, to, distance);
	}

	// TODO reuse constructor of Road for constructor of
	// ComparableRoad()

	// TODO similarly reuse constructor of Road(String, String, int) for
	// constructor of
	// ComparableRoad(String, String, int)

	// TODO Implement equals(Object) method:
	// return true, if current road and passed road has the same start,
	// end points and distance. Note that direction of road is not
	// important, but distance is (different distance means different
	// route)
	// HINT use "obj.getClass()", to check, that passed object has proper
	// type
	
	public boolean equals(Object obj) {
//		if(this.getClass().equals(obj.getClass())) {
//			return this.getFrom().equals(((Road) obj).getFrom())&&this.getTo().equals(((Road) obj).getTo())
//					&&this.getDistance()==((Road) obj).getDistance();
		if(this.getClass().equals(obj.getClass())) {
			if(checkForPoints(obj)) return this.getDistance() == ((Road) obj).getDistance();
		}
//		}
//		return false;
//		}
		//return this.equals(obj.getClass());
//		System.out.println(this.getClass());
//		System.out.println(obj.getClass());
		return false;
	}
	
	public boolean checkForPoints(Object obj) {
		if(this.getFrom().equals(((Road) obj).getFrom()) || this.getFrom().equals(((Road) obj).getTo())) {
			return true;
		}
		else if(this.getTo().equals(((Road) obj).getFrom()) || this.getTo().equals(((Road) obj).getTo())) {
			return true;
		}
		return false;
	}
	
	

	// TODO Implement compareTo(Road) method
	// Sort Road by their from, to and and distance
	// HINT: reuse equals(Object) method.

}
