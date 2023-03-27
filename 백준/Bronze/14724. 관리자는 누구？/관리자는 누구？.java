import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int count = 0;
		
		int max = 0;
		
		String administer ="";
		
		int[] array = new int[n];
		
		for(int i = 0 ;i<9;i++) {
			for(int j = 0 ; j<n;j++) {
				array[j] = sc.nextInt();
				if(max<array[j]) {
					max = array[j];
					count = i+1;
				}
			}
		}
		
		switch(count) {
		
		case 1: System.out.println("PROBRAIN");;
		break;
		
		case 2: System.out.println("GROW");;
		break;
		
		case 3: System.out.println("ARGOS");;
		break;
			
		case 4: System.out.println("ADMIN");;
		break;
		
		case 5: System.out.println("ANT");;
		break;
		
		case 6: System.out.println("MOTION");;
		break;
		
		case 7: System.out.println("SPG");;
		break;
		
		case 8: System.out.println("COMON");;
		break;
		
		case 9: System.out.println("ALMIGHTY");;
		break;
		}	

		
		
	}
}
