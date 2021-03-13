package string.Practice;

import java.util.Scanner;

public class Problem3 {

@SuppressWarnings("resource")
public static void main(String arg[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to be verify : ");
		String s = sc.nextLine();
		
		char[] c = s.toCharArray();

		int flag =0;
		for(int i=0;i<(c.length)/2;i++) {
			
			
			if(c[i] != c[c.length-1-i]) {
				flag=1;
				break;
			
			}
		}
		
		if(flag==1) {
			System.out.println("The given string is not palindrome");
		}
		else {
			System.out.println("The given string is palindrome");
		}
		
	}
	
}
