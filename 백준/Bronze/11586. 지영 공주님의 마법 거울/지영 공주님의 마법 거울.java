import java.io.*;
import java.util.*;
import java.lang.*;


public class Main {
	public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    String str = "";
     
    
    String[] arr = new String[n];
    
    for(int i = 0 ;i<n; i++) {
    	arr[i] = sc.next();
    }
    
    int mentalState = sc.nextInt();
    
    if(mentalState ==1) {
        for(int i = 0 ;i<n; i++) {
        	System.out.println(arr[i]);
        }
    }
    else if(mentalState==2) {
    	for(int i = 0;i<n;i++) {
    		str = arr[i];
    		String[] backwords = str.split("");
    	    for(int j = n-1;j>-1;j--) {
    	    	System.out.print(backwords[j]);
    	    }
    	    System.out.println();
        	}
        }
    	else {
            for(int i = n-1 ;i>-1; i--) {
            	System.out.println(arr[i]);
            }
    	}
    	
    }
    		

    
	
}