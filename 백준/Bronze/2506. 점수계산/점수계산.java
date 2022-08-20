import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
        
        int total = 0;
        
        int count = 0;
        
        for(int i = 0; i<n; i++) {
        int q = sc.nextInt();
        
        if(q==1) {
        	count = q+count;
        	total = total+count;
        }
        else {
        	count = 0;
        }
        }
        System.out.println(total);
        sc.close();
    }
}