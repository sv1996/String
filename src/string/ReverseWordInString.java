/* 
  Given a String of length S, reverse the whole string without reversing the individual words in it. Words are separated by dots.

Input:
The first line contains T denoting the number of testcases. T testcases follow. Each case contains a string S containing characters.

Output:
For each test case, in a new line, output a single line containing the reversed String.

Constraints:
1 <= T <= 100
1 <= |S| <= 2000

Example:
Input:
2
i.like.this.program.very.much
pqr.mno

Output:
much.very.program.this.like.i
mno.pqr


 */
package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReverseWordInString {

	public static void main(String[] args)  throws IOException  {
		 BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		 int test=Integer.parseInt(br.readLine());
	            while(test-->0)
	            {
	    String str=br.readLine();
			 // System.out.println(str);
	               str=str.replace('.',' ');
			     String strArray[] =str.split(" ");

			   for(int i=strArray.length-1;i>0;i--)
			    {
			        
			        
				System.out.print(strArray[i]+".");
				
			     }
		System.out.print(strArray[0]);

	System.out.println();
	 }
	 
	 
	 }
}

 