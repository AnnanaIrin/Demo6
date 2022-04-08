package practice_highly;

public class LearnStatic {
	
	//static is a keyword
	// If we use static keyword then you can call variable, method by its class name
	
	
	 static String name="Husna";
	 String address="Huston,TX";
	 
	 public static void main(String[] args) {
		
		 
		 System.out.println("Student name is " +LearnStatic.name);
		 
		 //create object
		 LearnStatic learn=new LearnStatic();
		 System.out.println(learn.address);
		 
		 
		 
		 LearnStatic.display();  // call by class name because of static
		                         //parenthasis start and close that's call method.
		 
		 learn.tvDisplay();    // call object name because of non static method
		 
	}
	
	
	 public static void display() {
		 
		 System.out.println("This is a display method");  
		  
		  }
	
	
	 public static void tvDisplay() {
		 
		 System.out.println("This is a TV display method");
		 
	 }
	
	
	

}
