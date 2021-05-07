package day3_homework;

public class InstructorUser extends User {
	
	private String profession;

	public InstructorUser() {
		
	}
	
	

	public InstructorUser(int id, String userNumber, String firstName, String lastName,String profession) {
		super(id,userNumber,firstName,lastName);
		this.profession = profession;
	}



	public String getProfession() {
		return profession;
	}


	public void setProfession(String profession) {
		this.profession = profession;
	}
	
}
