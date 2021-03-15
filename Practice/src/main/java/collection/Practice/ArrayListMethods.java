package collection.Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		ArrayList<String> student = new ArrayList<String>();
		
		student.add("Tom");
		student.add("Ron");
		student.add("Don");
		student.add("Daniel");
		student.add("Manny");
		
		ArrayList<String> activity = new ArrayList<String>();
		
		activity.add("football");
		activity.add("tennis");
		activity.add("cricket");
		
		//student.addAll(activity);
		System.out.println(student);
		
		//student.addAll(2, activity);
		
		//System.out.println(student);
		
		ArrayList<String> clone = (ArrayList<String>) student.clone();
		
		System.out.println(clone);
		
		System.out.println(student.contains("Don"));
		System.out.println(student.contains("D"));
		
		ArrayList<String> arr = new ArrayList<String>(Arrays.asList("naveen","Tom","sam","jack","rile"));
		
		int i = arr.indexOf("sam");
		
		System.out.println(i);
		
		//arr.remove(6);
		System.out.println(arr);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		numbers.removeIf(num -> num%2==1);
		
		System.out.println(numbers);
		
		ArrayList<Integer> newlist = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		ArrayList<Integer> numbers1 = new ArrayList<Integer>(newlist.subList(3, 7));
		
		System.out.println(numbers1);
		
		Object ob[] = arr.toArray();
		
		for(Object o : ob) {
			System.out.println(o);
		}

	}

}
