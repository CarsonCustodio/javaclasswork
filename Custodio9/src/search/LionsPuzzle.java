package search;

public class LionsPuzzle {
	
	public static void main(String[] args) {
		int lions = 101;
		System.out.println(lions + " lions decided to eat the sheep? " + eatSheepOrNot(lions));
	}

	private static boolean eatSheepOrNot(int lions) {
		if(lions == 1) {
			//no other lions to eat you
			return true;
		}else {
			return !eatSheepOrNot(lions - 1);
		}
	}
}
