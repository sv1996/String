package string;

import java.util.Scanner;

public class SplitString {

	public static void main(String[] args) {
		 Scanner  s = new Scanner(System.in);
		 String str=s.next();
		 char charString[]=str.toCharArray();
		 String ch="";
		 String digit="";
		 String spChar="";
		for(int i=0;i<charString.length;i++)
		{
			if(Character.isAlphabetic(charString[i]))
			{
				ch+=charString[i];
			}
			else if(Character.isDigit(charString[i]))
			{
				digit+=charString[i];
			}
			
			else
			{
				spChar+=charString[i];
			}
			
			
			
		}
		System.out.println(ch);
		System.out.println(digit);
		System.out.println(spChar);

	}

}
