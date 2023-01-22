import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[5];
		
		for(int i = 0; i<5; i++) {
			arr[i] = sc.next();
		}
		
		if(Integer.parseInt(arr[0])+Integer.parseInt(arr[2])==Integer.parseInt(arr[4])){
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		sc.close();
		
		
	}
}