package string;

import java.util.Scanner;

public class RemoveCharaterFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s =new Scanner(System.in);
		 String str=s.next();
		// char[] strch=str.toCharArray();
	//int	 count=0;
		 String newStr="";
		 boolean flag=true;
		 
		 for(int i=0;i<str.length();i++)
		 {
			 if(str.charAt(i)>='a' && str.charAt(i) <='z' || str.charAt(i)>='A' && str.charAt(i)<='Z')
			 {
			flag=false; 
			
			 }
	        
			 else
			 {
				 newStr+=str.charAt(i);
			 }
			 
			 
			 
		 }
		 System.out.print(newStr);
 
	}

}
