import java.util.*;
public class SumDigit {
	public static void main(String[] args) {
		System.out.println("Enter a  number");
	 Scanner var = new Scanner(System.in);
	 int x = var.nextInt();
	 int sum=0;
	 int y;
	 while(x!=0) {
		 y=x%10;
		 x=x/10;
		 sum=sum+y;
	 }
	 System.out.println("Sum is ="+sum);
	}

}
