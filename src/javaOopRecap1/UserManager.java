package javaOopRecap1;

public class UserManager {
	public void getList(User[] users) {
		for(User user:users) {
			System.out.println("Kullan�c�: "+user.getFirstName()+" "+user.getLastName());
		}
	}
	public void add(User user) {
		System.out.println("Kullan�c� eklendi: "+user.getFirstName()+" "+user.getLastName());
	}
	
}
