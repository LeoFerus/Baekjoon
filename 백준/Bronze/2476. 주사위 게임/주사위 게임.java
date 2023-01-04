
import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] array = new int[n];
		
		int f,s,th = 0; // 첫번째 두번째 세번째 주사위 눈을 나타내는 변수 
		
		
		for(int i = 0; i<n; i++) {
			f = sc.nextInt();
			s = sc.nextInt();
			th = sc.nextInt();
			
			if(f==s&&f==th&&s==th) {
				array[i] = 10000+f*1000;
			}
			else if(f==s) {
				array[i] = 1000+f*100;
			}
			else if(s==th) {
				array[i] = 1000+s*100;
			}
			else if(f==th) {
				array[i] = 1000+th*100;
			}
			else {

				array[i] = Math.max(f, Math.max(s, th))*100;
			}
			
		}
		Arrays.sort(array);
		System.out.println(array[array.length-1]);
		sc.close();
	}

}	