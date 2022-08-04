import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); //25377번 빵
        
        int[] arr = new int[n];
        
        int a = 0;
        
        int b = 0;
        
        int count = 0;
        for(int i = 0; i<n; i++) {
        	a = sc.nextInt();
        	b = sc.nextInt();
        	if(b-a>=0)
        	arr[i] = b;
        	else {
        		arr[i] = 1001; //A와 B가 최대 1000까지 이므로 순서에 영향을 주지 않는다. 
        		count++;	//기준미달일 경우 카운트를 해서 모두 기준 미달이면 -1을 출력할수 있도록 한다.
        	}
        }
        
        Arrays.sort(arr);
     
        if(count == n) {
        	System.out.println(-1);
        }
        else {
        System.out.println(arr[0]);
        }
        sc.close();
    }
}