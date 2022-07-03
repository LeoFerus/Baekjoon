import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int hts = sc.nextInt(); //집에서 학교까지의 이동시간을 나타내는 변수
		
		int stp = sc.nextInt(); //학교에서 pc방까지 이동시간을 나타내는 변수
		
		int pta = sc.nextInt(); // pc방에서 학원까지 이동시간을 나타내는 변수

		int ath = sc.nextInt(); // 학원에서 집까지 이동시간을 나타내는 변수
		
		int t = hts+stp+pta+ath;
		
		int x = t/60;
		
		int y = t%60;
		
		System.out.println(x);
		System.out.println(y);
		
		sc.close();
	}

}