package day3_homework;

public class InstructorManager extends UserManager{
	
	
	public void selectProfession(InstructorUser user) {
		System.out.println(user.getFirstName() + " isimli e�itmen " + user.getProfession()+ " bran��n� se�ti..");
	}
	
}
