import java.util.ArrayList;
import java.util.List;

public class mySweatProgram {

	public static void main(String[] args) {
	//	String[] firstName = {"ahmed","werku","bahja","Ibrahi"};
	//	String[] lastName = {"Malik", "Hanan", "mekonen","merem"};
        User me = new User();
		me.setFirstName("Malik");
	  	me.setLastName("Mekonen");
	  	
	  	User you = new User();
		you.setFirstName("Bahja");
		you.setLastName("Ibrahim");
		//System.out.println(user.firstName);
		//System.out.print(user.lastName);
		//String message = user.output();
		//System.out.println(message);
		//System.out.println(user.getFirstName() +" "+ user.getLastName());
	 	//System.out.println(me.getFullName());
		
		List<User> users = new ArrayList<User>();
		users.add(me);
		users.add(you);
		
		User.changeCrap(you);
		System.out.println(you);
		
	//	User.printUsers(users);		
		
	//	System.out.println(me.output(false));
	//	System.out.println(User.searchList(users, "Ibrahim", "bahja"));
	//	System.out.println(me.hashCode() == you.hashCode());
	//	System.out.println(User.searchList(users, me));
		
	/*	for(int i = 0; i<firstName.length; i++) {
			 User u = new User();
			 u.setFirstName(firstName[i]);
			 u.setLastName(lastName[i]);
			 users.add(u);
		}
		for (User u : users) {
			System.out.println(u.getFullName());
		}
		mySweatProgram m = new mySweatProgram();
		m.printUser(users.get(0));
		   
	//	users.add(me);
	//	users.add(you);
	//	System.out.println(users.get(0).getFullName()+ ","+ users.get(1).getFullName());
		//System.out.println(users.get(1).getFullName());

	}
	public void printUser(User u) {
		System.out.println(u.getFullName());
	}
	*/

}
}
