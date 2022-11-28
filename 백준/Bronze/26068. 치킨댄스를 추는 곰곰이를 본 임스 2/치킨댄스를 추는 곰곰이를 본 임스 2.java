import java.io.*;
import java.util.*;
import java.lang.*;


public class Main {
	public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    int count = 0;
    
    
    
    for(int i = 0; i<n; i++) {
    	String str = sc.next();
    	String[] x = str.split("D-");
       if(Integer.parseInt(x[1])<=90) {
    	   count++;
       }
    }
    
    System.out.println(count);
	}
}