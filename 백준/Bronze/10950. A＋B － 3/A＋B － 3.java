import java.util.*; 

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		
		int array[] = new int[i];
		
		for(int j =0; j<i;j++) {
		
		int a = scan.nextInt(); 
		
		int b = scan.nextInt();
		
		array[j] = a+b;
		}

		for(int k: array) {
			System.out.println(k);
		}



		scan.close();
	}

}
