import java.io.*;
import java.util.*;
import java.lang.*;


public class Main {
	public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    int[] arr = new int [n];
    
    int total =0;
    
    for(int i = 0 ; i<n; i++) {
    	arr[i] = sc.nextInt();
    	total = arr[i] + total;
    }
    
    Arrays.sort(arr);
    
    System.out.println(total - arr[arr.length-1]);
    sc.close();
    
	}
}