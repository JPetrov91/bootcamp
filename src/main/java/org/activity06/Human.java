package org.activity06;


public class Human implements Humanoid {
	public int weight;
	String backpack;
	public boolean isAlive;
	
	public Human() {
		isAlive = true;
		this.weight = 42;
	}
	
	public Human(int weight) {
		this.weight = weight;
		isAlive = true;
	}

	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return this.weight;
	}

	@Override
	public void setWeight(int weight) {
		// TODO Auto-generated method stub
		this.weight = weight;
	}

	@Override
	public String killHimself() {
		// TODO Auto-generated method stub
		isAlive = false;
		return isAlive();
	}

	@Override
	public int getArmCount() {
		// TODO Auto-generated method stub
		return ARM_COUNT;
	}


	@Override
	public void setBackpack(String item) {
		// TODO Auto-generated method stub
		this.backpack = item;
	}

	@Override
	public String isAlive() {
		// TODO Auto-generated method stub
		if(isAlive) {
			return "Alive";
		}
		else return "Dead";
	}

	@Override
	public String getBackpack() {
		// TODO Auto-generated method stub
		return backpack;
	}

}