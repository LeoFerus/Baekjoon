import java.io.*;
import java.util.*;
import java.lang.*;


public class Main {
	public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    int d = sc.nextInt();
    
    int total = 0;
    
    int[]arr = new int [n];
    
    for(int i = 0 ;i<n; i++) {
    	
    	arr[i] = sc.nextInt();
    	
    	total = arr[i]+total;
    }
    
    for(int i = 0; i<n; i++) {
    	
    	System.out.println(arr[i]*d/total);
    }
	}
}