import java.util.*;
public class Main{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0 ; i < t; i++) {
			
		String str = sc.next();
		
		String[] arr = str.split("");
		
		int start = sc.nextInt();
		
		int end = sc.nextInt();
		
	    for(int j = 0; j<arr.length; j++) {
	    	if(j<start||j>=end) {
	    	System.out.print(arr[j]);
	    	}
	    	
	    }
	    System.out.println("");
		}
		sc.close();
	
		
		
		
	}
}