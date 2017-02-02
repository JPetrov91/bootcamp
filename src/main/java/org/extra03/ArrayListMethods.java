package org.extra03;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
	List<Integer> myList = new ArrayList<Integer>();

	public List<Integer> checkArray(int comparator, int... numbers) {
		// TODO #1:Implement method that compares values of passed array with
		// passed comparator.
		// Return list with values that are smaller than comparator.
		// Hint: Investigate how varargs are used.
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] < comparator) {
				myList.add(numbers[i]);
			}
		}
		return myList;
	}

	public int sumResult() {
		int sum = 0;
		// TODO #2: Count element sum of the list
		for(int i = 0; i < myList.size(); i++){
			sum = sum + myList.get(i);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		ArrayListMethods alm = new ArrayListMethods();
		alm.checkArray(15, 12, 46, 22);
		alm.sumResult();
		System.out.println(alm.sumResult());
	}
}
