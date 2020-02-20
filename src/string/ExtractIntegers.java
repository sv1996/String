package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExtractIntegers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		 

 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// int t=Integer.parseInt(br.readLine());
		 
		 String str=br.readLine();
		 String ans="";
		 boolean flag=false;
		 for(int i=0;i<str.length();i++)
		 
		 {
			 if((int)str.charAt(i)>=48 && (int )str.charAt(i)<=57 && str.charAt(i+1)!=' ')
	     {
				 ans+=str.charAt(i);
				//  ans+=" ";
				 flag=true;
		 } else
			 
		 {
			
			 if(ans.charAt(i)!=' ')
			 {
				 ans+=" ";
			 }
			 
			 
			 
		 }
			 
			 
		 
		 
	}
          if(!flag)
          {
	            System.out.print("no integer");
          }else
          {
        	  System.out.print(ans+" ");
          }
	 

	}
}
