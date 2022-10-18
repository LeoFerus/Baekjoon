import java.util.*;
import java.io.*; 

public class Main {
	public static void main(String[] args)throws IOException   {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		char[] arr;
		
		arr = str.toCharArray();
		
		for (int i = 0; i < arr.length; ++i) {
			if (65 <= arr[i] && arr[i] <= 90) {
				arr[i] = (char) (arr[i] + 32);
				continue;
			}
			if (97 <= arr[i] && arr[i] <= 122) {
				arr[i] = (char) (arr[i] - 32);
				continue;
			}
		}

		System.out.print(arr);
		
		
		sc.close();
		

		
	}

}	