import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int x = scan.nextInt();

		int []array = new int[n];
		
		for(int i =0; i<n; i++) {
		
		array[i]=scan.nextInt();

		}
		
		for(int j=0; j<n; j++) {
			if(array[j]<x) {
				System.out.print(array[j]+ " ");
			}
			
		}


		scan.close();

	}

}