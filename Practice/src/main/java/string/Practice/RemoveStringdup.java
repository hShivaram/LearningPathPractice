package string.Practice;

import java.util.Arrays;

public class RemoveStringdup {

	public static String duplicatremov(char[] str,int n) {
		
		int index=0;
		for(int i=0; i<n;i++) {
			
			int j;
			for(j=0;j<i;j++) {
				if(str[i]==str[j]) {
					break;
				}
			}
			
			if(j==i) {
				str[index++]=str[i];
			}
			
		}
		
		return String.valueOf(Arrays.copyOf(str,index));
	}
	
	 public static void main(String[] args) 
	    { 
	        char str[] = "mararvi".toCharArray(); 
	        int n = str.length; 
	        System.out.println(duplicatremov(str, n)); 
	    } 
}
