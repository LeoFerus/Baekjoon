import java.io.*;
import java.util.*;
import java.lang.*;


public class Main {
	public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    
    int regular = sc.nextInt();
    
    int over = sc.nextInt();
    
    int t = sc.nextInt();
    
    int x =0;
    
    for(int i = 0; i<t; i++) {
    	
    	x = sc.nextInt();
    	
    	if(x<=1000) {
    	
    	System.out.println(x+" "+x*regular);
    	}
    	else {
    		System.out.print(x+" ");
    		System.out.println(regular*1000+(x-1000)*over);
    	}
    	
    	
    }
    
    
    
    
	}
}