
public abstract class User1 implements Talk {
	public enum status {active, innactive, probation};
	private String firstName;
	private String lastName;
	public boolean verified = false;
	public status status;
	
	public void sayHello() {
		
	}
	
	public User1(String fn, String ln) {
		firstName = fn;
		lastName = ln;
	}
	
//	public void sayHello() {
//		System.out.println(firstName +" "+ lastName);
//	}

}
