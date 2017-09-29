package attendance;

public class Student implements Attendee {
	
	String firstName;
	String lastName;
	private boolean ispresent = false;
	
	public Student(String first,String last){
		firstName = first;
		lastName = last;
	}
	
	public boolean isPresent() {
		return ispresent;
	}

	public void setPresent(boolean present) {
		ispresent = present;	
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public boolean mathces(String first, String last) {
		if(first.toLowerCase().equals(firstName) && last.toLowerCase().equals(lastName) ) {
			return true;
		}
		return false;
	}

	public boolean matches(String last) {
		if(last.toLowerCase().equals(lastName)) {
			return true;
		}
		return false;
	}

	public String getReportString() {
		while(firstName.length()<20) {
			firstName+= " ";
		}
		while(lastName.length()<20) {
			firstName+= " ";
		}
		return firstName + lastName + ispresent;
	}
}
