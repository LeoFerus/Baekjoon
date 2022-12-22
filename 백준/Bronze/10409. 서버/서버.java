import java.io.*;
import java.util.*;
import java.lang.*;


public class Main {
	public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    int t = sc.nextInt();
    
    int cnt = 0;
    
    int total = 0;
    

    
    for(int i = 0; i<n;i++) {
    	total = sc.nextInt()+ total;
    	if(total<=t) {
    		cnt++;
    	}
    	else {
    		break;
    	}
    }
    System.out.println(cnt);
    

    
	}
}
