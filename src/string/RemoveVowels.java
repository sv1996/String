package string;

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveVowels {
	
	 





	public static String removeVowel(String str)
    {
    //  char vowels[]={'a' ,'e','i','o','u','A','E','I','O','U'};
        
   //  List<Character> al= new ArrayList<Character>(vowels);
        
      //  Character vowels[] = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'}; 
        
     //   List al = (List) Arrays.asList(vowels); 
  String   str1=str.replaceAll("[AEIOUaeiou]", " ");
  
  return str1;
        
        
    }
	
	
	
	

	public static void main(String[] args) throws IOException {
		 InputStreamReader r=new InputStreamReader(System.in);   
		   BufferedReader br=new BufferedReader(r);     
		   String name=br.readLine(); 
	//	String str = s.nextLine();
	//	StringBuffer a= new StringBuffer();
// a=a.append(str);
	 
	     
	      System.out.println(removeVowel(name));
	    // removeVowel(str);
	    
	}

}
