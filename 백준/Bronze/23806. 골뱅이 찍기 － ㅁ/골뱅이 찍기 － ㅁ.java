import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for(int i = 0; i<n;i++) {
        	System.out.println("@@@@@".repeat(n));
        }
        
        for(int i = 0; i<3*n;i++) {
        	System.out.println("@".repeat(n)+"   ".repeat(n)+"@".repeat(n));
        }
        
        for(int i = 0; i<n;i++) {
        	System.out.println("@@@@@".repeat(n));
        }
        
        sc.close();
    }
}