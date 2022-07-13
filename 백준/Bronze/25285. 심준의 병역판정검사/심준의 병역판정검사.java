import java.util.Scanner;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		double h = 0;
		
		double w = 0;
		
		double[] array = new double [t];
		
		for(int i =0; i<t; i++) {
			h =sc.nextInt();
			w =sc.nextInt();
			array[i] = w/Math.pow(h/100,2);
			if(0<h&&h<140.1) {
				array[i] = 6;
			}
			
			else if(140.1<=h&&h<146) {
				array[i] = 5;
			}
			
			else if(146<=h&&h<159) {
				array[i] = 4;
			}
			
			else if (159<=h&& h<161) {
				if(array[i]>=16&&array[i]<35) {
					array[i] = 3;
				}
				else {
					array[i] = 4;
				}
			}
			else if (161<=h&&h<204) {
				if(array[i]<16||array[i]>=35) {
					array[i] =4;
				}
				else if((array[i]>=16&&array[i]<18.5)||(array[i]>=30&&array[i]<35)) {
					array[i]=3;
				}
				else if ((array[i]>=18.5&&array[i]<20)||(array[i]>=25&&array[i]<30)) {
					array[i] = 2;
				}
				else {
					array[i] = 1;
				}
			}
			else {
				array[i] = 4;
			}
		}
		for(int i =0; i<t; i++) {
			System.out.println(Math.round(array[i]));
		}
		
		sc.close();
	}
}