import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		
		int count = 250;
		
		
	
		
		while(true) {
		
			
			if(s<a||s==a) {
				sc.close();
				System.out.println(count);
				break;
			}
			
			a = a+b;
					
			count = count+100;
		}
		
		
	}

}