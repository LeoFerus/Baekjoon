import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   
        int n = sc.nextInt();
        
        int p = 1;
        
        for(int i = 0; i<n; i++) {
        	int multitap = sc.nextInt();
        	
        	p = p-1+multitap;
        }
   
        System.out.println(p);
        sc.close();
    }
}