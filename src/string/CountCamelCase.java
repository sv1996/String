package string;

import java.util.Scanner;

public class CountCamelCase {

	public static void main(String[] args) {
		 Scanner s =new Scanner(System.in);
		 String str=s.next();
		 char[] strch=str.toCharArray();
	int	 count=0;
		 for(int i=0;i<strch.length;i++)
		 {
			 if(Character.isUpperCase(strch[i]))
			 {
				 count++;
			 }
			 
			 
			 
		 }
System.out.print(count);
	}

}
