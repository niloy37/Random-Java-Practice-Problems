import java.util.*;
public class CyclicOrderChange {
	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		System.out.println("Enter Integer 1");
		int a=var.nextInt();
		System.out.println("Enter Integer 2");
		int b = var.nextInt();
		System.out.println("Enter Integer 3");
		int c = var.nextInt();
		
		System.out.println("Value of a="+a+" b="+b+" c="+c);
		int temp;
		temp = a;
		a=b;
		b=c;
		c=temp;
		System.out.println("New Value of a="+a+" b="+b+" c="+c);
		
	}

}
