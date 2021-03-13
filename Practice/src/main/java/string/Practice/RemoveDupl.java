package string.Practice;

public class RemoveDupl {

	public static int remov(int arr[],int n) {
		if (n==0 || n==1) {
		return n;
		}
		
		int temp[] = new int[n] ;
		
		int j=0;
		for(int i =0 ; i<n-1 ; i++) {
			
			if(arr[i] != arr[i+1]) {
				temp[j++]=arr[i];
			}
		}
		
		temp[j++]=arr[n-1];
		
		for(int i=0;i<j;i++) {
			arr[i]=temp[i];
		}
		
		return j;
	}
	
	public static void main(String avg[]) {
		int arr[] = {10,20,20,30,30,40,50,50,60};  
        int length = arr.length;  
        length = remov(arr, length);  
        //printing array elements  
        for (int i=0; i<length; i++)  
           System.out.print(arr[i]+" ");  
    }  
	
}
