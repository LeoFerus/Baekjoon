import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		String[] arr= str.split("");
		
		int cntB = 0;
		int cntC = 0;
		
		for(int i = 0 ; i<arr.length; i++) {
			if(arr[i].equals("B")) {
				cntB++;
			}
			else {
				cntC++;
			}
		}
	    System.out.println(cntB/2+cntC/2);
	}
}