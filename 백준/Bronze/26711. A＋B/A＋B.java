import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args)throws IOException{
	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger A = new BigInteger(br.readLine());
        BigInteger B = new BigInteger(br.readLine());
        System.out.println(A.add(B));
		

	}
}
