import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a =sc.nextInt();
        
        int b = sc.nextInt();
        
        int c = sc.nextInt();
        
        int d = sc.nextInt();
        
        int p = sc.nextInt();
        
        a = p*a;
        
        if(p>c)
        {
        c = b+(p-c)*d;
        }
        else {
        c = b;
        }
        if(a>c) {
        	System.out.println(c);
        }
        else {
        	System.out.println(a);
        }
       
        		
        sc.close();
    }
}