import java.util.Scanner;
import java.lang.*;
public class Solution153 {
	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		System.out.println("Input First Number");
		double x= var.nextDouble();
		System.out.println("Input Second Number");
		double y = var.nextDouble();
		
	if((x>=0 && x<=1) && (y>=0 && y<=1))
		System.out.println("True");
	else System.out.println("False");
		
	}
}