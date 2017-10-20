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
	private Hobby hobby;
	private Person[] friends;
	private String nickname;
	
	public Person(String first, String last, Borough home) {
		this.firstName = first;
		this.lastName = last;
		this.home = home;
		this.hobby = Hobby.randomHobby();
		friends = new Person[3];
		nickname = createNickname(first);
	}
	
	public boolean isVowel(String str) {
		String[] vowels = {"a", "e", "i", "o", "u"};
		for(int i = 0; i < vowels.length; i++) {
			if(str == vowels[i]) {
				return true;
			}
		}
		return false;
	}
	
	
	//Java is a Pass-Bye-Value
	//meaning the parameters of a method are just values, not references
	//so if you change those values, the original object is not affected
	//In this case, name will not change. In fact, nothing can change
	//this.firstName via name
	public static String createNickname(String name) {
		String nickname = "";
		int vowelCount = 0;
		for(int i = 0; i < name.length(); i++) {
			if(name.substring(i, i + 1).equals("a") || name.substring(i, i + 1).equals("e") || name.substring(i, i + 1).equals("i") || name.substring(i, i + 1).equals("o") || name.substring(i, i + 1).equals("u")) {
				vowelCount++;			
			}
			if(vowelCount < 2) {
				nickname += name.substring(i, i + 1);
			}
		}
		return nickname;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
		nickname = createNickname(firstName);
	}

	/*Chooses friends from People based on who is of the same class
	 * of this instance, and who has the same hobbies
	 */
	public void mingle(Person[] people) {
		System.out.println("I am in the " + this.getClass());
		for(Person p: people) {
			if(p != this) {
				p = betterFriend(p, friends[0]);
				
				addFriendToFirstPlace(p);
			}
		}
	}
	
	
	private Person betterFriend(Person p, Person q) {
		if(p == null) {
			return q;
		}
		if(q == null) {
			return p;
		}
		if(p.getClass() == this.getClass() && q.getClass() == this.getClass()) {
			if(p.hobby == this.hobby) {
				return p;
			}else if(q.hobby == this.hobby) {
				return q;
			}
		}
		if(p.getClass() == this.getClass()) {
			return p;
		}
		if(q.getClass() == this.getClass()) {
			return q;
		}
		return p;
	}

	public void printFriends() {
		System.out.println("My name is " + firstName + " " + lastName + " and these are my friends:");
		for(Person f: friends) {
			if(f != null) {
				System.out.println(f);;
			}
		}
	}
	//Moves all Person in friends back one index and puts p at index 0
	private void addFriendToFirstPlace(Person p) {
		for(int i = friends.length - 1; i > 0; i--) {
			friends[i] = friends[i-1];
		}
		friends[0] = p;
	}
	
	public String toString() {
		return "My name is " + firstName + " " + lastName + " " + "and I live in " + home + " and I like " + hobby + " my nickname is " + createNickname(firstName);
	}
}
