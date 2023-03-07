import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args)throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String a = st.nextToken().replace('6','5');
		String b = st.nextToken().replace('6','5');
		
		System.out.print(Integer.parseInt(a)+Integer.parseInt(b)+" ");
		
		a = a.replace('5','6');
		
		b = b.replace('5','6');
		
		System.out.print(Integer.parseInt(a)+Integer.parseInt(b));
		

	}
}