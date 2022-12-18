import java.io.*;
import java.util.*;
import java.lang.*;


public class Main {
	public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    
    
     int t = sc.nextInt();
     
     int a = 0;
     
     int b = 0;
     
     int c = 0;
     
     int count = 0;
     
     for(int p = 0; p<t; p++) {
    	 
    	 a= sc.nextInt();
    	 
    	 b = sc.nextInt();
    	 
    	 c = sc.nextInt();
    	 
    	  for (int i = 1; i <= a; i++) {
              for (int j = 1; j <= b; j++) {
                  for (int k = 1; k <= c; k++) {
                      if (i%j==j%k && j%k==k%i && i%j==k%i) {
                          count++;
                      }
                  }
              }
          }
    	  System.out.println(count);
    	  count = 0;
    	 
     }
    
    
	}
}