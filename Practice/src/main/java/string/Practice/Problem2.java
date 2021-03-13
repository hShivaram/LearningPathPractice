package string.Practice;

import java.util.Scanner;

public class Problem2 {

	
	public static void main(String arg[]) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to be reversed : ");
		String s = sc.nextLine();
		
		char[] c = s.toCharArray();
		char[] rev = new char[c.length];
		int j =0;
		for(int i = c.length-1;i>=0;i--) {
			
			rev[j]=c[i];
			//System.out.println(rev[j]);
			j++;
		}
		System.out.println(String.valueOf(rev));
	}
}
