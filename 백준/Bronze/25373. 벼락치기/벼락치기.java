import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		long answer = -1;
		
		if(n>21) {
			answer = (n+21) / 7;
			if((n+21)%7!=0) //정수 타입이므로 딱떨어지지 않으면 올림(ceil) 계산
				answer +=1;
		}
		else if (n>15) answer = 6;
		else if (n>10) answer = 5;
		else if (n>6) answer = 4;
		else if (n>3) answer = 3;
		else if (n>1) answer = 2;
		else answer = 1;
		System.out.println(answer);
		
		sc.close();
	}
}