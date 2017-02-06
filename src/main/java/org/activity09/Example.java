package org.activity09;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order1 = new Order("ItemNameA", "OrdererA10", 15);
		Order order2 = new Order("ItemName6", "OrdererO10", 22);
		System.out.println(order1.compareTo(order2));

	}

}
