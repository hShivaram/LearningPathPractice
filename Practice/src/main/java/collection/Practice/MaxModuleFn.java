package collection.Practice;


	import java.util.*;


	// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

	class MaxModuleFn {
	    public static void main(String args[] ) throws Exception {
	        /* Sample code to perform I/O:
	         * Use either of these methods for input

	        //BufferedReader
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String name = br.readLine();                // Reading input from STDIN
	        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
	*/
	        //Scanner
	        Scanner sc = new Scanner(System.in);
	        // System.out.println("Enter the number of testcases");
		        int t = sc.nextInt();
		        int[] m =new int[t];
		        int[] k =new int[t];
		        String[] s = new String[t];

		        for(int i=0;i<t;i++){
		        	//System.out.println("Enter the first line of testcases");
		            m[i]=sc.nextInt();
		            k[i]=sc.nextInt();

	               // System.out.println("Enter the String of "+m+" size");

	                s[i]=sc.next();
		            
		        } 
	            int val=0,con=0;
	            int str=0,val1=0;

	            con =Integer.parseInt(s[0]);
	            val =(con%k[0]);
	            for(int j =0 ; j<t;j++){
	                for(int p=0;p<s[j].length()-1;p++){
	                   // System.out.println(p);
	                   
	                    for(int q=1;q<s[j].length();q++){
	                       // System.out.println(q);
	                        String ss = s[j].substring(p,q);
	                        str = Integer.parseInt(ss);
	                        System.out.println(str);
	                        val1  = (int)(str % k[j]);
	                        System.out.println(val1);
	                        System.out.println(val);
	                       if (val<val1){
	                            val=val1;
	                            }
	                    }
	                    System.out.println(val);
	                    
	                }
	                //System.out.println(val);
	            }

	            //System.out.println(val);

	    }
	}


