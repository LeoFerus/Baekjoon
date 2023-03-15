import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	
    	int[] arr= new int [36];
    	
    	for(int i = 0; i<n;i++) {
    		arr[sc.nextInt()]++;
    	}
    	
    	int sum = 0;
    	
    	for(int i = 3; i<=35; i++) {
    		if(arr[i-1]==0&&arr[i]!=0) {
    			sum+=i;
    		}
    	}
    	System.out.println(sum);
    
    }
}