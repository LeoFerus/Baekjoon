import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   
        int t = sc.nextInt();
        
        for(int i = 0; i<t; i++) {
        	

        	int v = sc.nextInt();
        	
        	int e = sc.nextInt();
        	
        	int r = e-v+2;
        	
        			System.out.println(r);
        }
        
   

        sc.close();
    }
}