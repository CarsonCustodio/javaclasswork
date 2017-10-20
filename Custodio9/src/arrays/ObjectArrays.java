package arrays;

public class ObjectArrays {
	
	public ObjectArrays() {
		Person[]  people = new Person[12];
		populate(people);
		for(Person p: people) {
			p.mingle(people);
			p.printFriends();
			System.out.println("");
		}
	}
	
	private void populate(Object[] people) {
		for(int i = 0; i < people.length; i++) {
			String firstName = randomNameFrom(Person.FIRST_START, Person.FIRST_MIDDLE, Person.FIRST_END);
			String lastName = randomNameFrom(Person.LAST_START, Person.LAST_MIDDLE, Person.LAST_END);
			Borough b = randomBorough();
			if(Math.random() < .6) {
				//60% of the time
				int grade = (int)(Math.random() * 5) + 9;
				people[i] = new Student(firstName, lastName, b, grade);
			}else {
				//the other 40% of the time
				people[i] = new Person(firstName, lastName, b);	
			}
		}
	}

	private Borough randomBorough() {
		return Borough.NY_BOROUGHS[(int)(Math.random() * Borough.NY_BOROUGHS.length)];
	}

	private String randomNameFrom(String[] a, String[] b, String[] c) {
		return get(a) + get(b) + get(c);
	}

	private String get(String[] a) {
		return a[(int)(Math.random() * a.length)];
	}
	
	public Person[] selectGroup(Person[] population, int length) {
		Person[] subGroup = new Person[length];
		subGroup[0] = selectAPerson(population);
		for(int i = 1; i <subGroup.length; i++) {
			Person nextPerson = selectAPerson(population);
			while(personInGroup(subGroup, nextPerson)) {
				
			}
			subGroup[i] = nextPerson;
		}
		return subGroup;
	}
	
	
	//returns the # of differences between the 2 arrays
	//A difference means that they don't have the same element at the same position
	public double countDifferences(Person[] arr1, Person[] arr2) {
		int count = 0;
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] == arr2[i]) {
				count ++;
			}
		}
		return count;
	}
	
	public int testShuffling() {
		return 5;
	}

	public static boolean personInGroup(Person[] subGroup, Person nextPerson) {
		return false;
	}

	private Person selectAPerson(Person[] population) {
		int rand = (int)(Math.random() * population.length); 
		return population[rand];
	}
}
