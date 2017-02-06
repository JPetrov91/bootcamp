package org.activity09;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/*- TODO #2
 * Implement Iterator interface with OrderList class
 * Hint! Use generic type argument of iterateable items in form: Iterator<Order>
 * 
 * TODO #3 Override/implement public methods for OrderList class:
 * - OrderList()                — create new empty OrderList
 * - add(Order item)            — add passed order to the OrderList
 * - List<Order> getItemsList() — List of all customer orders
 * - Set<Order> getItemsSet()   — calculated Set of Orders from list (look at description below)
 * - sort()                     — sort list of orders according to the sorting rules
 * - boolean hasNext()          — check is there next Order in OrderList
 * - Order next()               — get next Order from OrderList, throw NoSuchElementException if can't
 * - remove()                   — remove current Order (order got by previous next()) from list, throw IllegalStateException if can't
 * - String toString()          — show list of Orders as a String
 * 
 * Hints:
 * 1. To convert OrderList to String, reuse .toString() method of List.toString()
 * 2. Use built in List.sort() method to sort list of orders
 * 
 * TODO #4
 * When implementing getItemsSet() method, join all requests for the same item from different customers
 * in following way: if there are two requests:
 *  - ItemN: Customer1: 3
 *  - ItemN: Customer2: 1
 *  Set of orders should be:
 *  - ItemN: Customer1,Customer2: 4
 */

public class OrderList implements Iterator<Order> {
	private List<Order> list;
	private int cursor = 0;
	boolean canRemove = false;
	
	OrderList() {
		list = new ArrayList<Order>();
	}
	
	public OrderList iterator() {
		return new OrderList();
	}
	
	public void add(Order item) {
		list.add(item);
	}
	
	List<Order> getItemsList() {
		return list;
	}
	
	Set<Order> getItemsSet() {
		Set set = new HashSet<>();
		for(Order item : list) {
			set.add(item);
		}
		return set;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return cursor != list.size();
	}

	@Override
	public Order next() {
		// TODO Auto-generated method stub
		if(this.hasNext()) {
			Order returningOrder = list.get(cursor);
			cursor++;
			return returningOrder;
		} else throw new IllegalStateException();
	}
	
	public void remove() {
		if(this.hasNext()) list.remove(cursor);
		else throw new IllegalStateException();
	}
	
	public List<Order> sort() {
		list.sort();
	}
	
	public String toString() {
		return list.toString();
	}
	/*-
	 * TODO #1
	 * Create data structure to hold:
	 *   1. some kind of collection of Orders (e.g. some List)
	 *   2. index to the current order for iterations through the Orders in OrderList
	 *   Hints:
	 *   1. you can use your own implementation or rely on .iterator() of the List
	 *   2. when constructing list of orders, set number of current order to -1
	 *      (which is usual approach when working with iterateable collections).
	 */
}
