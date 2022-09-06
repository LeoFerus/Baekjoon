import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int tastCase = sc.nextInt();
        
        int q = 25;
        
        int d = 10;
        
        int n = 5;
        
        int p = 1;
        
        for(int i = 0; i<tastCase; i++) {
        
       int t= sc.nextInt();
        	
        q=t/25;
        
        d = (t%25)/10;
        
        n = ((t%25)%10)/5;
        
        p = (((t%25)%10)%5)/1;
        
        System.out.println(q+" "+d+" "+n+" "+ p);
        }
        
        sc.close();
    }
}