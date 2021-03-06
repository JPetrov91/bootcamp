package org.extra08;

import static org.extra08.GenericsTest.log;

import java.util.LinkedList;
// TODO #1
// import statically org.activity16.GenericsTest.log
// StringBuilder to be able referring to it by its name only

public class Generics<E extends Number> extends LinkedList<E> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2340531446262587030L;
	// TODO #2
	// Use Eclipse code generation prompter to add generated serial version ID
	// for this class to avoid warning

	public Generics() {
		super();
		StringBuilder log = new StringBuilder();
		log.append("Generetics instance created");
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void push(E arg0) {
		// TODO Auto-generated method stub
		super.push(arg0);
	}

	// TODO #3
	// Select Source— Generate Constructors from Superclass... and select
	// LinkedList<E>().
	// And implement extended constructor that after new Generics object is
	// created, log has appended line "Generics instance created"
	// HINT: use lazy initialization for log StringBuilder object
	

	// TODO #4
	// Select menu: Source— Override/Implement methods..., extend LinkedList<E>
	// class, and select push(E) and pop() methods to override them.
	// TODO #4.1
	// Override pop() method of the list, that besides popping element from it
	// log has appended line: "java.lang.Integer: 1 popped", where:
	// java.lang.Integer is its class name
	// 1 is its actual value
	// TODO #4.2
	// override push() method that besides pushing new element into list
	// log has appended line: "java.lang.Double: 2 pushed", where:
	// java.lang.Double is actual class name of the value
	// 2 is its actual value
}
