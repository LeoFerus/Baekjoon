import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	     int t = sc.nextInt();
	    
	     int sum = 0;
	     
	     for(int i = 0 ; i<t; i++) {
	    	  int alphabet[] = new int[27];
	     	 String str = sc.next();
	    	 char[] arr = str.toCharArray();
	    	 for(int j = 0; j<arr.length;j++) {
	    		 char ch = str.charAt(j);
	 			alphabet[ch-'A']++;
	    	 }
	    	 for(int j = 0; j<26;j++) {
	    		 if(alphabet[j]==0) {
	         	   sum = j+65+sum;
	         	}
	    	    
	    	 }
	    	 System.out.println(sum);
    	     sum = 0;
	    

           
        }
	}
}