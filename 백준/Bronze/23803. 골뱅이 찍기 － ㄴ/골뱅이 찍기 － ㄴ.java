	import java.util.*;
	
	public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	
	        int n = sc.nextInt();
	        
	        for(int i  = 0; i<n; i++) {
	        System.out.println("@".repeat(n));
	        System.out.println("@".repeat(n));
	        System.out.println("@".repeat(n));
	        System.out.println("@".repeat(n));
	        }
	        
	        for(int i = 0; i<n; i++) {
	        	System.out.println("@@@@@".repeat(n));
	        }
	        
	    }
	    	
	}