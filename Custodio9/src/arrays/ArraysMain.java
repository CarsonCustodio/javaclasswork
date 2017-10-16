package arrays;

import java.util.Arrays;

public class ArraysMain {
	
	private int[] testArray;
	private int[] intRay;

	public ArraysMain() {
		intRay = new int[100];
		//populate(intRay);
		//checkOccurences(intRay, 3, 18);
		populate1ToN(intRay);
		shuffle(intRay);
		//Arrays is a Utility class included in Java for formatting output
		System.out.println(Arrays.toString(intRay));
	}
	
	private void shuffle(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			swap(arr, (int)(Math.random() * intRay.length), (int)(Math.random() * intRay.length));
		}
	}

	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private void populate1ToN(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
	}

	private void checkOccurences(int[] arr, int start, int end) {
		int[] counter = new int[end - start + 1];
		for(int value: arr) {
			counter[value - start]++;
		}
		for(int i = 0; i < counter.length; i++) {
			System.out.println("A " + (start + i) + " was rolled " + counter[i] + " times.");
		}
	}

	private void populate(int[] intRay) {
		for(int i = 0; i < intRay.length; i++) {
			intRay[i] = diceRoll(3);
		}
	}

	public void notes() {
		//1. collection of primitives or objects
		//this is the only collections of primitives
		
		//2.size cannot be modified
		
		/*3. Elements of an array are REFERENCES to objects.
		 *  In other words, changing an element of an array changes
		 *  the REFERENCE, not the object.
		 */
		
		//_______________________________
		
		//There are two types of constructors, the first we've seen already\\
		int[] firstType = {0,1,2,3,4};
		//this constructor can only be used at the declaration. Error:
		//firstType = {5,6,7,8,9};
		
		//the second type:
		testArray = new int[50];
		/*for primitive arrays, when they are instantiated,
		 *they are automatically populated with 0s. This is not the case with 
		 *Object arrays, which are populated with 'null'.
		 */
		
		
		for(int i = 0; i < testArray.length; i++) {
			System.out.println("The #" + i + " item is:" + testArray[i]);
		}
		
		//for each loop (useful; only when you don't need to keep track of the index.
		for(int value:testArray) {
			//for each int in testArray...
			System.out.println(value);
		}		
	}

	public static void main(String[] args) {
		ArraysMain arrayPractice = new ArraysMain();
	}
	
	/**
	 * Returns the result from rolling "numberOfDice" dice
	 * @param numberOfDice
	 * @return
	 */
	public int diceRoll(int numberOfDice) {
		int result = 0;
		for(int i = 0; i < numberOfDice; i++) {
			result += (int)(Math.random() * 6) + 1;
		}
		return result;
	}

}
