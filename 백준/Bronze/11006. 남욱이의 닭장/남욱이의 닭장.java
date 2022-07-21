import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		int[][] chicken = new int[t][2];
		
		for(int i =0; i<t; i++) {
			chicken[i][0] = sc.nextInt();
			chicken[i][1] = sc.nextInt();
		}
		
		for(int i = 0; i<t; i++) {
			System.out.println(chicken[i][1]*2-chicken[i][0]+" "+(chicken[i][1]-((chicken[i][1]*2)-chicken[i][0])));
		}
		
		sc.close();
	}
}