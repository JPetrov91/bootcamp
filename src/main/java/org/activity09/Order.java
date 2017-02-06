package org.activity09;

/*- TODO #1
 * Implement Comparable interface with Order class
 * Hint! Use generic type of comparable items in form: Comparable<Order>
 * 
 * TODO #2 Override/implement necessary methods for Order class:
 * - Order(String orderer, String itemName, Integer count) — constructor of the Order
 * - int compareTo(Order order) — comparison implementation according to logic described below
 * - boolean equals(Object object) — check equality of orders
 * - int hashCode() — to be able to handle it in some hash... collection 
 * - String toString() — string in following form: "ItemName: OrdererName: Count"
 * 
 * Hints:
 * 1. When comparing orders, compare their values in following order:
 *    - Item name
 *    - Customer name
 *    - Count of items
 * If item or customer is closer to start of alphabet, it is considered "smaller"
 * 
 * 2. When implementing .equals() method, rely on compareTo() method, as for sane design
 * .equals() == true, if compareTo() == 0 (and vice versa).
 * 
 * 3. Also Ensure that .hashCode() is the same, if .equals() == true for two orders.
 * 
 */

public class Order implements Comparable<Order> {
	String customer; // Name of the customer
	String name; // Name of the requested item
	int count; // Count of the requested items
	
	public Order(String orderer, String itemName, Integer count) {
		this.customer = orderer;
		this.name = itemName;
		this.count = count;
	}

	@Override
	public int compareTo(Order otherOrder) {
		// TODO Auto-generated method stub
		if(this.equals(otherOrder)) return 0;
		if(!this.name.equals(otherOrder.name)) {
			if(this.name.compareTo(otherOrder.name) > 0) return 1;
			else if(this.name.compareTo(otherOrder.name) < 0) return -1;
		}
		if(!this.customer.equals(otherOrder.customer)) {
			if(this.customer.compareTo(otherOrder.customer) > 0) return 1;
			else if(this.customer.compareTo(otherOrder.customer) < 0) return -1;
		}
		if(this.count != otherOrder.count) {
			if(this.count > otherOrder.count) return 1;
			else if(this.count < otherOrder.count) return -1;
			else return 0;
		}
		return 0;
	}
	
	public boolean equals(Object o) {
		if(this.hashCode() == o.hashCode()) return true;
		else return false;
	}
	
	public int hashCode() {
		return customer.hashCode() + name.hashCode() + new Integer(count).hashCode();
	}
	
	public String toString() {
		return "ItemName: " + name + " OrdererName: " + customer + " " + count;
	}

}
