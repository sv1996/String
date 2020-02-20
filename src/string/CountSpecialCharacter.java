package string;

import java.util.Scanner;

public class CountSpecialCharacter {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	//	 int test=s.nextInt();
		 String str=s.next();
		 int capsum = 0,lwsum = 0,spsum = 0,numsum=0;
		 
		 for(int i=0 ;i<str.length();i++)
		 {
			 
			if(str.charAt(i)>=65 && str.charAt(i)<=90 )
			{
				capsum++;  
			}
			 
			else if(str.charAt(i)>=97 && str.charAt(i)<=122){
				lwsum++;
				
			}
			 
			else if(str.charAt(i)>=48 && str.charAt(i)<=57){
				numsum++;
				
			} 
			else
			{
				spsum++;
			}
		 }
		 
		 System.out.println(capsum);
	 	 System.out.println(lwsum);
	 	 System.out.println(spsum);
	 	 System.out.println(numsum); 
		 
		 

	}

}
