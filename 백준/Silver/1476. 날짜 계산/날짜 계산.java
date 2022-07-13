import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int e = sc.nextInt();

		int s = sc.nextInt();

		int m = sc.nextInt();



		int e1 = 0;

		int s1 = 0;

		int m1 = 0;

		for(int count =0;; count++) { //for문으로도 무한 루프를 돌릴 수 있다.

			if(e==e1 && s==s1 && m1==m) {// 조건이 되면 break해서 나온다. 
				System.out.println(count);
				sc.close();
				break;
			}
			
				e1 = (e1+1);

				if(e1==16) {
					e1 = 1;
				}

				s1 = s1+1;
				if(s1==29) {
					s1 = 1;
				}

				m1 = m1+1;
				if(m1==20) {
					m1 = 1;
				
			}

		}

	}
}