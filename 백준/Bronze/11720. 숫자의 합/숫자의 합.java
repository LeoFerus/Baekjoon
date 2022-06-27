import java.util.*; 

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int sum=0;

		
		String[] array = scan.next().split("");
		
		for(int i = 0; i<N; i++) {
			
			sum = Integer.parseInt(array[i]) + sum;
		}
		System.out.println(sum);
		
		scan.close();
	}

}
