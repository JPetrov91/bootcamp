package org.extra02;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class OwlFarm {
	private Owl[] owls;
	private int owlCount;

	// You can use main() method to test your implementation by
	// running it as a Java application
	// Note that Unit tests don't invoke this method
	public static void main(String[] args) {
		// Change your code here, to check, how it works
		OwlFarm owlFarm = new OwlFarm();
		owlFarm.setupFarm();
		Owl[] owls = owlFarm.getOwls();
		for(int i = 0; i < owlFarm.getOwlCount(); i++) {
			Owl owl = owls[i];
			System.out.println(owl.getName() + " " + owl.getCuteness());
		}
	}

	public void setupFarm() {
		// TODO #1 Generate random number 1..5 (including) use it as
		// size to initialize array of owls.
		// HINT: use java.util.Random class for this.

		// TODO #2 Put names of owls in owls array with:
		// "Alfonso", "Bob", "Charly", "Diana", "Edgar"
		// HINT: you can define another array of strings and go through it
		// and initialize owls with names into owls array

		// TODO #3 Make first owl to catch one mouse.
//		Random rand = new Random();
//		int numberOfOwls = rand.nextInt(5) + 1;
		int min = 1;
		int max = 5;
		int numberOfOwls = ThreadLocalRandom.current().nextInt(min, max+1);
		this.owls = new Owl[numberOfOwls];
		String[] names = {"Alfonso", "Bob", "Charly", "Diana", "Edgar"};
		for(int i = 0; i < owls.length; i++) {
			Owl owl = new Owl(names[i]);
			owls[i] = owl;
		}
		owls[0].catchedMiceCount++;
	}

	/**
	 * If owl with such name exists, changes it's name.
	 * 
	 * @param startName
	 *            name which is needed to be changed.
	 * @param endName
	 *            for which we need to change owl name.
	 */
	public void renameOwl(String startName, String endName) {
		// TODO #5 Parse through owls and check their names.
		// If current name of owl is as startName, change it to the and setters
		// for it
		for(int i = 0; i < owls.length; i++) {
			Owl owl = owls[i];
			if((owl.getName()).equals(startName)) {
				owl.setName(endName);
			}
		}
	}

	public Owl[] getOwls() {

		// TODO return reference to owl array
		return owls;
	}

	public int getOwlCount() {
		// TODO return count of owls (array length)
		return owls.length;
	}

}
