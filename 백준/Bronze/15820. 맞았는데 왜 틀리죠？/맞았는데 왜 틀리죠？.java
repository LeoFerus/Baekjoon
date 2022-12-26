import java.io.*;
import java.util.*;
import java.lang.*;


public class Main {
	public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    
    int S1 = sc.nextInt();
    
    int S2 = sc.nextInt();
    
    int s1cnt = 0;
    
    int s2cnt = 0;
    
    int[][] arr1 = new int[S1][2];
    
    int[][] arr2 = new int[S2][2];
    
    for(int i = 0;i<S1;i++) {
    	arr1[i][0] = sc.nextInt();
    	arr1[i][1] = sc.nextInt();
    	if(arr1[i][0]!=arr1[i][1]) {
    		s1cnt++;
    	}
    }
    for(int i = 0;i<S2;i++) {
    	arr2[i][0] = sc.nextInt();
    	arr2[i][1] = sc.nextInt();
    	if(arr2[i][0]!=arr2[i][1]) {
    		s2cnt++;
    	}
    }
    
    if(s1cnt==0&&s2cnt==0) {
    	System.out.println("Accepted");
    }
    else if(s1cnt==0&&s2cnt!=0) {
    	System.out.println("Why Wrong!!!");
    }
    else {
    	System.out.println("Wrong Answer");
    }
    
    		

    
	}
}