import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int n = sc.nextInt(); //수학여행에 참가하는 학생 수를 나타내는 정수 N
		
		int k = sc.nextInt(); //한 방에 배정할 수 있는 최대 인원 수 K
		
		int [] boys = new int [7]; //남학생의 학년별 인원을 알아보기 위한 배열 boys. 인덱스는 학년을 나타낸다.
		
		int [] girls = new int [7];//여학생의 학년별 인원을 알아보기 위한 배열 girls. 인덱스는 학년을 나타낸다.
		
		int roomCount = 0;			//필요한 방의 숫자를 나타내는 변수 roomCount
		
		for(int i = 0; i<n ; i++) {
			int sex = sc.nextInt(); //성별을 나타내는 변수 sex, 1은 남학생 ,0 은 여학생을 의미한다.
			
			int year = sc.nextInt(); // 학년을 나타내는 변수 year
			
			if(sex==1) {		
				boys[year]= boys[year]+1;	// 남학생이면 boys의 해당 학년의 인덱스에 사람수를 추가 
			}
			else {
				girls[year] = girls[year]+1;// 여학생이면 girls의 해당 학년의 인덱스에 사람수를 추가 
			}
		}
		
		for(int i = 1; i<7;i++) {
			if(boys[i]%k==0) {
				roomCount = boys[i]/k +roomCount; 
			}
			else {
				roomCount = boys[i]/k+1 +roomCount;	//방의 최대 수용인원 k로 나누어떨어지지 않을 경우 나머지 사람들을 위해 방을 하나 더 추가한다.
			}
			
			if(girls[i]%k==0) {
				roomCount = girls[i]/k+roomCount;
			}
			else {
				roomCount = girls[i]/k+1+roomCount;	//방의 최대 수용인원 k로 나누어떨어지지 않을 경우 나머지 사람들을 위해 방을 하나 더 추가한다.
			}
		}
		
		System.out.println(roomCount);
		
		sc.close();
	}
 
}
