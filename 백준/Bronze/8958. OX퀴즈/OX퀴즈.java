import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt(); //테스트 케이스
		
		int []array = new int[t]; //테스트 케이스의 합을 저장할 배열 생성
		
		
		for(int i = 0; i<t; i++) {
			int count = 0;      
			int sum = 0;
			
			String str = sc.next();
			for(int j = 0 ; j<str.length(); j++) {
				if(str.charAt(j)=='O') { // O가 연속으로 나오면 카운트 중첩. sum에는 총합을 계속 저장
					count++;
					sum = count+sum;
					
				}
				else {
					count = 0; // X가 나오면 카운트 초기화 
				}
			
				
			}
			array[i] = sum;
			
		}
		
		for(int i = 0; i<t; i++) {
			System.out.println(array[i]); // 배열에 저장한 값을 출력
		}
				
		sc.close();
	}

}
