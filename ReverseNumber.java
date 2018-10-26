/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
	System.out.println("Enter a number");
	Scanner var = new Scanner(System.in);
	int x = var.nextInt();
	//reverse code
	int print;
	while(x!=0){
		print = x%10;
		x=x/10;
		System.out.print(print);
		
	}
	}
}