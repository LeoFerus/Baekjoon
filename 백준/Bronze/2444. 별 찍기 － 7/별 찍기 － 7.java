import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int j = 1;
        
        for(int i = n-1; i>0; i--) {
        
        	System.out.println(" ".repeat(i)+"*".repeat(j));
        	j = j+2;
        }
        System.out.println("*".repeat(n*2-1));
        
        j = 1;
        
        for(int i = n-1; i>0; i--) {
            
        	System.out.println(" ".repeat(j)+"*".repeat(i*2-1));
        	j = j+1;
        }
        sc.close();
    }
}