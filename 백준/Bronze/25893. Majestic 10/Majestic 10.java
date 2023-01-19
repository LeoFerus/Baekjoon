import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int t = sc.nextInt();
		
		int[] arr = new int[3];
		
	
		
		for(int i = 0; i<t; i++) {
			
			arr[0] = sc.nextInt();
			arr[1] = sc.nextInt();
			arr[2] = sc.nextInt();
			int cnt = 0;
			for(int j = 0; j<3;j++) {
				if(arr[j]>=10) {
					cnt++;
				}
			}
			
			if(cnt ==0) {
				System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
				System.out.println("zilch");
				System.out.println();
			}
			else if( cnt ==1) {
				System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
				System.out.println("double");
				System.out.println();
			}
			
			else if( cnt ==2) {
				System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
				System.out.println("double-double");
				System.out.println();
			}
			else {
				System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
				System.out.println("triple-double");
				System.out.println();
			}
			
			cnt = 0;
			
		}
		
		sc.close();
		
		
	}
}