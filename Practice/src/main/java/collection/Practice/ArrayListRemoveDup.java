package collection.Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemoveDup {

	public static void main(String[] args) {
		ArrayList<Object> arr1 = new ArrayList<Object>(Arrays.asList("Java","JS","ABAP","C#","Python","GoLang"));
		
		ArrayList<String> arr2 = new ArrayList<String>(Arrays.asList("Java","ABAP","C#","Python"));
		
		//Find elements which are extra in arr1 with respect to 2
		
		arr1.removeAll(arr2);
		
		System.out.println(arr1);
		
		//Find elements which are common in arr1 with respect to 2
		
		ArrayList<Object> arr3 = new ArrayList<Object>(Arrays.asList("GoLang","Java","JS","ABAP","C#","Python"));
		
		ArrayList<String> arr4 = new ArrayList<String>(Arrays.asList("Java","ABAP","Python"));
		
		arr3.retainAll(arr2);
		
		System.out.println(arr3);
	}
}
