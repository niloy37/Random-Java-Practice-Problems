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
		
		List <Integer> array = new ArrayList<Integer>();
		
		array.add(1);
		array.add(2);
		array.add(3);
		System.out.println(array);
		
		array.remove(1);
		array.remove(0);
		array.add(4);
		System.out.println(array);
		System.out.println("The numbers are "+array.toString());
	}
}
