import java.util.ArrayList;
import java.util.List;

public abstract class MySweatProgram2 {

	public static void main(String[] args) {
		Student s = new Student("smartie", "Head");
		s.sayHello();
		
		s.status = s.status.active;
		System.out.println(s.status);
		switch(s.status) {
		case probation: 
			System.out.println("Ouch");
			break;
		case innactive:
			System.out.println("come back");
			break;
		case active:
			System.out.println("Great");
			break;
		}
		
//		List<Talk>thingsThatTalk = new ArrayList<Talk>();
//		thingsThatTalk.add(s);
		
//		s.sayHello();
//		System.out.println(s.firstName);
//		
//	    Student z = new Student("Ahmed", "werku");
//	    System.out.println(z.firstName);

			}
	    	
	    
		
		
	//	s.major = "archtect";
	//	s.major = "Mulesoft archetect";
	//	System.out.println(s.major);
	/*	s.firstName = "samrtie";
		s.lastName = "Head";
		s.sayHello();
		
		Teacher t = new Teacher();
		t.firstName = "Teach";
		t.lastName = "er";
		 
		List<User1>users = new ArrayList<User1>();
		users.add(s);
		users.add(t);
		
		for (User1 u : users) {
			u.sayHello();
		}
	*/	

	}


