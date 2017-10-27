package caveExplorer;

import java.util.Scanner;

public class CaveExplorer {

	public static CaveRoom[][] caves;//every room in the cave
	public static Scanner in;//for user input
	public static CaveRoom currentRoom;//changes based on how the user navigated
	public static Inventory inventory;//where all objects found in cave are kept
	public static boolean playing = true;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		CaveRoom.setUpCaves();
		
		inventory = new Inventory();
		startExploring();
	}

	private static void startExploring() {
		while(playing) {
			print(inventory.getDescription());
			print(currentRoom.getDescription());
			print("What would you like to do?");
			String input = in.nextLine();
			currentRoom.interpretInput(input);
		}
	}
	
	public static void print(String s) {
		String printString = "";
		int cutoff = 55;
		while(s.length() > 0){
			String currentCut = "";
			String nextWord = "";
			while(currentCut.length()+nextWord.length() < cutoff && s.length() > 0){
				currentCut += nextWord;
				s = s.substring(nextWord.length());
				int endOfWord = s.indexOf(" ");
				if(endOfWord == -1) {
					endOfWord = s.length()-1;//subtract 1 because index of last letter is one les than length
				}
				nextWord = s.substring(0,endOfWord+1);
			}
			printString +=currentCut+"\n";
		}
		System.out.print(printString);
	}
}
