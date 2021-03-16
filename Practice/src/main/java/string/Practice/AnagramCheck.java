package string.Practice;

public class AnagramCheck {

	public static boolean isAnagram(String word, String anagram)
	{ 
		if(word.length() != anagram.length())
		{ return false; } 
		
		char[] chars = word.toCharArray(); 
		for(char c : chars)
		{ 
			//System.out.println(c);
			int index = anagram.indexOf(c);
			//System.out.println(index);
			
		if(index != -1)
		{ 
			anagram = anagram.substring(0,index) + anagram.substring(index +1, anagram.length());
			
			}
		else
		{ 
			return false; 
			} 
		} 
		return anagram.isEmpty(); 
		
	}
	

	public static void main(String args[]) 
	{ 
		System.out.println(AnagramCheck.isAnagram("word", "wrdo")); 
		
		/*
		 * System.out.println(AnagramCheck.isAnagram("mary", "army"));
		 * System.out.println(AnagramCheck.isAnagram("stop", "tops"));
		 * System.out.println(AnagramCheck.isAnagram("boat", "btoa"));
		 * System.out.println(AnagramCheck.isAnagram("pure", "in"));
		 * System.out.println(AnagramCheck.isAnagram("fill", "fil"));
		 * System.out.println(AnagramCheck.isAnagram("b", "bbb"));
		 * System.out.println(AnagramCheck.isAnagram("ccc", "ccccccc"));
		 * System.out.println(AnagramCheck.isAnagram("a", "a"));
		 * System.out.println(AnagramCheck.isAnagram("sleep", "slep"));
		 */ 
		
	}

	

}