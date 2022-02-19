package com.practice;

public class DupVowel {
	
	public static void main(String[] args) {
		

		String str = "tatasteel";
		int len =  str.length();
		char ch;
		
		
		for(int i=0; i<len; i++)
	    {
			for(int j=i+1;j<len-1;j++){
	       ch = str.charAt(i);
	       if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	       {
	    	   if(str.charAt(i)==str.charAt(j))
	    	   {
	    		   System.out.print(str.charAt(i));
	    	   }   	   
	       }    
		  }
	    }	
	  }

}
