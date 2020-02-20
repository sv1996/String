/*
 * Given a string, reverse only the vowels 
 * present in it and print the resulting string.

Input: First line of the input file contains
 an integer T denoting the number of test cases. Then T test cases follow. Each test case has a single line containing a string.

Output: Corresponding to each test case,
 output the string with vowels reversed.

Example:
Input:
4
geeksforgeeks
practice
wannacry
ransomware

Output:
geeksforgeeks
prectica
wannacry
rensamwora
 */
package string;

import java.util.Scanner;

public class ReverseVowels {
	private static String reverseVowels(String str1) {
		char[] str=str1.toCharArray();
		int j=0;
		String vowel="";
		 for(int i=0; i<str.length; i++)
		 {
			if(isVowel(str[i])) {
				 j++;
				 vowel+= str[i];
				
			}
		 }
			for(int k=0;k<str.length;k++)
			{
				if(isVowel(str[k]))
				{	
			      
					str[k]=vowel.charAt(--j);
				}
				
			}
			 
			return String.valueOf(str); 
	 
	}  
	private static boolean isVowel(char c) {
		 if(c=='a' || c=='e' || c=='i' || c=='o'  || c=='u' 
				 || c=='A' || c=='E' || c=='I' || c=='O'  || c=='U' )
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str=s.nextLine();
	//	str=reverseVowels(str);
		System.out.print(reverseVowels(str));

	}

	

}
