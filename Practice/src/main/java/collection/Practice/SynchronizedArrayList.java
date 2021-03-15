package collection.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedArrayList {

	public static void main(String args[]) {
		
	List<Integer> arrlist=Collections.synchronizedList(new ArrayList<Integer>());
		
	// inorder to add,remove we dont need explicit synchronization
	
	arrlist.add(100);
	arrlist.add(200);
	arrlist.add(300);
	
	// in order to traverse we need explicit synchronization
	
	synchronized (arrlist) {
		Iterator<Integer> itr = arrlist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	}
}
