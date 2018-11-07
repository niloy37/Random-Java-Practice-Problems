package RizveeAssignment;
import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		
		System.out.println("Enter a Number");
		Scanner var = new Scanner(System.in);
		int x=var.nextInt();
		
		for(int i=5;i<=9;i++) {
			System.out.println(x+" x "+i+" = "+(x*i));
			
		}
		
	}

}
