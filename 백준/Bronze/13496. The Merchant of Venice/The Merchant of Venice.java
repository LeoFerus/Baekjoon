import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		
		
	    Scanner sc = new Scanner(System.in);   
		
	 	int t= sc.nextInt();
	    
	    for(int i = 1; i<=t;i++) {
	        int n = sc.nextInt();
		    
		    int s =sc.nextInt();
		    
		    int d = sc.nextInt();
		    
		    int sum =0;
		    
		    for(int j = 0; j<n;j++) {
		    
		    	
		    	int dis = sc.nextInt();
		    	
		    	int v = sc.nextInt();
		    	
		    	if((dis+s-1)/s<=d)sum+=v;
		    }
            System.out.println("Data Set "+i+":");
            System.out.println(sum);
            System.out.println();
	    }
	    
	    
	}
	
}