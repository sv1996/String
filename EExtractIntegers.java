/*
 Given a string, the task is to extract all the integers from it.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains a string S as input.

Output:
For each test case, print all the integers with one space, if the string does not contain any integers, print "No Integers".

Constraints:
1<=T<=100
1<=S<=105

Example:
Input:
3
geeksforgeeks 12 23 practice
1: Prakhar Agrawal, 2: Manish Kumar Rai, 3: Rishabh Gupta
geeksforgeeks

Output:
12 23
1 2 3
No Integers
 */

package string;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class EExtractIntegers
 {
	public static void main (String[] args) throws IOException
	 {
    BufferedReader br =  
                   new BufferedReader(new InputStreamReader(System.in)); 
   int test=Integer.parseInt(br.readLine());
   
   while(test-->0)
   {
       
        String str= br.readLine(); 
		 	char p[] = str.toCharArray();
		 String str1="";
		 boolean b=true;
		 int c=0;
		 for(int i=0;i<p.length;i++)
		 {
			 if((int)p[i]>=48 && (int)p[i]<=57  )
			 {
				 
				str1=str1+p[i] ;
				c++;
				 
				 b=false;
	
             }
             
             else if(str1.length()>0 && str1.charAt(c-1)!=' ')
             {
            	 str1+=" "; 
            	 c++;
            	 
            	 
             }
			 
			 
			 
		 }
		 
		 
		 
		 
		 if(b)
		 {
			 System.out.print("No Integers");
			  
		 }else
		 {
			 System.out.print(str1);
		 }
		
		 
	 
		 
		 
        System.out.println();	 
      
   }
  
  
  
  
  
  
  
  
  
  
  
	 }
}