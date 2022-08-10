import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int t = 0;
        
        for(int i = 0; i<n; i++) {
        int s =sc.nextInt();
        
        int a = sc.nextInt();
        
        int min = a;
        
        if(s>a) {
        	t = t+a;
        }
        else {
        for(int j = 0; j<=a; j++) {
        	if(s*j<=a) {
        		min = a-(s*j);
        	}
        }
        t = t+min;	
        }
        }
       
        System.out.println(t);
        
        
        sc.close();
    }
}