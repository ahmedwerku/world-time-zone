class Dog {String name; int age;
       Dog(String n, int age) {
    	   name=n;
    	   this.age=age;
       }
       void bark() {
    	   System.out.println("woof");
       }
 void wakeTheNighbores() {
	 int i=50;
	 while(i>0) {
		 bark();
			 i=i-1;
	 }
		 
	 }
	 public static void main(String[] args) {
		 Dog fido = new Dog("Fido",5);
		 fido.wakeTheNighbores();
		 System.out.println();
				 
	 }
 }
 