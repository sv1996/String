package string;
import java.util.*;


public class Palindrome {
public static boolean checkPalindrome(String str  )
 {
	int length=str.length();
	if(length==0  || length==1)
	{
		return true;
	}
	if(str.charAt(0)==str.charAt(length-1))
	{
		return  checkPalindrome(str.substring(1,length-1));  
	}
	
	return false;
	
	
	
	
}
	
	
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String str= s.nextLine();
	//int length=str.length();
	boolean isPalindrome=checkPalindrome(str);
if(isPalindrome== true)
{
	System.out.println("yes");
}
else
{
	System.out.println("No");
}
	
	
	}

}
