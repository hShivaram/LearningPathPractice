package collection.Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayToSet {

	 public static void main(String[] args) {

		 	String[] array = {"a", "b", "c"};
		 	int[] ac = {1,2,3,4,5,6,6};
	        Set<String> set = new HashSet<>(Arrays.asList(array));

	        System.out.println("Set: " + set);

	    }
}
