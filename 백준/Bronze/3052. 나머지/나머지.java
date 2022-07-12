import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		HashSet<Integer> set1 = new HashSet<Integer>(); //해쉬 셋에는 중복이 되지 않으므로 해쉬셋을 이용해서 간단히 답을 구할수 있다. 
		
		for(int i = 0; i<10; i++) {
			set1.add(sc.nextInt()%42);
		}
		
		System.out.println(set1.size()); 
		
		/*boolean [] array = new boolean [42];
		
		for(int i = 0; i<10; i++) {
			array[sc.nextInt()%42]=true;
			
		} 
		
		int count =0;
		
		for(boolean value: array) {
			if(value) {
				count++;
			}
		}
		
		System.out.println(count); */
		sc.close();
	}
 
}
