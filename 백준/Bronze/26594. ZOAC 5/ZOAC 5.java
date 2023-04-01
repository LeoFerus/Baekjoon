import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		
		int sum = 1;
		
		for(int i = 0; i<str.length()-1;i++) {
			
		 if(str.charAt(i)==str.charAt(i+1) ) {
			 
			 sum +=1;
		 }
		 else {
			 break;
		 }
		}
		System.out.println(sum);
	}
}
