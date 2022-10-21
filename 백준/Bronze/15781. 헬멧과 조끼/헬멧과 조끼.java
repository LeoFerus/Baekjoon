import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int maxHead = 0;
		int maxBody = 0;

		for(int i=0; i<n; i++) {
			int head = sc.nextInt();

			if(i == 0) {
				maxHead = head;
				continue;
			}

			maxHead = maxHead > head ? maxHead : head;
		}

		for(int i=0; i<m; i++) {
			int body = sc.nextInt();

			if(i == 0) {
				maxBody = body;
				continue;
			}

			maxBody = maxBody > body ? maxBody : body;
		}

		System.out.println(maxHead + maxBody);
	}
}
