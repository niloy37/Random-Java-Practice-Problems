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
 
		try{
			int x=100/0;
			System.out.println(x);
		}catch(Exception e){System.out.println(e);}
	}
}
