package string.Practice;

import java.util.Scanner;

public class Palndrome2 {

	public static boolean palindromeTest(String arg) {
		
		if(arg.length()%2 == 0) {
			return false;
		}
		
		for(int i=0;i<arg.length();i++) {
			if(arg.charAt(i) != arg.charAt(arg.length()-i-1)) {
				return false;
			}
		}
		
		return true;
		
	}
	
	
	
public static void main(String...strings) {
		
		String test=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string value");
		test=sc.nextLine();
		boolean result=palindromeTest(test.toLowerCase());
		
		System.out.println("Is the entered  text a plaindrome? "+ result );
		
	}
}
