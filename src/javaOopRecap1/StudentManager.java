package javaOopRecap1;

public class StudentManager extends UserManager {
	public void getDepartmant(Student student) {
		System.out.println("Bölüm: "+student.getDepartmant());
	}
	@Override
	public void add(User user) {
		System.out.println("Öğrenci eklendi: "+user.getFirstName()+" "+user.getLastName());
	}
}
