import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] apple = new int[2];
		int[] orange = new int[2];
		int sum1;
		int sum2;
		int max;
		for(int i=0; i<apple.length; i++) {
			apple[i] = scan.nextInt();
			orange[i] = scan.nextInt();
		}
		sum1 = apple[0] + orange[1];
		sum2 = apple[1] + orange[0];
		
		max = (sum1 > sum2) ? sum2 : sum1;
		System.out.println(max);
		
		scan.close();

	}

}