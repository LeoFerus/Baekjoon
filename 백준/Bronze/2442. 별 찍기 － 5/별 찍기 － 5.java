import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int j = 1;
        for(int i = n; i>0;i--) {
        	System.out.println(" ".repeat(i-1)+"*".repeat(j));
        	j=j+2;
        }
        
        sc.close();
    }
}