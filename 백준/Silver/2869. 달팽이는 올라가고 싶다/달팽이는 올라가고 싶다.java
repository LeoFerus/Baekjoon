import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

   public static void main(String[] args) throws IOException {
      
	   BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	   
	   
	   String s = bf.readLine();
	   
	   StringTokenizer st = new StringTokenizer(s);
	   
	   int a = Integer.parseInt(st.nextToken());
	   
	   int b = Integer.parseInt(st.nextToken());
	   
	   int v = Integer.parseInt(st.nextToken());
	   
	   int count = (v-b)/(a-b);
	   
	   if((v-b)%(a-b)!=0) {
		   count++;
	   }
	   System.out.println(count);
   }
 
}