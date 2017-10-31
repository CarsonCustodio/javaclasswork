package caveExplorer;

public class TwoDArrayPractice {
	
	public static void main(String[] args) {
		String[][] pic = new String[6][10];
		for(int row = 0; row < pic.length; row++) {
			for(int col = 0; col < pic[row].length; col++) {
				pic[row][col] = " ";
			}
		}
		drawHorizontalLine(pic, 0);
		drawHorizontalLine(pic, 5);
		drawVerticalLine(pic, 0);
		drawVerticalLine(pic, 9);
		drawBox(pic, 2, 2);
		print(pic);
	}

	private static void drawBox(String[][] pic, int i, int j) {
		drawSlot(pic, i, j);
		drawSlot(pic, i+1, j);
		drawIfInBounds("_", pic, i+1, j);
	}

	private static void drawIfInBounds(String string, String[][] pic, int i, int j) {
		//Always check row before column
		//check that row exists before checking if a column exists in the row
		if(i >= 0 && i < pic.length && j >= 0 && j < pic[i].length) {
			pic[i][j] = string;
		}
	}

	private static void drawSlot(String[][] pic, int i, int j) {
		if(i >= 0 && i < pic.length) {
			if(j > 0) {
				pic[i][j-1] = "|";
			}
			if(j < pic[i].length - 1) {
				pic[i][j+1] = "|";		
			}
		}
	}

	private static void drawVerticalLine(String[][] pic, int col) {
		for(int row = 0; row < pic.length; row++) {
			pic[row][col] = "|";
		}
		
	}

	private static void drawHorizontalLine(String[][] pic, int row) {
		for(int col = 0; col < pic[row].length; col++) {
			pic[row][col] = "-";
		}
	}

	private static void print(String[][] pic) {
		for(int row = 0; row < pic.length; row++) {
			for(int col = 0; col < pic[row].length; col++) {
				System.out.print(pic[row][col]);
			}
			System.out.print("\n");
		}
	}

}
