
import java.util.*;
import java.io.*; 

public class Main {
	public static void main(String[] args) throws IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		char[] array = new char[n];
		
		Arrays.fill(array,'s');
		
		bw.write(array);
		bw.flush();
		bw.close(); 
	}

}