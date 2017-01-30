package org.extra01;

public class GetOne {
	
	public static void main(String[] args) {
		GetOne go = new GetOne();
		System.out.println(go.iterations(2));
		System.out.println(go.theMostComplexNo(2));
	}

	public int iterations(int number) {
		// TODO #1: Implement method which processes the passed positive number
		// value until it's
		// reduced to 1.
		// If the number is even then divide it by 2. If it is odd then multiply
		// it by 3 and add 1. Count how many iterations
		// it takes to do this calculation and return that count. For example:
		// passed number is 6. Path to completion would be:
		// 6->3->10->5->16->8->4->2->1. Iteration count=8.
		// HINT: Use while loop.
		int iterationCount = 0;
		while(number!=1) {
			if(number%2 == 0) {
				number = number / 2;
			} else {
				number = number * 3 + 1;
			}
			iterationCount++;
		}
		return iterationCount;
	}

	public int theMostComplexNo(int maxNumber) {
		// TODO #2: Calculate how many iterations each number from 1 to
		// maxNumber (including) to get value till 1.
		// Return the number, which takes most iterations to do that.
		int maxIteration = 1;
		int mostComplexCount = 1;
		for(int i = 1; i <= maxNumber; i++) {
			int k = iterations(i);
			if(k > maxIteration) {
				maxIteration = k;
				mostComplexCount = i;
			}
		}
		return mostComplexCount;
	}
}