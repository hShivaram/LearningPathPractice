package collection.Practice;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String args[]) {
		
		//generic initialization
		
		ArrayList<Object> arr = new ArrayList<Object>();
		ArrayList<String> arr1 = new ArrayList<String>();
		String s = "Towardsthesky";
		int k =3;
		arr.add(23);
		arr.add(34);

	        
	        for(int i = 0 ;i <= s.length()-k;i++){
	            //System.out.println(s.substring(i,s.indexOf(s.charAt(i))+k));
	            arr1.add(s.substring(i,s.indexOf(s.charAt(i))+k));
	        }
	        for ( String sc : arr1){
	            System.out.println(sc);
	        }
		
		System.out.println(arr1.get(0));
		
		Object[] a = arr.toArray();
		
		for(Object i : a) {
			System.out.println(i);
		}
		
		
		
	}
}
