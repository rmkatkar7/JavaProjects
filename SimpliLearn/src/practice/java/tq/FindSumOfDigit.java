package practice.java.tq;

import java.util.Scanner;

public class FindSumOfDigit {

	public static void main(String[] args) {
		int num, digit, sum=0;
	      Scanner s = new Scanner(System.in);
	      
	      System.out.print("Enter a Number: ");
	      num = s.nextInt();
	      
	      while(num!=0)
	      {
	         digit = num%10;
	         sum = sum + digit;
	         num = num/10;
	      }
	      
	      System.out.println("\nSum of Digits = " +sum);
	   }

	}

