package string;

import java.util.Scanner;

public class PractiseString {
	
	public static void main(String[] args)
	{
Scanner s = new Scanner(System.in);
	 
		String str = s.nextLine();
		StringBuffer a= new StringBuffer();
		a.append(str);
	    String[] s1 = str.split("\\s+");
	    for(int i=0;i<s1.length;i++)
	    {
	    	 System.out.print(s1[i]);
	    }
	   
	    
	    
	    
	    
	    
	}
	
}
