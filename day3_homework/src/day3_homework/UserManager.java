package day3_homework;

public class UserManager {

	
	
	public void userAdd(User user) {
		System.out.println(user.getFirstName() + " isimli kullan�c� eklendi..");
	}
	
	
	public void userDelete(User user) {
		System.out.println(user.getFirstName() + " isimli kullan�c� silindi..");
	}
	
	
    public void userUpdate(User user) {
    	System.out.println(user.getFirstName() + " isimli kullan�c� g�n..");
    }
    
}
