import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		
		
	    Scanner sc = new Scanner(System.in);   
		
	    
	 	while(true) {
	 		int a = sc.nextInt();
	 		if(a==0) {
	 			break;
	 		}
	 		
	 		while(a>0) {
	 			int result = 0;
	 			for(int i =1 ; i<=a; i++) {
	 			   result = result + i;
	 			}
	 			System.out.println(result);
	 			break;
	 		}
	 	
	 	}
	    
	 	
	    
	}
	
}