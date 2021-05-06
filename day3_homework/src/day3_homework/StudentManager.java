package day3_homework;

public class StudentManager extends UserManager {

		public void selectCourse(StudentUser user) {
			System.out.println(user.getFirstName() + " isimli kullanýcý " + user.getCourse() + " kursunu seçti .. ");
		}
		public void completionCourse(StudentUser user) {
			System.out.println(user.getFirstName() + " isimli kullanýcý " + user.getCourse() + " kursunu " + user.getCompletionRate() + " oranýnda tammaladý ");
		}
}
