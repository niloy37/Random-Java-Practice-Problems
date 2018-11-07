package RizveeAssignment;
import java.util.*;




import java.util.*;
public class FibonacciSeries {
public static void main(String[] args) {
	System.out.println("Enter n");
	
	Scanner var = new Scanner(System.in);
	
	int x = var.nextInt();
	
	
	int fib0=0;
	int fib1=1;
	int fibo;
	
	if(x>=1)
		System.out.print(fib0+" ");
	if(x>=2)
	System.out.print(fib1+" ");
	int i=2;
	while(i<x) {
		fibo=fib0+fib1;
		System.out.print(fibo+" ");
		fib0=fib1;
		fib1=fibo;
		i++;
	}
	
}
}
