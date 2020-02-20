package string;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str=s.nextLine();
		 System.out.print(str);
		int count=0;
		String str1[] =str.split(" ");
		for(int i=0;i<str1.length;i++)
		{
		    
		   System.out.print(str1[i]);
		      count++;
		   
		    
		   
		    
		    
		}
		 
		System.out.print(count);

	}

}
