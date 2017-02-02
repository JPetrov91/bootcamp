package org.activity06;

public class Martian implements Humanoid, Alien, Cloneable {
	private int weight;
	private boolean isAlive;
	private Object backpack;
	
	public Martian(int weight) {
		this.weight = weight;
		isAlive = true;
	}

	@Override
	public void eatHuman(Humanoid humanoid) {
		// TODO Auto-generated method stub
		if(humanoid.isAlive().equals("Alive")) {
			System.out.println(humanoid.getWeight());
			this.setWeight(this.getWeight() + humanoid.getWeight());
			humanoid.killHimself();
		}
	}

	@Override
	public int getLegCount() {
		// TODO Auto-generated method stub
		return LEG_COUNT;
	}

	@Override
	public void setBackpack(Object item) {
		// TODO Auto-generated method stub
		backpack = item;
	}
	
	public void setBackpack(String item) {
		backpack = item;
	}
	
	@Override
	public Object getBackpack() {
		// TODO Auto-generated method stub
		if(backpack instanceof Martian) {
			//return (Alien) backpack;
			Martian m = (Martian)backpack;
			System.out.println("martian");
			return m.clone();
		}
		else if(backpack instanceof Human) {
			return new Human((Human)backpack);
		}
		else if(backpack instanceof String) {
			//System.out.println("string");
			String str = new String((String) backpack);
			return (String) str;
		}
		else return "";
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
		return this.isAlive();
	}

	@Override
	public int getArmCount() {
		// TODO Auto-generated method stub
		return ARM_COUNT;
	}

	@Override
	public String isAlive() {
		// TODO Auto-generated method stub
		return "I AM IMMORTAL!";
	}
	
	@Override
	public Martian clone() {
		Martian martian = null;
		try {
			martian = (Martian) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println(e);
		}
		return martian;
	}

}
