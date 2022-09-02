import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int c = sc.nextInt();
        
        int k = sc.nextInt();
        
        int p = sc.nextInt();
        
        int t = 0;
        
        for(int i = 1; i<=c;i++) {
        	t = k*i+i*i*p+t;
        }
        
        System.out.println(t);
        sc.close();
    }
}