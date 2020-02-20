package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargestStringLength {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 int n=Integer.parseInt(br.readLine());
		 String str[]= new String [n];
	     for(int i=0;i<n;i++)
	     {
	         str[i]=br.readLine();
	     }
	     int count=0;
		 String st="";
		 for(int i=0;i<n;i++)
		 {
			 int len=str[i].length();
			 if(count<len){
				 count=len;
				 st=str[i];
				 
			 }
			 
		 }
		 
		 
		 
System.out.print(st);
		 
		 
	 
	}
}
