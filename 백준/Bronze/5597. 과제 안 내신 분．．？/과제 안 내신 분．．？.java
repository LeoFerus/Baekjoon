import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int [] array = new int [31];
		
		for(int i =1; i<29; i++) {
			int n = sc.nextInt();
			
			array[n] = 1;
		}
		for(int i =1 ; i <array.length;i++) {
			if(array[i]!=1) {
				System.out.println(i);
			}
		}

		
		
		
	}
}
