import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int [n];
        
        int nC = 0;
        
        int c = 0;
        
        for(int i = 0; i<n; i++) {
        	arr[i] = sc.nextInt();
        	if(arr[i]==1) {
        		c++;
        	}
        	else {
        		nC++;
        	}
        	
        }
        
        if(nC>c) {
        	System.out.println("Junhee is not cute!");
        }
        else {
        	System.out.println("Junhee is cute!");
        }
        sc.close();
    }
}