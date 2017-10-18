package arrays;

public class Person {
	
	public static final String[] FIRST_START = {"Chr", "M", "L", "Gr", "C", "Th", "B", "J",};
	public static final String[] FIRST_MIDDLE = {"isti", "icha", "era", "eta", "ala", "ina", "ara", "ar"};	
	public static final String[] FIRST_END = {"", "na", "n", "r", "tian", "s", "rs", "mp", "les", "son"};
	
	public static final String[] LAST_START = {"Tr", "Br", "L", "Gr", "Sh", "C", "B", "J"};
	public static final String[] LAST_MIDDLE = {"om", "o", "an", "ola", "et", "e", "is", "usto"};	
	public static final String[] LAST_END = {"", "son", "ers", "rian", "ston", "ck", "sk", "les", "dio"};
	
	private String firstName;
	private String lastName;
	private Borough home;
	
	public Person(String first, String last, Borough home) {
		this.firstName = first;
		this.lastName = last;
		this.home = home;
	}
	
	public String toString() {
		return "My name is " + firstName + " " + lastName + " " + "and I live in " + home;
	}
}
