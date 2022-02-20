package simpli.assignment;

import java.util.Scanner;

public class BubbleSort {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the how many numbers you want to print :");
		int size=sc.nextInt();
		int temp;
		int[] array=new int[size];
		
		for(int i=0;i<size;i++) 
		{
			System.out.println("Enter a Numbers :");
			array[i]=sc.nextInt();
		}
		sc.close();
		System.out.print("Before Sort :");
		for(int i=0;i<array.length;i++) 
		{			
			System.out.print(" "+array[i]);
		}
		
		for(int i=0;i<size;i++) 
		{
			for(int j=i+1;j<size;j++) 
			{
				if(array[i]>array[j]) 
				{
					   temp = array[i]; //temp=1
		               array[i] = array[j];   //array[i]=2
		               array[j] = temp;// array[j]=1
				}
			}
		}
		System.out.println();
		System.out.println("After Bubble Sort");  
        for(int i=0; i < array.length; i++){  
                System.out.print(array[i] + " ");  
        }  
	}

}
