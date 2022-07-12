import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double []array = new double [n]; //예제 출력이 실수 이므로 double로 설정 
		
		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		
		Arrays.sort(array);		
		
		double max = array[n-1]; //최대값을 나타내는 변수 max 
		
		double sum = 0;			//평균을 내기위한 전체 점수의 합을 나타내는 변수 sum
		
		for(int i = 0; i < n; i++) {
			
			sum = sum+(array[i]/max*100); // 점수를 새로운 점수로 바꾸고 sum에 저장
	
		}
		
		System.out.println(sum/n); //평균 출력 
		
		sc.close();
	}
 
}
