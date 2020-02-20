package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ListOfCharacterIntoString {
	
	
	
	
	

	public static void main(String[] args) throws NumberFormatException, IOException {
Scanner s = new Scanner(System.in);
	    
	//    int test= s.nextInt();
		 int size= s.nextInt();
		   
		   char[] arr= new char[size];
		   
		   for(int i=0;i<arr.length;i++)
		   {
		       arr[i]= s.next().charAt(0);
		   }
		   String str="";
		   for(int i=0;i<arr.length;i++)
		   {
		      str+=arr[i];
		   }
		System.out.print(str);
		

	}

}
