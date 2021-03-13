package string.Practice;

/**
 * Hello world!
 *
 */
public class Problem1 
{
    public static void main( String[] args )
    {
       String s = "ABC Tech";
       
       System.out.println(s.length());
       
       s = s.concat("\0");
       
       char[] c = s.toCharArray();
       
       
       System.out.println(c[8]);
       int i=0;
       
       while(c[i] != '\0') {
    	  
    	   i++;
       }
    System.out.println("The size of string is " + i);   
    
    }
}
