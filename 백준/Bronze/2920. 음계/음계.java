import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int [] array = new int[8];
		
		for(int i =0; i<8; i++) {
			array[i] = sc.nextInt();
		}
		
		int [] ascending = new int []{1,2,3,4,5,6,7,8};
		
		int [] descending = new int [] {8,7,6,5,4,3,2,1};
		
		int a =0;
		int d =0;
		
		for(int i =0; i<8;i++) {
			if(array[i]==ascending[i]) {
				a++;
			}
			else if(array[i]==descending[i]) {
			     d++;
			
			}

		}
		
		if(a == 8) {
			System.out.println("ascending");
		}
		else if(d == 8) {
			System.out.println("descending");
		}
		else {
			System.out.println("mixed");
		}
				
		
		
		sc.close();
	}

}
