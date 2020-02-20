package string;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	 String str1= s.next();  
	   String str2=s.next();
	//  System.out.println(str1);
	//  System.out.println(str2);
	  int [] count= new int[26];
	  int n1=str1.length();
   int n2=str2.length();
	  int i;
	 for(i=0;i<str1.length();i++)
	 {
		 count[i]++;
		 count[i]--;
		//count[str2.charAt(i)]--;
	 }
	  
	 for(i=0;i<count.length;i++)
	 {
		 System.out.print(count[i]);
	 }
	 
	 
	 
}
	
	  
	  
	}

 
