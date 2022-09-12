import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n  = sc.nextInt();
        
        int min = 10000;
        
        for(int i =0; i<n; i++) {
        	int needed = sc.nextInt();
        	
        	int haveOne = sc.nextInt();
        	
        	int available = haveOne/needed;
        	
        	if(available<min) {
        		min = available;
        	}
        }
        System.out.println(min);
        

        sc.close();
    }
}