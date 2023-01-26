import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int sum =0;
		
		for(int i =1; i<=num; i++) {
			if((num%i)==0) {
				sum = i+sum;
			}
		}
		System.out.println((sum*5)-24);
		
		sc.close();
		
		
	}
}