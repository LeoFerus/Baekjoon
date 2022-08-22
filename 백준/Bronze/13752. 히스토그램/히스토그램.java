import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   
        int t = sc.nextInt();
        
        for(int i = 0; i<t; i++) {
        	int k = sc.nextInt();
        	System.out.println("=".repeat(k));
        }
        
   

        sc.close();
    }
}