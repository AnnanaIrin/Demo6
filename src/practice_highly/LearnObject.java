package practice_highly;

public class LearnObject {
	
	
   //Object: An instance of a class and it will help us to call the states/variables and behavior/ Methods
   //Instance means copy
	
	public static void main(String[] args) {
		
		//How to create an object?
	    //className objectName = new constructorOfClass();
		// Using object we can call the states and behavior
		
		
		//Mobile
		
		Mobile yourMobile=new Mobile();
		yourMobile.mobileName="LG"; //Reassign
		System.out.println("your Mobile "+ yourMobile.mobileName);
		int lgQty=10;
		int lgTotalPrice=yourMobile.mobilePrice*lgQty;
		System.out.println("LG Total price "+lgTotalPrice);
		
		
		//can we create multiple object same class
		
		Mobile herMobile=new Mobile();
		herMobile.mobileName="Nokia";
		System.out.println("her Mobile "+ herMobile.mobileName);
		int nokiaQty=5;
		int nokiaTotalPrice=herMobile.mobilePrice*nokiaQty;
		System.out.println("Nokia Total price "+nokiaTotalPrice);
		
		
		Mobile hisMobile=new Mobile();
		hisMobile.mobileName="Iphone";
		System.out.println("his Mobile "+ hisMobile.mobileName);
		int iphoneQty=7;
		int iphoneTotalPrice=hisMobile.mobilePrice*iphoneQty;
		System.out.println("Iphone Total price "+iphoneTotalPrice);
		
		
		
	}
	
   
	
	
	
	
	
	
	
	
	
	
	
	
}
