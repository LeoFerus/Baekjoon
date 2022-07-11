import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		
		int c = sc.nextInt();
		
		long sum = a*b*c;
	
		
		String str = String.valueOf(sum);
		
		String [] s = str.split("");
		
		int [] s2 = new int[s.length];

		
		
		int count = 0;
		
		
		for(int j = 0; j<10; j++) {
			for(int i = 0; i<s.length; i++) {
				s2[i]=Integer.parseInt(s[i]);
				if(s2[i]==j) {
					count++;
				}
			}
			System.out.println(count);
			count = 0;
		}

		
		sc.close();
	}
 
}
