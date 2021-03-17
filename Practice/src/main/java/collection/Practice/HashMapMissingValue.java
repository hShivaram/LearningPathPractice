package collection.Practice;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapMissingValue {

	public static void main(String[] args) {
		
		HashMap<Integer,String> student1 = new HashMap<Integer,String>();
		
		student1.put(1, "A");
		student1.put(2, "B");
		student1.put(3, "C");
		student1.put(4, "D");
		
		HashMap<Integer,String> student2 = new HashMap<Integer,String>();
		
		student2.put(1, "A");
		student2.put(2, "B");
		student2.put(3, "C");
		student2.put(4, "D");
		student2.put(5, "E");
		student2.put(6, "F");
		
		//Verify whether both are same
		System.out.println(student1.equals(student2));
		
		//Find the extra value in 
		
		if(student1.equals(student2)) {
			System.out.println("Both the map have the same values");
		}
		else {
			HashSet<Integer> comb = new HashSet<Integer>(student1.keySet());
			
			comb.addAll(student2.keySet());
			comb.removeAll(student1.keySet());
			
			System.out.println(comb);
			for(Integer c : comb) {
				//System.out.println(c);
				System.out.println("The values are "+student2.get(c));
			}
		}
		
	}
}
