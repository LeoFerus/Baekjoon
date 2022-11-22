import java.io.*;
import java.util.*;
import java.lang.*;


public class Main {
	public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt()*7;
	
    int b = sc.nextInt()*13;
    
    if(a==b) {
    	System.out.println("lika");
    }
    else if(a>b) {
    	System.out.println("Axel");
    }
    else {
    	System.out.println("Petra");
    }
    sc.close();
    
	}
}