import java.io.*;
import java.util.*;
import java.lang.*;


public class Main {
	public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int n = 0;
    while(true) {
    	n = sc.nextInt();
    	if(n==0) {
    		sc.close();
    		break;
    	}
    	for(int i = 1; i<n+1; i++) {
    		System.out.println("*".repeat(i));
    	}
    }
    
	}
}