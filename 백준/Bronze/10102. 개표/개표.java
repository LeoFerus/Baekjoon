import java.io.*;
import java.util.*;
import java.lang.*;


public class Main {
	public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    String[] V = new String[n];
    int A = 0;
    int B = 0;
  
    V = sc.next().split("");
    
    for(int i = 0; i<n; i++) {
    	if(V[i].equals("A")) {
    		A++;
    	}
    	else {
    		B++;
    	}
    }
    
    if(A>B) {
    	System.out.println("A");
    }
    else if(A<B) {
    	System.out.println("B");
    }
    else {
    	System.out.println("Tie");
    }
 

    sc.close();
    
	}
}