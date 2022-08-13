import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int t = sc.nextInt();
        
        int[] arr = new int[t] ;
        
        for(int i = 0; i<t; i++) {
        	
        	int n = sc.nextInt();
        	
        	int digit = 0;
        	
        	int total = 0;
        	
        	for(int j =0; j<n; j++) {
        		digit = sc.nextInt();
        		total = digit+total;
        	}
        	arr[i] = total;
        }
        	
        for(int i = 0; i<t; i++) {
        	System.out.println(arr[i]);
        }
        		
        sc.close();
    }
}