package RizveeAssignment;
import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	System.out.println("Enter a number");
	Scanner var = new Scanner(System.in);
	int x= var.nextInt();
	
	
	boolean prime =true;
	
	for(int i=2;i<x;i++) {
		if(x%i==0) {
			prime=false;
			break;
			
		}
	}
	System.out.println(prime);
}
}
