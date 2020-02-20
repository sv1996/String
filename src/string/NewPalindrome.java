package string;

import java.util.Scanner;

public class NewPalindrome {

	public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	 int test=s.nextInt();
	 while(test-->0)
	 {
		 int n=s.nextInt();
		 String str= s.next();
		 int i,j;
		 int flag=0;
		 for( i=0,j=n-1;i<j;i++,j--)
		 {
			if(str.charAt(i)!=str.charAt(j))
			{
				flag=1;
				break;
			}
			 
			 
			 
			 
		 }
		 if(flag==0)
		 {
			 System.out.print("YES");
		 }
		 else
		 {
			 System.out.print("NO"); 
		 }
		 
		 
		 
	 }
	 
	 
	 
	 
	 
	 
	  
	 
	 

	}

}
