import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    for(int i =0; i<n;i++) {
    	String[] arr = sc.next().split("");
    	if(Integer.parseInt(arr[arr.length-1])%2==0){
    		System.out.println("even");
    	}
    	else {
    		System.out.println("odd");
    	}
    }
    sc.close();
    
	}
}