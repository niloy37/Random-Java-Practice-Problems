import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		System.out.println("Enter Three Numbers :");
		double x = var.nextDouble();
		double y = var.nextDouble();
		double z = var.nextDouble();
		
		System.out.println("The three numbers are : "+x+", "+y+","+z);
		double average = (x+y+z) / 3.0;
		System.out.println("The average of the three numbers is :"+average);
		}
}
