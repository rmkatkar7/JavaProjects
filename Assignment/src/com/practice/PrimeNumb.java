package com.practice;
import java.util.Arrays;
public class PrimeNumb 
   {	
	public static void main(String[] args)
	{
		int arr[] ={2,7,9,5,1,8};
		int p,np;
		
		for(int i=0;i<=arr.length-1;i++) 
		{
			 p = 2;
	            np = 1;
	            
	            while (p < arr[i]) 
	            {
	                if (arr[i] % p == 0) 
	                {
	                    np = 0;
	                    break;
	                }
	                p++;
	            }
	            if (np == 1) 
	            {
	            	Arrays.sort(arr);
	                System.out.print(" " + arr[i]);
	         }
		}}}
