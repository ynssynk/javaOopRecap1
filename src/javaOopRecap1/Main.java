package javaOopRecap1;

public class Main {

	public static void main(String[] args) {
		
		UserManager userManager=new UserManager();
		
		Instructor instructor=new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setPassword("678910");
		instructor.setCourse("Java - React");
		instructor.setRate("5");
		instructor.setAbout("MCT-PMP-ITIL");
		
		userManager.add(instructor);
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.getRate(instructor);
		
		Student student =new Student();
		student.setId(1);
		student.setStudentNumber("123456");
		student.setFirstName("Yunus");
		student.setLastName("Yanık");
		student.setEmail("ynssynk@gmail.com");
		student.setDepartmant("Bilgisayar Programcılığı");
		student.setPassword("12345");
		student.setCity("Sakarya");
		
		userManager.add(student);
		StudentManager studentManager=new StudentManager();
		studentManager.add(student);
		studentManager.getDepartmant(student);
		
		User[] users=new User[] {instructor,student};
		userManager.getList(users);
		
	}

}
