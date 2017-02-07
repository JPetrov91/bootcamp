package org.activity11;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] array = new int[10];
//		ArrayFiller af = new ArrayFiller(array, 1000, 10, 15, 5, 10);
		
//		for(int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}
		
		int[]example = ArrayFillerManager.setUp(5, 1000, 15, 20);
//		ArrayFiller afiller = new ArrayFiller(example, ArrayFillerManager.latency, 
//				ArrayFillerManager.minValue, ArrayFillerManager.maxValue);
//		System.out.println("arrayFillerManager max value is: " + ArrayFillerManager.maxValue + " ");
//		System.out.println("ArrayFiller minValue is: " + afiller.minValue);
//		System.out.println("ArrayFiller maxValue is: " + afiller.maxValue);
//		System.out.println("ArrayFiller array length: " + afiller.array.length);
//		afiller.run();
		ArrayFillerManager.fillSequentially();
//		for(int i = 0; i < example.length; i++) {
//			System.out.println(example[i]);
//		}
		for(int i = 0; i < ArrayFillerManager.array.length; i++) {
			System.out.println(ArrayFillerManager.array[i]);
		}

	}

}
