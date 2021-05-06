package day3_homework;

public class StudentUser extends User {
	
	private String course;
	private String completionRate;
	
	
	public StudentUser() {
		
	}
	
	public StudentUser(int id, String userNumber, String firstName, String lastName, String course , String completionRate) {
		
		super(id, userNumber, firstName, lastName);
		this.completionRate = completionRate;
		this.course = course;
	}
	
	
	

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	

	public String getCompletionRate() {
		return completionRate;
	}

	public void setCompletionRate(String completionRate) {
		this.completionRate = completionRate;
	}
	
}
