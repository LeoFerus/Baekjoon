
import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	    int n = sc.nextInt();
	
	    int [] array = new int [n];
	    
	    int m = sc.nextInt();
	  
	    for (int i = 0; i<m; i++) {
	    	
	    	int a = sc.nextInt();
	    	
	    	int b = sc.nextInt();
	    	
	    	array[a-1]++;
	    	array[b-1]++;
	    }
		
	    for(int i = 0; i<n; i++) {
	     System.out.println(array[i]);
	     }
	    sc.close();
	}

}