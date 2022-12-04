import java.io.*;
import java.util.*;
import java.lang.*;


public class Main {
	public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    
    int z = sc.nextInt();
    
    int w = 0;
    
    int k = 0;
    
    for(int i = 0; i<z; i++) {
    	w = sc.nextInt();
    	
    	k = sc.nextInt();
    	
        System.out.println(w*k/2);
    }
	}
}