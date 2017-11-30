package search;

public class ArtificialForLoop {

	public static void main(String[] args) {
		forLoop(10, new Action() {
			int count = 1;
			public void act() {
				System.out.println(count + " hello");
				count++;
			}
		});
	}

	public static void forLoop(int n, Action a) {
		a.act();
		forLoop(n-1, a);

	}
}
