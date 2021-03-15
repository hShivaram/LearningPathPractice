package collection.Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		
		
		ArrayList<String> student = new ArrayList<String>();
		
		student.add("Tom");
		student.add("Ron");
		student.add("Don");
		student.add("Daniel");
		student.add("Manny");
		
		//normal for loop
		for(int i=0;i<student.size();i++) {
			System.out.println(student.get(i));
		}
		
		System.out.println("-------------------------");
		
		//for each loop
		for(String s:student) {
			System.out.println(s);
		}
		
		System.out.println("-------------------------");
		
		//Iterator
		
		Iterator<String> itr = student.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}

}
