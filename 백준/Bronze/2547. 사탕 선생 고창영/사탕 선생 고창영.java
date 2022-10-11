import java.math.BigInteger;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0; i<t; i++) {
			
			int n = sc.nextInt();
			
			BigInteger total =new BigInteger("0");
			
			for(int j = 0; j<n; j++) {
				BigInteger candy = sc.nextBigInteger();
				total = total.add(candy);
			}
			String r = (total.remainder(BigInteger.valueOf(n)).compareTo(BigInteger.ZERO)==0) ? "YES" : "NO";
			System.out.println(r);
		}
		
		sc.close();
	}

}	