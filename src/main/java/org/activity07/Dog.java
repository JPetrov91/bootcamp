package org.activity07;

import java.util.regex.Pattern;

public class Dog extends Mammal {
	private String name;
	
	public void setName(String name) {
		Pattern characterRange = Pattern.compile("[a-zA-z]");
		boolean b = characterRange.matcher(name).find();
		int upperCase = name.charAt(0);
		if((b == false) || (upperCase <= 65 || upperCase > 90)) {
			System.out.println("Error");
			this.name = "";
		} else this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	public static void main(String [] args) {
		Dog dog = new Dog();
		dog.setName("Name");
		System.out.println(dog.getName());
	}
}
