package arrays;

import java.util.Arrays;

public class ArraysMain {
	
	private int[] testArray;
	private int[] intRay;

	public ArraysMain() {
		intRay = new int[100];
		populate1ToN(intRay);
		shuffle(intRay);
		longestConsecSeq(intRay);
		//Arrays is a Utility class included in Java for formatting output
		System.out.println(Arrays.toString(intRay));
		
		int[] randomRolls = new int[1000];
		populate(randomRolls);
		
		int[] result = longestConsecSeqPos(randomRolls);
		System.out.println("The longest sequence of dice rolls is " + result[0]);
		System.out.println("It happened on the " + (result[1] + 1) + "th roll. Starting with a rool of " + randomRolls);
	}
	
	public int[] longestConsecSeqPos(int[] arr) {
		
	}
	
	public boolean nextElementIsInSequence(int[] arr, int pos) {
		return true;
	}
		
	public int longestConsecSeq(int[] arr) {
		int count = 1;
		int newCount = 0;
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] == arr[i-1] + 1) {
				count++;
				if(count > newCount) {
					newCount = count;
					count = 0;
				}
			}
		}
		
		if(count < 2) {
			count = 0;
		}
		System.out.println("The longest sequence is " + newCount);
		return newCount;
	}

	public void cycleThrough(int[] arr, int n) {
		for(int i = 0; i < n; i++) {
			frontBack(arr);
		}
	}
	
	/*Remove the element at index area, push every other element up by one.
	 * Put the element that was at zero at the end of arr.
	 */
	private void frontBack(int[] arr) {
		int firstValue = arr[0];
		for(int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length - 1] = firstValue;
	}
	
	private int countLessThan(int[] arr, int n) {
		int count = 0;
		for(int value: arr) {
			if(value < n)count++;
		}
		return count;
	}
	
	private int[] reverseOrder(int[] arr) {
		int[] newArr = new int [arr.length];
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = arr[arr.length - 1 - i];
		}
		return newArr;
	}
	
	private void reverseOrder2(int[] arr) {
		for(int i = 0; i < arr.length/2; i++) {
			swap(arr, i, arr.length - 1 -i);
		}
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
