import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        System.out.println("@".repeat(n+2));
        for(int i = 0; i< n; i++) {
        	System.out.println("@"+" ".repeat(n)+"@");
        }

        System.out.println("@".repeat(n+2));
        
        sc.close();
    }
}