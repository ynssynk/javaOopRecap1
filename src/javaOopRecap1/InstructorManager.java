package javaOopRecap1;

public class InstructorManager extends UserManager{
	  public void getRate(Instructor instructor) {
		  System.out.println("E�itmen puan�: "+instructor.getRate());
	  }
	  @Override
	  public void add(User user) {
			System.out.println("E�itmen eklendi: "+user.getFirstName()+" "+user.getLastName());
		}
}
