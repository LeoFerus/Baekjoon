import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer []array = new Integer [3]; // 주사위를 세번 던져서 나온 눈을 저장할 배열 
		
		for(int i =0; i<3; i++) {
			array[i] = sc.nextInt(); // 주사위 눈을 저장 
		}
		
		int count = 0; //같은 수가 나올때 마다 올라가는 카운트 
		
		int eq =0; // 깉은수가 나왔을 경우 같은눈의 변수를 저장
		
		if(array[0]==array[1]) {
			count++; 
			eq = array[0];
		}
		if(array[1]==array[2]) {
			count++; 
			eq = array[1];
		}
		if(array[0]==array[2])
		{
			count++; 
			eq = array[0];
		}
		
		
		
		if(count>=2) {
			System.out.println(10000+array[0]*1000);
		}
		
		else if (count ==1) {
			
			System.out.println(1000+eq*100);
			
		}
		
		else {
			Arrays.sort(array,Collections.reverseOrder());
			System.out.println(array[0]*100);
		}
		
	
	}
 
}
