import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0 ; i<n; i++) {
			
			String str = sc.next();
			
			String[] s= str.split("");
			
			String result = "";
			
			result+= str.charAt(0);
			for(int j = 1 ; j < str.length();j++) {
				if( !s[j].equals(s[j-1]) ) {
					result += str.charAt(j);
				}
			}
			
			System.out.println(result);
		}
		
			
	}
}
