package simpli.assignment;

import java.util.Scanner;

public class PrinFiveNumbersFromUser {
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the how many numbers you want to print :");
		int size=sc.nextInt();
		int sum=0;
		float avg=1;
		int[] array=new int[size];
		
		for(int i=0;i<size;i++) 
		{
			System.out.println("Enter a Numbers :");
			array[i]=sc.nextInt();
		}
		sc.close();
		System.out.print("Entered Numbers :");
		for(int i=0;i<array.length;i++) 
		{			
			System.out.print(" "+array[i]);
			sum=sum+array[i];
			avg=sum/size;
			
		}
		System.out.println();
		System.out.print("Sum of Numbers  :"+sum);
		System.out.println();
		System.out.print("avg of Numbers :"+avg);
	}
}
