import java.util.*;
public class evenOdd {
	public static void main (String[] args)
	{
		Scanner var=new Scanner(System.in);
		System.out.println("Enter a Integer :");
		int x= var.nextInt();
		
	var.close();
		evenOdd(x);
	}

	static void evenOdd(int x) {
		if(x%2==0)
			System.out.println(x+" is even");
		else 
			System.out.println(x+" is odd");
	}
}
