package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StringPattern {

	public static void main(String[] args)     {
	     

	//	BufferedReader  br=new BufferedReader(new InputStreamReader(System.in));
 Scanner s = new Scanner(System.in);
	 int test=s.nextInt();
	 while(test-->0)
	 {
	   String str=s.next();
	  int n=str.length();
	    for(int i=n;n>0;n--)
	    {
	        System.out.print(str.substring(0,n) +"\n");
	    }
          System.out.println();
	     
	     
	   }

	}

}
