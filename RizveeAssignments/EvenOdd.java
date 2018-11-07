package RizveeAssignment;
import java.util.Scanner;
public class EvenOdd {
	
	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int x = var.nextInt();
		
		
		switch(x%2) {
		case 1 : System.out.println("Number is Odd");break;
		case 0 : System.out.println("Number is Even");break;
		default:System.out.println("Wrong Input , Enter integer");
		}
		
	}

}
