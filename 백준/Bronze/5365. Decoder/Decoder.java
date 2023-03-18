import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	
    	String[] arr = new String[n];
    	
    	for(int i = 0 ; i < n; i++) {
    		arr[i] = sc.next();
    	}
    	
    	
    	System.out.print(arr[0].substring(0,1));
    	
    	for(int i = 1; i<n;i++) {
    		if(arr[i-1].length() > arr[i].length()) {
    			System.out.print(" ");
    		}
    		else {
    			System.out.print(arr[i].charAt(arr[i-1].length()-1));
    		}
    		
    		}
    
    }
}