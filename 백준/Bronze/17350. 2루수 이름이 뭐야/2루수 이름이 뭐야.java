import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int n = sc.nextInt();
		
		boolean answer = false;
		
		for(int i =0; i<n; i++) {
			if(sc.next().equals("anj")) {
				answer = true;
			}
		}
		
		if(answer==true) {
			System.out.println("뭐야;");
		}
		else {
			System.out.println("뭐야?");
		}
		
		sc.close();
	}
 
}