package string;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	 String str= s.nextLine();
	 String str1=str;
	 StringBuilder s1= new StringBuilder();
     s1.append(str);
     s1=s1.reverse();
     if(s1.equals(str1)){
    	 System.out.print("yes");
     }
     else
     {
    	 System.out.print("no");
     }
	// System.out.print(s1);
     
	 
	 
	 
	 
	}

}
