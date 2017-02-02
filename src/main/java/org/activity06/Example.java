package org.activity06;

public class Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human = new Human(92);
		Martian martian = new Martian(90);
		Martian martian2 = new Martian(62);
		System.out.println(human.getClass());
		System.out.println(martian2);
		martian.setBackpack(martian2);
		System.out.println(martian.getBackpack());
//		System.out.println(martian.getBackpack().getClass());
//		System.out.println(human.clone());
//		System.out.println(martian.clone());
		martian.setBackpack("haha");
		System.out.println(martian.getBackpack());
		System.out.println(martian.getBackpack().getClass());
		System.out.println(human);
		martian.setBackpack(human);
		System.out.println(martian.getBackpack());
	
	}

}
