package org.activity11;

import java.util.LinkedList;

/**
 * This is frontend class for array filler. It uses ArrayFiller to fill array of
 * integers using sequental or concurrent (parallel) approach
 */
public class ArrayFillerManager {
	static int latency; // emulated latency in ms
	static int minValue, maxValue; // min and max (including) of the array cell
	static int[] array; // array to be filled
	static LinkedList<Thread> threads; // list of threads when parallel
										// filling is used

	// HINT feel free to use main() method to call setUp(), fillStupidly() etc.
	// for debugging purposes if unit tests doesn't show enough information,
	// what exactly in implementation seems wrong.
	// Note that main() method will not be used in unit tests.

	public static int[] setUp(int arraySize, int latency, int minValue,
			int maxValue) {
		// TODO save passed values in prepared structure
		// initialize array and list of threads
		// return reference to the created array
		ArrayFillerManager.minValue = minValue;
		ArrayFillerManager.maxValue = maxValue;
		ArrayFillerManager.array = new int[arraySize];
		ArrayFillerManager.latency = latency;
		threads = new LinkedList<Thread>();
		//threads = 
		return ArrayFillerManager.array;
	}

	public static void fillStupidly() {
		// TODO create cycle which creates new ArrayFiller objects
		// with filling range of only ONE cell at a time (i.e. range from..to is
		// 0..0, then 1..1, etc.) and invoke .run() method for these objects.
		// Note, that invocation of .run() method directly executes it in
		// current (main) thread.
		// Note that this method emulates, what would happen if you would send
		// just small portions of data through media with latency.
		for(int i = 0; i < 10; i++) {
			ArrayFiller afiller = new ArrayFiller(array, latency, minValue, maxValue, i, i);
			afiller.run();
		}
	}

	public static void fillSequentially() {
		// TODO create cycle which creates one ArrayFiller object
		// with filling range for ALL array but executed just in SINGLE thread
		// by invocation of .run() method directly.
		// Note that this method emulates, what would happen if you would do
		// proper "buffering" with large amount of data, but do execution just
		// in single thread.
		ArrayFiller afiller = new ArrayFiller(array, latency, minValue, maxValue);
		afiller.run();
	}

	public static void fillParalelly() {
		// TODO create cycle which creates new ArrayFiller objects
		// with any range and pass them as references to the Thread constructor.
		// Add newly created Thread objects into threads list and start them
		// threads using .start() method. Note that invocation of .start() for
		// thread object creates new concurrent thread in application
		// Note that, to pass tests, this implementation should run faster than
		// fillSequentally() method.
		//
		// HINT: Don't forget to check that separately started threads are
		// actually finished by calling .join() method for them.
		// Note that this method emulates, what would happen if you do proper
		// buffering and scaling of the execution.
//		for(int i = 0; i < array.length; i++) {
//			ArrayFiller afiller = new ArrayFiller(array, latency, minValue, maxValue);
//			Thread thread = new Thread(afiller);
//			threads.add(thread);
//			for(int k = 0; i < threads.size(); i++) {
//				threads.get(i).start();
//				try {
//					threads.get(i).join();
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
		ArrayFiller afiller = new ArrayFiller(array, latency, minValue, maxValue);
		afiller.run();

	}
	
	public static boolean isFreeCells(int [] array) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == 0) {
				return true;
			}
		}
		return false;
	}

}
