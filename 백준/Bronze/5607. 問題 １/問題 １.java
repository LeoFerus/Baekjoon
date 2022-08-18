import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
        
        int a = 0;
        int b = 0;
     
        for(int i = 0; i<n;i++ ) {
        	int a1 = sc.nextInt();
        	int b1 = sc.nextInt();
        	
        if(a1>b1) {
        	a = a+a1+b1;
        }
        else if (a1==b1) {
        	
           	a = a + a1;
        	b = b+ b1;
        }
        else {
        	b = b+a1+b1;
        }
        
        }
        System.out.println(a+" "+b);
        sc.close();
    }
}