import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    
    
    
    BigInteger m = new BigInteger(sc.next());
    BigInteger n = new BigInteger(sc.next());
    
    
    System.out.println(m.divide(n));
    System.out.println(m.remainder(n));
	}
}