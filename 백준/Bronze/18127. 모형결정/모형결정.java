import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int a = sc.nextInt();
        
        long b = sc.nextInt();
        
		long answer = 0;
		long num = 1;
		while(b --> -1) {
			answer += num;
			num+=(a-2);
		}
		System.out.print(answer);
        	
        	
        
        		
        sc.close();
    }
}