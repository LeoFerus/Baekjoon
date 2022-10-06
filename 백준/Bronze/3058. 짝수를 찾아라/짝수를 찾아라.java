import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        int total = 0;
        
        int min = 0;
        
        for(int i = 1; i<=t; i++) {
        	
        	for(int j = 1; j<=7; j++) {
        		int a = sc.nextInt();
        		
        		if (a%2==0) {
        			total= total+a;
        		if(min ==0 || min>a)
        			min = a;
        		}
        		
        	}
        	System.out.println(total+" "+min);
        	min = 0;
        	total=0;
        	
        }
        sc.close();
    }
}