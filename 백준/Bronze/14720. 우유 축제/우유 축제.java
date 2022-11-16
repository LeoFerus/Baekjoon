import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    int now = 0; 
    
    int count = 0;
    
    int[] milk = new int[n];
    
    for(int i =0; i<n; i++) {
    	milk[i] = sc.nextInt();
    }
    
    for(int i = 0; i<n; i++) {
    	if(now==milk[i]) {
    		count++;
    		now++;
    	}
    	if(now == 3) {
    		now = 0;
    	}
    }
    System.out.println(count);
    sc.close();
    
	}
}