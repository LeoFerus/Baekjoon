import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[]arr = new int[101];
        
        for(int i = 1; i<=100; i++) {
        	arr[i] = i;
        }
        
        
        int count = 0;
        
        for(int i = 1; i<=n; i++) {
        	
        int customer = sc.nextInt();
        
        if(arr[customer]!=0) {
        
         arr[customer] = 0;
        }
        else {
        	count++;
        }
        }
        System.out.println(count);
        sc.close();
    }
}