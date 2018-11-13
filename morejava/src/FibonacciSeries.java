import java.util.*;
import java.lang.*;
import java.io.*;
public class FibonacciSeries {
public static void main(String[] args) {
	System.out.println("Enter n");
	Scanner var = new Scanner (System.in);
	

	int first =0,second =1,fibo=0;
	
	int n;
	
	n = var.nextInt();

	
	System.out.print(first+" ");
	System.out.print(second+" ");
	
	for(int i=2;i<n;i++) {
		
		fibo = first + second;
		
		System.out.print(fibo+" ");
		
		first = second;
		
		second = fibo;
		
	}
  	
	
}
}
