import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter; 
public class Main {

	public static void main(String[] args) throws IOException{

		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int q = Integer.parseInt(bf.readLine());
		
		int x = 0;
		
		for(int i = 0; i<q; i++) {
			x = Integer.parseInt(bf.readLine());
			
				if((x&(-x))==x) {
				 x = 1;
				}
			
				else{
				 x = 0;
				}
				bw.write(x+"\n");;
		}
		
		bw.close(); 
	}
 
}
