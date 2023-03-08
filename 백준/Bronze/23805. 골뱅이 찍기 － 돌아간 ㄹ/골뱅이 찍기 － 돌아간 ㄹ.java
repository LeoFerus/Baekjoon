import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1 ;i<=n; i++) {
		System.out.println("@".repeat(n*3)+" ".repeat(n)+"@".repeat(n));
		}
		for(int i = 1; i<=n*3;i++) {
			System.out.println("@".repeat(n)+" ".repeat(n)+"@".repeat(n)+" ".repeat(n)+"@".repeat(n));
		}
		for(int i = 1 ;i<=n; i++) {
			System.out.println("@".repeat(n)+" ".repeat(n)+"@".repeat(n*3));
			}

	}
}