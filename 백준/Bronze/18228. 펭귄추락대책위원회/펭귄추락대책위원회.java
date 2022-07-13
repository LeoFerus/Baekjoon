import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] array = new int [n];
		
		int pivot = 0; //펭귄이 있는 위치를 나타내는 변수 pivot 
		
		for(int i = 0; i<n; i++) {
			array[i] = sc.nextInt();
			if(array[i]<0) {
				pivot = i;	//인덱스 안의 값이 -1이면 펭귄이 있는 위치 이므로 pivot에 저장
			}
		}
		

			
		
		Arrays.sort(array,0,pivot); // pivot값을 기준으로 앞쪽과 뒤쪽을 나눠서 오름차순 정렬 이후에 값을 찾아낸다.
		
		Arrays.sort(array,pivot,array.length);
		
		System.out.println(array[0]+array[pivot+1]);
				

		
		
		sc.close();
	}
}