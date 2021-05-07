package day3_homework;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StudentUser user1 = new StudentUser(1, "1111", "Elif", "Karagöz" ,"JavaReact", "%50");
		InstructorUser user2 = new InstructorUser(2, "2222", "Engin", "Demiroğ", "Java" );
		
	
		
		UserManager userManager =  new UserManager();
		userManager.userAdd(user1);
		userManager.userAdd(user2);
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.completionCourse(user1);
		studentManager.selectCourse(user1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.selectProfession(user2);
	
		
		
	}

}
