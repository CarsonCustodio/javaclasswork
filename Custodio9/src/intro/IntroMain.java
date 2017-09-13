package intro; //package declaration matches the folder where this folder is located

//class header
public class IntroMain {	
	
	public static final String[] DESCRIPTIONS = {" is a teacher at BTHS", " is a student at BTHS"};
	public static final String[] NAMES = {"A", "B", "C", "D", "E"};
	
	//this is the first method that is executed. It is static because it is independent of instances.
	public static void main(String[] args) {
		//this is the declaration of an instance of CodingConventions
		//in the same line of code, it is also being instantiated
		//note the use of the word "new" this word is always used when calling constructors
		
		int numberOfPeople = 5;
		for(int i = 0; i < numberOfPeople; i++) {
			CodingConventions conventionsInstance = new CodingConventions(i, i%2);
			
			//local variables are not fields (has-a relationships)
			//they are variables that are only used in the scope of a method
			//after the method, they are destroyed
			
			/*
			 * instance method call (the method belongs to the instance, not the class)
			 */
			conventionsInstance.doStuff();
		}		
	}
}
