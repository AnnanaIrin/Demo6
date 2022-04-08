package practice_highly;

import java.util.Scanner;

public class LearnScanner {
	
	//Scanner: scan the document and return as image or pdf file 
	
	//Scanner Taking input from user and return output in console
	
	 // Scanner id java class
	
	public static void main(String[] args) {
		
		//Create an object of Scanner class
		//Scanner class is coming from Jdk
		// Argument need to pass
		
		Scanner input = new  Scanner(System.in  ); //This System.in take the input from this computer.
		
//	 System.out.println("Enter your First Name");
//	 // This line will request you enter string value during runtime
//	 String fname=input.nextLine();
//	 System.out.println("My First name is:"+fname);
//	 
//	 System.out.println("Enter your Last Name");
//	 String lname=input.nextLine();  //this nextLine only use string type of data 
//	 System.out.println("My Last Name is :"+lname);
//	 
//
//	 System.out.println("Enter your Age");
//	 int age=input.nextInt();  
//	 System.out.println("My Age is :"+age);
//	 
//	 System.out.println("Did you get job");
//	 boolean checkJobStatus=input.nextBoolean();  
//	 System.out.println("Job Status :"+checkJobStatus);
//	 
//	 System.out.println("What is your expected salary?");
//	 double expSalary=input.nextDouble();  
//	 System.out.println("expected salary :"+expSalary);
//	 
//	 System.out.println("What is your dress size?");
//	 char dressSize=input.next().charAt(0);  
//	 System.out.println("Dress Size :"+dressSize);
	 
	 System.out.println("*******************calculate salary********************");
	 System.out.println("Enter your working hours");
	 int workingHours=input.nextInt();
	 System.out.println("workingHours : "+workingHours);
	 
	 System.out.println("Enter your per hour salary");
	 double perHourSalary=input.nextDouble();
	 System.out.println("per hour salary rate : "+workingHours);
	 
	 
	 double WeeklySalary=workingHours*perHourSalary;
	 System.out.println("Weekly Salary : "+WeeklySalary);
	 
	 
	 double monthlySalary=WeeklySalary*4;
	 System.out.println("Monthly Salary:"+monthlySalary);
	 
	 
	
	 double yearlySalary=monthlySalary*12;
	 System.out.println("Yearly Gross Salary :"+yearlySalary); 
	 
	 System.out.println("Enter tax bracket");
	 double tax=input.nextDouble();
	 System.out.println("Tax bracket:"+tax);
	 
	 double yearlyNetSalary=yearlySalary-yearlySalary*tax;	 
	 System.out.println("yearly net salary:"+yearlyNetSalary);
	 
	 
	 
	 //System.out.printf("%.2f",val);
	 
	  double number=4555.5888;
	  System.out.printf("%.2f",number);
	  System.out.printf("This is Number value:%.2f", number);
	 
 System.out.printf("This is Number value:"+ String.format("%.2f",number));
		 
	 //close the scanner
       input.close();
	 
	 
	 
	 
		 
		
		
		
		
	}
	
	
	
	

	
	
	
	
}
