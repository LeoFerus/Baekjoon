import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args)  throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i<t; i++) {
			long x = Long.parseLong(br.readLine());
			
			boolean[]arr = new boolean[10];
			
			while(x != 0) {
				arr[(int)(x%10L)] = true;
				x /= 10;
			}
			int cnt = 0 ;
			for(int j = 0; j<10; j++) {
				if(arr[j]) cnt++;
			}
			bw.write(cnt + "\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}
}