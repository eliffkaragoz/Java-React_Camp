package day3_homework;

public class UserManager {

	
	
	public void userAdd(User user) {
		System.out.println(user.getFirstName() + " isimli kullanýcý eklendi..");
	}
	
	
	public void userDelete(User user) {
		System.out.println(user.getFirstName() + " isimli kullanýcý silindi..");
	}
	
	
    public void userUpdate(User user) {
    	System.out.println(user.getFirstName() + " isimli kullanýcý gün..");
    }
    
}
