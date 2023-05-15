import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		
	    Scanner sc = new Scanner(System.in);   
		
		
		
		int n = sc.nextInt(); //물건 개수
		
		int k = sc.nextInt(); // 배낭 허용 무게
		
		int[][] c = new int[n+1][2]; // 물건의 무게와 가치
		
		
		int[][] table = new int[n+1][k+1]; // 가격을 저장할 dp 
		
		for(int i = 1; i<n+1; i++) {
			
			c[i][0] = sc.nextInt();  //각 물건의 무게
			
			c[i][1] = sc.nextInt(); // 각 물건의 가치 
		}
		
		sc.close();
		
		for(int i = 1; i<n+1;i++) {
			for(int j = 1; j<k+1;j++) {
				
				if(j - c[i][0] >=0) {
					
					table[i][j] = Math.max(table[i-1][j],c[i][1]+ table[i-1][j-c[i][0]]);
				// 물건의 무게가 0 보다 크면 이전 dp 에 저장된 
				// 가치와 자신의 가치 + 남은 무게 의 가치 중에 큰값을 저장한다.
				}
				else {
					table[i][j] = table[i-1][j];
					//그렇지 않으면 이전dp 에 누적된 가치를 저장한다.
				}
			}
		}
		System.out.println(table[n][k]);

	}
	
}