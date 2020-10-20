package myFirstProject;

public class FirstCODE {
	int number = 0;
	String name = "malik";

	public static int add(int x,int y) {
	int z = x+y;
	return z ;}	
	
	enum FreshJuiceSize{small,mediume,large}
	
	public static void main(String[] args) 
	
	{FirstCODE myobject = new FirstCODE();
	FirstCODE myobject1 = new FirstCODE();
	int result = myobject.add(8, 10);
		FreshJuiceSize size;
	size = FreshJuiceSize.large ;
	
		
		System.out.println(size);
		System.out.println(result);
		System.out.println(myobject1.name);

		
	}
	


}
