package org.activity09;

import org.activity04.Road;

//TODO Extend activity05.Road as ComparableRoad class, and
//implement Comparable<Road> interface

public class ComparableRoad extends Road implements Comparable<Road>
	{

	@Override
	public int compareTo(Road o) {
		// TODO Auto-generated method stub
		return 0;
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
	
	

	// TODO Implement compareTo(Road) method
	// Sort Road by their from, to and and distance
	// HINT: reuse equals(Object) method.
}
