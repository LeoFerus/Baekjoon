import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		int x = 0;
			
		while(true) {
			x = sc.nextInt();
			if(x<0) {
				break;
			}
			sum = sum +x;
	
		}
		
		System.out.println(sum);
		sc.close();
	}
 
}
