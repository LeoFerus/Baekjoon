import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Double w = sc.nextDouble();
		
		Double h = sc.nextDouble();
		
		Double BMI = w/(h*h);
		
		if(BMI>25) {
			System.out.println("Overweight");
		}
		else if(BMI<=25.0&&BMI>=18.5) {
			System.out.println("Normal weight");
		}
		else {
			System.out.println("Underweight");
		}
		
		sc.close();
		
		
	}
}