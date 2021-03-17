package collection.Practice;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.*;

public class HashMapBasics {

	public static void main(String[] args) {
		
		HashMap<String,Integer> student = new HashMap<String,Integer>();
		
		student.put("sam", 12344);
		student.put("Tom", 23455);
		student.put("King", 67898);
		student.put("Queen", 99878);
		student.put(null, 00000);
		student.put(null, 00001);
		
		student.remove(null);
		
		
		System.out.println(student);
		
		Iterator<String> itr = student.keySet().iterator();
		while(itr.hasNext()) {
		  String key = itr.next();
		  Integer value = student.get(key);
		  
		  System.out.println("key="+key+" Value="+value);
		}
		
		System.out.println("------------------------------------------");
		
		Iterator<java.util.Map.Entry<String, Integer>> it =student.entrySet().iterator();
		
		while(it.hasNext()) {
			java.util.Map.Entry<String, Integer> entry = it.next();
			
			System.out.println("Key is "+entry.getKey()+" Value is "+entry.getValue());
		}

		
	
	}

}
