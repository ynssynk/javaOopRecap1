package javaOopRecap1;

public class InstructorManager extends UserManager{
	  public void getRate(Instructor instructor) {
		  System.out.println("Eðitmen puaný: "+instructor.getRate());
	  }
	  @Override
	  public void add(User user) {
			System.out.println("Eðitmen eklendi: "+user.getFirstName()+" "+user.getLastName());
		}
}
