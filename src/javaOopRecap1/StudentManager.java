package javaOopRecap1;

public class StudentManager extends UserManager {
	public void getDepartmant(Student student) {
		System.out.println("B�l�m: "+student.getDepartmant());
	}
	@Override
	public void add(User user) {
		System.out.println("��renci eklendi: "+user.getFirstName()+" "+user.getLastName());
	}
}
