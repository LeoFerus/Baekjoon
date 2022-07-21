import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String[] n = sc.next().split(":"); // split으로 구분해서 문자형 배열로 저장 		
		String[] s = sc.next().split(":");
		
		int[] now = new int[3];
		
		int[] salt = new int[3];
		
		for(int i =0; i<3; i++) {
		now[i] =Integer.parseInt(n[i]); //계산하기위해 문자형 배열을 정수형 배열로 변환 
		salt[i] = Integer.parseInt(s[i]);
		}
		
		int nTotal = now[0]*3600+now[1]*60+now[2]; //전부 초로 환산 
		
		int sTotal = salt[0]*3600+salt[1]*60+salt[2];
		
		int total = sTotal -nTotal; //전부 초로 환산한 것으로 필요시간을 구한다.
		
		if(total<=0) {				//0보다 작은 경우 하루치 (86400초)를 더해준다.
			total = total +86400;
		}
		if(total>86400) {		    // 24시간을 넘어간경우 하루치를 빼준다. 
			total = total - 86400;
		}
		
		
		salt[0] = total/3600;
		salt[1] = (total%3600)/60;
		salt[2] = total%60;
		
	
		
		for(int i = 0; i<3; i++) {	// 출력시 10보다 작은경우 09나 07처럼 출력되어야 하므로 다시 문자열 배열로 0삽입해서 저장
		if(salt[i]<10) {
			s[i]="0"+Integer.toString(salt[i]);
		}
		else {
			s[i]=Integer.toString(salt[i]);
		}
		}
		System.out.println(s[0]+":"+s[1]+":"+s[2]);
		sc.close();
	}
}