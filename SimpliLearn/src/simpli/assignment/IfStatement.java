package simpli.assignment;

import java.util.Scanner;

public class IfStatement {
	
	public static void main(String[] args)
	{
	   Scanner sc= new Scanner(System.in);
	   
	   System.out.println("Enter a number");
	   int marks= sc.nextInt();
	   
	   if(marks>=0 && marks<=100)
	   {
		   if(marks>=40) 
		   {
			   System.out.println("Passed");
		   }
		   else {
			   System.out.println("Failed");
		   }
		   
	   }
	  
	}

}
