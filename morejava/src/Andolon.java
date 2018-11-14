import java.util.Scanner;
public class Andolon {
	public static void main (String[] args)
	{   System.out.println("Enter the number of Rows");
	
	Scanner var= new Scanner(System.in);
	
	int x= var.nextInt();
	
	for(int i=1;i<=x;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	}

}
