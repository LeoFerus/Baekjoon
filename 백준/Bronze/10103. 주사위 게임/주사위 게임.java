import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int a = 100;
        
        int b = 100;
        
        for(int i = 0; i<n; i++) {
        	int a1 = sc.nextInt();
        	
        	int b1 = sc.nextInt();
        	
        	if(a1>b1) {
        		b = b-a1;
        	}
        	if (a1<b1) {
        		a = a-b1;
        	}
        }
        
        System.out.println(a);
        System.out.println(b);
        
        sc.close();
    }
}