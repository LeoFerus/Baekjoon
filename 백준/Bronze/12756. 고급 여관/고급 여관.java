import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		
		int adamage= sc.nextInt();
		
		int alife= sc.nextInt();
		
		int bdamage = sc.nextInt();
		
		int blife = sc.nextInt();
		
		while(true) {
			
			alife = alife - bdamage;
			blife = blife - adamage;
			
			if(alife <= 0 && blife <=0) {
				System.out.println("DRAW");
				break;
			}
			
			if (alife <= 0) {
				System.out.println("PLAYER B");
				break;
			}
			
			else if (blife <= 0) {
				System.out.println("PLAYER A");
				break;
			}
		}
		
		sc.close();
	}
 
}