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
		Scanner var = new Scanner(System.in);
		int n = var.nextInt();
		
int binary=0;
int max =0;
int count=0;
        while(n>0){
         binary = binary*10+n%2;
         if(n%2==1){
         count++;
         if(count>max)
         max=count;
         } 
         else count=0;
         n=n/2;
         
        }
        int rev=0;
        while(binary>0){
        	rev = rev*10 +binary%10;
        	binary = binary/10;
        }
        System.out.println(rev);
        System.out.println(max);

	}
}
