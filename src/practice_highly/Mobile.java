package practice_highly;

public class Mobile {

	
	
	String mobileName="iPhone";
	int mobileRamsize=12;
	int mobileMemorySize=256;
	private char[] calling;
	static String mobileColor="Rose Golden";
	public int mobilePrice=1200;
	
	//behavior
	
	public void calling () {
		
		String mobileNumber="458987665";
		System.out.println("My mobileNumber"+mobileNumber);
//		System.out.println("Using mobile phone we can call Aryan");
		
	}
	public boolean isAvaialable() {
		is 
	}
	public static void main(String ags[]) {
		
		
		
		Mobile shisirMobile = new Mobile(); //allow to call variable using object name to print the value,
		
//		shisirMobile.mobileName; //not allowed 
		
		System.out.println(shisirMobile.mobileName);
		
		shisirMobile.mobileName="Samsung";
		
		String newMobile=shisirMobile.mobileName;
		
		System.out.println("New Mobile "+newMobile);
		
		shisirMobile.calling();// method is called by object name
		
//		System.out.println(shisirMobile.calling); // Only variable we can print, method we can't print, to print anything, you can print main method
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
