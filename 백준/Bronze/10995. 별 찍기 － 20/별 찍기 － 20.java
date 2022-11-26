import java.io.*;
import java.util.*;
import java.lang.*;


public class Main {
	public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    for(int i = 0; i<n;i++) {
    	if(i%2==0)
    	System.out.println("* ".repeat(n));
    	else{
    		System.out.println(" *".repeat(n));
    	}
    }
    sc.close();
    
	}
}