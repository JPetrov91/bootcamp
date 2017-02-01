package org.extra02;

public class Owl {
	// TODO Class Owl when it's born haven't caught any mice.
	// All owls have cuteness level set to the largest possible integer value.
	public int catchedMiceCount;
	private String name;
	private final int cuteness;
	

	public Owl(String name) {
		// TODO assign passed name to newly created structure of the owl
		// objectCreate new owl, assign passed name to it
		// Set its cuteness to the highest possible value
		cuteness = 2147483647;
		this.name = name;
	}

	public String getName() {
		// TODO Return owl's name
		return this.name;
	}

	public void setName(String name) {
		// TODO Change current owl name to the specified name
		this.name = name;
	}

	public int getCuteness() {
		// TODO Return cuteness level
		return cuteness;
	}

}
