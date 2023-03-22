import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int h1 = sc.nextInt();
		
		int b1 = sc.nextInt();
		
		int h2 = sc.nextInt();
		
		int b2 = sc.nextInt();
		
		int score1 = 3*h1+b1;
		
		int score2 = 3*h2+b2;
		
		String answer = "NO SCORE";
		
		if(score1 > score2) {
			answer = "1 "+ (score1 - score2);
		}
		else if( score2 > score1) {
			answer = "2 "+ (score2 - score1);
		}
		
		System.out.println(answer);
	}

}
