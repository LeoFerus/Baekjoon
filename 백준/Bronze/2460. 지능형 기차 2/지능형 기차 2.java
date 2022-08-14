import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = 0;
        
        int b = 0;
        
        int t = 0;
        
        int max = 0;
        
        for(int i = 0; i<10; i++) {
        	a=sc.nextInt();
        	b= sc.nextInt();
        	t = t-a+b;
        	if(t>=max) {
        		max = t;
        	}
        }
        System.out.println(max);
        sc.close();
    }
}