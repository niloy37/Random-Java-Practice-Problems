import java.util.*;
import java.lang.*;
import java.io.*;

class Probleml
 { 


  public static void main (String [] args) 
{

     System.out.println("a b pow(a,b) "); 
     int a=1;
     int b=a+1;
    int c;
     for(int i=0;i<5;i++)

    { 
     c = (int)Math.pow(a,b); 
System.out.println(a+" "+b+" "+c);
a++;
b++;
}
}
}