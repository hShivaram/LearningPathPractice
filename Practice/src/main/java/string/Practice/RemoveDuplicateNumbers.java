package string.Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveDuplicateNumbers {
	
	
	public static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  
	
	public static int[] dup(int arr[],int l) {
		HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
		for(int i=0 ; i<l ; i++) {
			if(mp.containsKey(arr[i])) {
				mp.put(arr[i], mp.get(arr[i])+1);
			}
			else {
				mp.put(arr[i], 1);
				
			}
		}
		
		int [] ret = new int[mp.size()];
;		for (int i = 0; i < mp.size(); i++) {
            //char c = word.charAt(i);
            if (mp.get(arr[i]) > 1) {
                ret[i] =arr[i];
            }
        }
return ret;
		
	}
       
    public static void main (String[] args) {  
        int arr[] = {10,20,20,30,30,40,50,50,60};  
        int length = arr.length;  
        length = removeDuplicateElements(arr, length);  
        //printing array elements  
		/*
		 * for (int i=0; i<length; i++) System.out.print(arr[i]+" ");
		 */
        
        int[] tee=dup(arr, length);
    	
        for (int i=0; i<tee.length; i++)  
            System.out.print(tee[i]+" "); 
        
    }  
	        
	     
	        

	       
	   }
