import java.util.*;
import java.lang.*;
import java.io.*;

public class HeadsTails {
public static void main(String[] args) {
	Random rand = new Random();
	int heads=0;
	int tails=0;
	int x;
	for(long i =0 ; i<100L ; i++)
	{
		x= rand.nextInt(2);
		{
			if(x==0)
				heads++;
			else if(x==1)
				tails++;
				
		}
	}
	
	ratio(heads,tails);
}



static int gcd(int p, int q) {
    if (q == 0) return p;
    else return gcd(q, p % q);
}

static void ratio(int a, int b) {
   final int gcd = gcd(a,b);
   System.out.println(a/gcd + " " + b/gcd);
}
}
