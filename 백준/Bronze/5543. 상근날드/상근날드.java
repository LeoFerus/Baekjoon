import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] buger = new int[3];
		
		for(int i = 0; i<3; i++) {
			buger[i] = sc.nextInt();
		}
		
		Arrays.sort(buger);
		
		
		int [] soda = new int [2];
		
		for(int i = 0; i<2; i++) {
			soda[i] = sc.nextInt();
		}
		Arrays.sort(soda);
		
		System.out.println(buger[0]+soda[0]-50);
		
		sc.close();
		
	}

}