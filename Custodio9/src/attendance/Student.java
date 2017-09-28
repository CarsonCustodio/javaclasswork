package attendance;

public class Student implements Attendee{
	
	private String firstName;
	private String lastName;
	private boolean present;
	
	public Student(String first, String last) {
	
	}

	public boolean isPresent() {
		return present;
	}
	
	public void setPresent(boolean present) {
		this.present = present;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public boolean matches(String first, String last) {
		return first.toLowerCase().equals(firstName.toLowerCase()) && last.toLowerCase().equals(lastName.toLowerCase());
	}
	
	public boolean matches(String last) {
		return last.toLowerCase().equals(lastName.toLowerCase());
	}
	
	public String getReportString() {
		String report = lastName;
		if (report.length() > 20) {
			report = lastName.substring(0,17) + "...";
		}else {
			report += firstName;
		}
		return report;
	}

	public boolean mathces(String first, String last) {
		return false;
	}
}
