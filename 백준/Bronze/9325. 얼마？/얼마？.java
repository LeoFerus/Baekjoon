import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int t = sc.nextInt();
        
        for(int i = 0; i<t; i++) {
        	int s = sc.nextInt();
        	
        	int n = sc.nextInt();
        	

        	if(n>0) {
        	for(int j = 0; j<n;j++) {
        		int q = sc.nextInt();
        		int p = sc.nextInt();
        		s = p*q+s;
        	}
        	}
        	System.out.println(s);
        	}
        sc.close();
    }
}