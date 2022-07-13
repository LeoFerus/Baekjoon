import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		int []array = new int [t];
		
		for(int i = 0; i<t; i++) {
			array[i]=sc.nextInt() +sc.nextInt();
			System.out.println("Case "+(i+1)+": "+array[i]);
		}
		
		

		sc.close();
	}
 
}