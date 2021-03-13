package string.Practice;

import java.util.Scanner;

public class IntegerCheck {

	@SuppressWarnings("unused")
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements : ");
		String s = sc.nextLine();
		
		int len = s.length();
		int i=0;
		
		
		while(i != len) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				i++;
			}
			else {
				System.out.println("The String consists of other symbols");
				break;
			}
		}
		
	}
}
