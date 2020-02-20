package string;

import java.util.Scanner;

public class NonreatedCount {

	public static void main(String[] args) {
		
		
		
		
	//	 Scanner s = new Scanner(System.in);
		 
		 String str = "abcdabbb"; 
		    System.out.println(countChar(str)); 
		 
		 
		 

	}

	private static int  countChar(String str) {
		int count = 0;
		int length=str.length();
		  char[] inp = str.toCharArray();
		  for (int i = 0; i < str.length(); i++) {
			   for (int j = i + 1; j < str.length(); j++) {
			    if (inp[i] != inp[j]) {
			      
			      continue;
			      
			    }
			    else
			    {
			    	count++;
			    }
			   }
			 
			  
		  } 
		  return  count;
	}

}
