import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
    	Scanner sc = new Scanner(System.in);
    	
    	
    int t = sc.nextInt();
    
    int []arr= new int [10];
    
    for(int i = 0 ; i<t ;i++) {
    	int cntM = 0;
    	
    	int cntZ = 0;
    	for(int j = 0; j<10;j++) {
    	arr[j] = sc.nextInt();
    	System.out.print(arr[j]+" ");
    	if(arr[j]==18) {
    		cntM++;
    	}
    	
    	if(arr[j]==17) {
    		cntZ++;
    	}
    	}
    	System.out.println();
    	if(cntM>0&&cntZ>0) {
    		System.out.println("both");
    	}
    	else if(cntM>0) {
    		System.out.println("mack");
    	}
    	else if(cntZ>0) {
    		System.out.println("zack");
    	}
    	else {
    		System.out.println("none");
    	}
    	System.out.println();
    }
     
    
    }
}