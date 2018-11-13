import java.util.*;
import java.lang.*;
import java.io.*;
public class SeriesJava {
   public static void main (String [] args)
   {
	   Scanner var = new Scanner(System.in);
	   
	   System.out.println("Enter the desired number ");
	   int x= var.nextInt();
	   seriesPrint(x);
	   int printsum=seriesSum(x);
	   var.close();
	   System.out.println("The sum is "+printsum);
   }
   
   static void seriesPrint (int x) {
	   System.out.println("Printing the series up to "+x );
	   for(int i=1 ;i<=x;i++)
		   System.out.print(i+" ");
	   System.out.println();
   }
   static int seriesSum(int x) {
	   int sum =0;
	   for( int i = 0;i<=x;i++)
		   sum=sum+i;
	   return sum;
   }
}
