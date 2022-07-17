import java.util.Scanner;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		
		for(int i = 0; i < testCase; i++) {
			
			int d = sc.nextInt();
			
			int j =1;
			
			while(j+Math.pow(j,2)<=d) {
				j++;
			}
				System.out.println(j-1);
		}
		
		
		

		sc.close();
	}
}