package day3_homework;

public class StudentManager extends UserManager {

		public void selectCourse(StudentUser user) {
			System.out.println(user.getFirstName() + " isimli kullan�c� " + user.getCourse() + " kursunu se�ti .. ");
		}
		public void completionCourse(StudentUser user) {
			System.out.println(user.getFirstName() + " isimli kullan�c� " + user.getCourse() + " kursunu " + user.getCompletionRate() + " oran�nda tammalad� ");
		}
}
