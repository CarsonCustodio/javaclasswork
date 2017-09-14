package intro;

public class CodingConventions {
	
	//FIELDS ARE AT THE TOP
	private String name; //Declare fields only, instantiate in the constructor
	private String description;
	
	
	/*
	 * this is a constructor, it is like a method except the "return type" is an instance of the class
	 * for this reason, a constructor must always be named after the class
	 */
	public CodingConventions(int nameIndex, int descriptionIndex) {
		
		//there are 2 variables called "name" the local variable and the field
		//distinguish between the 2 by using the word "this" (field)
		this.name = IntroMain.NAMES[nameIndex];
		//this is a static call to a constant
		description = IntroMain.DESCRIPTIONS[descriptionIndex];
	}
	
	//normal method "void"
	public void doStuff() {
		//static method call:	
		System.out.println(name + description);
	}
	//test
	
}
