package string.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public   class ToChar {

	public static String duplicateChar(char[] ch) {
		HashMap<Character,Integer> mp = new HashMap<Character,Integer>();
		char[] str = new char[ch.length];
		
		for(char c : ch) {
			if(mp.containsKey(c)) {
				mp.put(c, mp.get(c)+1);
			}
			else {
				mp.put(c, 1);
			}
		}
		int i=0;
		for (Character c : mp.keySet())  {
			if(mp.get(c)>1) {
				str[i++]=c;	
			}
		}
		
		return String.copyValueOf(Arrays.copyOf(str, str.length));
		
	}
	
	  public static void main(String[] args) {
	  
	     
	  //ToChar cc = new ToChar();
	    { 
	        char str[] = "geeksforgeeks".toCharArray(); 
	       // int n = str.length; 
	        System.out.println(duplicateChar(str)); 
	    } 
}
	  
}
