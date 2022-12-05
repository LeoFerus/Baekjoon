import java.io.*;
import java.util.*;
import java.lang.*;


public class Main {
	public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    
    int t = sc.nextInt();
    
    int[] arr= new int[3];
    
    int[] mirr = new int[3];
    
    for(int i =0; i<t; i++) {
    	arr[0] = arr[0] + sc.nextInt();
    	arr[1] = arr[1] + sc.nextInt();
    	arr[2] = arr[2] + sc.nextInt();
    	
    	mirr[0] = arr[0];
    	mirr[1] = arr[1];
    	mirr[2] = arr[2];
    	if(arr[0]<30||arr[1]<30||arr[2]<30) {
    		System.out.println("NO");
    	}
    	else {
    		Arrays.sort(mirr);
    		System.out.println(mirr[0]);
    		arr[0] = arr[0]-mirr[0];
    		arr[1] = arr[1]-mirr[0];
    		arr[2] = arr[2]-mirr[0];
    	}
    }
	}
}