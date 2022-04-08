package practice_highly;

public class LearnNestedClass {
	
	//nested class means: child class
	//class name: LearnNestedClass
	//Parent class
	
	int age=44;
	static String firstName="Aryan";
	
	
	public static class Computer{
		//child class	
			
		
		String computerName="Mac"; //If create static varibale inside the child class,than you must have to declare class is always static.
		
		static int ram=16;
		
	    public static void main(String[] args) {
	    	
	    	System.out.println("Child class");
	    	
	    	//Create an object
	    	Computer myComputer=new Computer(); //to call non static variable create an object.
	    	System.out.println(myComputer.computerName);
	    	
	    	System.out.println(Computer.ram);
	    	
	    	myComputer.computerDisplay();
	    	
	    	
	    	LearnNestedClass learn=new LearnNestedClass(); //create object inside child class
	    	
	    	System.out.println(learn.age);
	    	
	    	
			}
		
		public void computerDisplay() {
			
			System.out.println("This is computer display");
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Parent class");
		
		
		Computer myCom=new Computer();
		
		System.out.println(myCom.computerName); //child class variable we can also call object
		
		System.out.println(Computer.ram);
		
		
		
		
	}
	
	
	
	
	
	
	

}
