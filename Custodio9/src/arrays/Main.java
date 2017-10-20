package arrays;

import java.util.Arrays;

public class Main {
		
	public static void main(String[] args) {
		ObjectArrays oA = new ObjectArrays();
		Person s = new Person("Carson", "Custodio", Borough.NY_BOROUGHS[2]);
		int x = 10;
		int[] a = {5,6,7};
		test(s,x,a);
		System.out.println(s + ", " + x + ", " + Arrays.toString(a));
	}

	/**
	 * Pass-Bye-Values examples
	 * This does change the name
	 * no void method can permanently change an int;
	 * (you can if you set it as a return type)
	 */
	
	public static void test(Person s, int x, int[] arr) {
		String name = s.getFirstName();
		name = "WHAAAAA";
		x = 5;
		arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
	}
}