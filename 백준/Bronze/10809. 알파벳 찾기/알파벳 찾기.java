import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String wrd = sc.next();
		
		for(char x = 'a'; x<='z'; x++) {
			System.out.print(wrd.indexOf(x)+" "); /*.indexOf( "찾을 특정 문자" , "시작할 위치" )
			 										시작 할 위치는 생략이 가능하고 생략할 경우 0번째, 즉 처음부터 찾기 시작한다.
			 										찾지 못하면 -1을 반환한다. */
		}
	
	}
 
}