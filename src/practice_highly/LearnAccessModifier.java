package practice_highly;

public class LearnAccessModifier {
	
	// Access Modifier: before variable and before method and before class
	
	public String name="Akter";
	public String address="Jamica, NY";
	private String backAccountNumber="70987655555";
	protected static int price=45;
	
	//living room is public place
	// master bedroom is private
	
	
	
	
	
	public static void main(String argu []) {
		
		
		
		
//		public int number=34;
//	
//		private int number=34;
		
		//object
		
		LearnAccessModifier le=new LearnAccessModifier();
		System.out.println(le.name);
		
		//private variable is called within same class
		System.out.println(le.backAccountNumber);
		
		
		System.out.println(LearnAccessModifier.price);
		System.out.println(le.address);
		
		
		
		
		le.display();
		
		
		
		
		
		
		
		
	}
	
	
	public void display() {
		
		System.out.println("This is a Display");
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
