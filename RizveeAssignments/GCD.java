package RizveeAssignment;
import java.util.Scanner;

public class GCD {
	
	
	
public static void main(String[] args) {
	Scanner var = new Scanner(System.in);
	System.out.println("Enter a nd b");
	int a =var.nextInt();
	int b = var.nextInt();
	
	System.out.println(gcd(a,b));
	
}
	
	
	//euclids Algorithm
	public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

}
