import java.util.*;
public class Main{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0 ; i < n; i++) {
			int L = sc.nextInt();
			String a = sc.next();
			String stu = sc.next();
			
			int cnt = 0;
			
			String[] answer = a.split("");
			
			String[] student = stu.split("");
			
			for(int j = 0 ; j < answer.length;j++) {
				if(!answer[j].equals(student[j])) {
					cnt++;
				}
			}
			
			System.out.println("Case "+(i+1)+": "+cnt);
		}
		
		
	}
}