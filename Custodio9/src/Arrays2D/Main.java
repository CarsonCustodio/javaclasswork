package Arrays2D;

public class Main {
	
	public static void main(String[] args) {
		
	}
	
	/*Increases the element in arr at index psn
	 * and decrease the elements at psn -1 and psn +1,
	 * if they exist
	 * 
	 * Avoiding an ArrayIndexOutOfBoundsException is a major topic of both AP CSA and quizzes/tests/projects
	 */
	public static void changeNeighbors(int[] arr, int psn) {
		arr[psn]++;
		if(psn > 0) {
			arr[psn - 1]--;
		}
		if(psn < arr.length) {
			arr[psn + 1]--;
		}
	}

}
