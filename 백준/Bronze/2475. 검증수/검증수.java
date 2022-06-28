import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n;
		int result =0;
		for(int i = 0; i<5;i++) {
			n = scan.nextInt();
			result = (n*n)+result;
		}
		result = result%10;
		System.out.println(result);
		
		scan.close();

	}

}