package collection.Practice;

import java.util.ArrayList;

public class VirtualCapacityArrayList {

	public static void main(String[] args) {
		
		
		ArrayList<Object> arr = new ArrayList<Object>();
		
		System.out.println(arr.size());
		
		arr.add(100);
		
		System.out.println(arr.size());
		arr.add(200);
		arr.add(300);
		arr.add(400);
		System.out.println(arr.size());
		
		

	}

}
