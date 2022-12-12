import java.io.*;
import java.util.*;
import java.lang.*;


public class Main {
	public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    int row = n/2+1;
    
    int column = n - row +2;
    
    int total = row*column ; 
    
    System.out.println(total);
	  
	}
}