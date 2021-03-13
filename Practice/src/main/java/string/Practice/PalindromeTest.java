package string.Practice;

import java.util.Scanner;

public class PalindromeTest {

	public static boolean palindromeTest(String arg) {
		if(arg.length()%2==0) {
			System.out.println("The provided string is having even characters, so cant be considered for palindorme");
			return false;
		}else {
			for(int i=0;i<arg.length()/2;i++) {
				if(arg.charAt(i)!= arg.charAt(arg.length()-i-1))
				{
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static boolean palindromeInbuildFun(String str) {
		 if (str == null)
	            return false;
	        StringBuilder strBuilder = new StringBuilder(str);
	        strBuilder.reverse();
	        return strBuilder.toString().equals(str);  
			}
	
	
	public static void main(String...strings) {
		
		String test=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string value");
		test=sc.nextLine();
		boolean result=palindromeTest(test);
		
		System.out.println("Is the entered  text a plaindrome? "+ result );
		
	}
}
