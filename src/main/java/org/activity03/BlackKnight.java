package org.activity03;

import java.util.ArrayList;

/**
 * Black Knight is brave soldier who fights till he is alive. He doesn't bother
 * if some of his arms or legs are cut off. You can kill him only when he lose
 * head. More info at:
 * https://en.wikipedia.org/wiki/Black_Knight_%28Monty_Python%29
 */
public class BlackKnight {
	// Class variables which are shared between all class members (objects)
	public static short totalKnights; // total number of knights at the start of
										// the battle
	public static short aliveKnights; // total number of alive knights
	public static short deadKnights; // total number of dead knights
	public static BlackKnight[] knights; // array of knights in the battle

	// instance variables which are separate for each class member (object)
	public String name; // knight name
	public byte arms, legs, head; // number of limbs
	public boolean alive; // is knight alive

	public static void setBattle(int initialNumber) {
		// TODO initialize new array of knights with the passed size.
		// Reset total numbers of total and alive knights to zero
		knights = new BlackKnight[initialNumber];
		totalKnights = 0;
		aliveKnights = 0;
	}
	public static void main(String[] args) {
		setBattle(5);
		BlackKnight bk0 = new BlackKnight("Vasya0");
		BlackKnight bk1 = new BlackKnight("Vasya1");
		BlackKnight bk2 = new BlackKnight("Vasya2");
		BlackKnight bk3 = new BlackKnight("Vasya3");
		BlackKnight bk4 = new BlackKnight("Vasya4");
		
		for(int i = 0; i < knights.length; i++) {
			System.out.println(aliveKnights);
			if(knights[i].name.equals("Vasya2")) {
				System.out.println(knights[i].cutOffHead());
				System.out.println(knights[i].cutOffArm());
			}
			System.out.print(knights[i].name + " ");
			System.out.print(knights[i].alive + " ");
			System.out.print(knights[i].arms + " ");
			System.out.print(knights[i].legs + " ");
			System.out.print(knights[i].head + " ");
			System.out.println();
			
		}
		
		ArrayList<BlackKnight> list = fromArrayToArrayList(knights);
		ArrayList<String> strlist = getAliveKnightsNames(list);
		String[] array = fromArrayListtoArray(strlist);
		printnames(array);
		
		
		
	}

	public BlackKnight(String name) {
		// TODO set name of newly created knight
		// 1. set proper count of his arms, legs and head,
		// 2. set his status to alive
		// 3. put reference of this knight into next free cell of knights static
		// array
		// 4. increase number of total and alive knights of static counters
		this.name = name;
		this.arms = 2;
		this.legs = 2;
		this.head = 1;
		this.alive = true;
		knights[totalKnights] = this;
		totalKnights++;
		aliveKnights++;
	}

	public String cutOffArm() {
		// TODO handle cutting off knight's arms in following way:
		// If knight is dead, return "Only chicken beats dead!"
		// If knight has some arms, cut one off and return "Bugger!"
		// Else return just "Haah!"
		if(!this.alive) {
			return "Only chicken beats dead!";
		}
		else if(this.arms>0) {
			this.arms--;
			return "Bugger!";
		}
		return "Haah!";
	}

	public String cutOffLeg() {
		// TODO handle cutting off legs knight's legs in following way:
		// If knight is dead, return "Only chicken beats dead!"
		// If knight has some legs, cut one off and return "Bollocks!"
		// Else return just "Haah!"
		if(!this.alive) {
			return "Only chicken beats dead!";
		}
		else if(this.legs>0) {
			this.legs--;
			return "Bollocks!";
		}
		return "Haah!";
	}
	public String cutOffHead() {
		// TODO handle cutting off knight's head in following way:
		// If knight is dead, return "Only chicken beats dead!"
		// If knight is alive and has head, cut it off and update
		// number of total alive and dead knights and then
		// If there are other knights alive return:
		// "You'l newer win! Arthur, Cnut will still fight!"
		// Where "Arthur, Cnut" are names of still alive knights
		// Else return "You'l burn in hell forever!"
		if(!this.alive) {
			return "Only chicken beats dead!";
		}
		else {
			this.head--;
			aliveKnights--;
			deadKnights++;
			this.alive = false;
			if(aliveKnights > 0) {
				ArrayList<String> list = getAliveKnightsNames(fromArrayToArrayList(knights));
				String[] aliveKnights11 = fromArrayListtoArray(list);
				//printnames(aliveKnights11);
				return "You'l newer win! " + printnames(aliveKnights11) + " will still fight!";
		}
			else return "You'l burn in hell forever!";
		}
	}
	
	public static void printnames(String[] array) {
		int lastAliveKnight = array.length;
		System.out.println("lk: " + lastAliveKnight);
		for(int i = 0; i < array.length; i++) {
			if(i == (lastAliveKnight-1)) {
				System.out.print(array[i] + " ");
				break;
			}
			System.out.print(array[i] + ", ");
		}
	}
	
	public static ArrayList<String> getAliveKnightsNames(ArrayList<BlackKnight> list) {
		ArrayList<String> aliveKnightsNames = new ArrayList<String>();
		for(BlackKnight knight : list) {
			if(knight.alive) {
				aliveKnightsNames.add(knight.name);
			}
		}
		return aliveKnightsNames;
	}
	
	public static ArrayList<BlackKnight> fromArrayToArrayList(BlackKnight[] array) {
		ArrayList<BlackKnight> list = new ArrayList<BlackKnight>();
		for(int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}
		return list;
	}
	
	public static String[] fromArrayListtoArray(ArrayList<String> aliveKnightsList) {
		int n = aliveKnightsList.size();
		String[] aliveKnightsArray = new String[n];
		for(int i = 0; i < aliveKnightsArray.length; i++) {
			aliveKnightsArray[i] = aliveKnightsList.get(0);
			aliveKnightsList.remove(0);
		}
		return aliveKnightsArray;
	}

}
