package practice.java.tq;

import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1st number");
		int n1=sc.nextInt();
		System.out.println("Enter 2nd Number");
		int n2=sc.nextInt();
		System.out.println("Enter 3rd number");
		int n3=sc.nextInt();
		
		if(n1>n2 && n1>n3) 
		{
			System.out.println("Max number is :"+n1);
		}
		else if(n2>n1 && n2>n3) 
		{
			System.out.println("Max Number is :" +n2);
		}
		else {
			System.out.println("Max number is :"+n3);
		}

	}

}
