import java.io.*;
import java.util.*;
import java.lang.*;


public class Main {
	public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    
     int N = sc.nextInt();
    
    int result = 1;
    for(int i = 1; i<N+1; i++) {
    	result = i*result;
    }
    String str = String.valueOf(result);
    
    String[] arr = str.split("");
    
    System.out.println(arr[arr.length-1]);
    
    
	}
}