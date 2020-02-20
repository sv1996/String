package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeleteAlternateCharacter {

	public static void main(String[] args) throws IOException {
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 
		 
		 
		 String str=br.readLine();
		 char[] str1=str.toCharArray();
		 String string="";
		 for(int i=0;i<str1.length;i+=2)
		 {
			  string+=str1[i];
		 }
		 
		 System.out.print(string);

	}

}
