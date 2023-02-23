import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int k = sc.nextInt();
		
		int max = 0;
		
		for(int i = 1 ; i<=k; i++) {
			int tem = n*i;
			String s = String.valueOf(tem);
			StringBuilder sb = new StringBuilder();
			for(int j = s.length()-1;j>=0;j--) {
				sb.append(s.charAt(j));
			}
			max = Math.max(max,Integer.parseInt(sb.toString()));
		}
		System.out.println(max);
	}
}