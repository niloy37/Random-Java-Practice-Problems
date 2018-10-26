//code done from ideone

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
		
		System.out.println("Enter #3 digits");
		Scanner var = new Scanner(System.in);
		int x = var.nextInt();
		int y = var.nextInt();
		int z = var.nextInt();
		
		if(x<y && x <z) System.out.println(x+" is the smallest");
		if(y<x && y<z) System.out.println(y+" is the smallest");
		if(z<x && z<y) System.out.println(z+" is the smallest");
	}
}