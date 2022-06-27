import java.util.*; 

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		String str=scan.nextLine();
		
		str = str.trim();
		
		if(str=="") {
			
			System.out.println(0);
		}
		
		else {
		
		String[] array = str.split(" ");
		System.out.println(array.length);
		}
		scan.close();
	}

}
