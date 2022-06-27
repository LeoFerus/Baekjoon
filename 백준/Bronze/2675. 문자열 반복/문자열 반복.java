import java.util.*; 

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int T= scan.nextInt();
		
		for(int x =0; x<T; x++) {
			
			int R = scan.nextInt();

		String str=scan.next();
		

		for(int i = 0; i<str.length(); i++) {
			for(int j = 0; j<R; j++) {
				System.out.print(str.charAt(i));
			}
		}
		System.out.println();
		
		}	
		scan.close();
	}

}
