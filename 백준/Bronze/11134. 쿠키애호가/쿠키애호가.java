import java.io.*;
import java.util.*;
import java.lang.*;


public class Main {
	public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    
    
    int t = sc.nextInt();
    
    int n =0;
    int c = 0;
    for(int i = 0; i<t ; i++) {
    	 n = sc.nextInt();
    	
    	 c = sc.nextInt();
    	
    	 if(n%c==0) {
    	System.out.println(n/c);
    
    	 }
    	 else {
    	 System.out.println(n/c+1);
    	 }
    }
    
    
    
		  
	  
	}
}