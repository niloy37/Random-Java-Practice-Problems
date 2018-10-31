import java.util.Scanner;
public class SwapWIthoutTemp {
	public static void main(String[] args) {
		System.out.println("Enter two variables");
		Scanner var = new Scanner(System.in);
		int x = var.nextInt();
		int y= var.nextInt();
		//printing x and y
		System.out.println("x= "+x+" y="+y);
		
		//swapping
		x=x+y;
		y=x-y;
		x=x-y;
		
		//printing new values 
		System.out.println("New Values");
		System.out.println("x= "+x+" y="+y);
		
	}

}
