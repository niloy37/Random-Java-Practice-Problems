package morejava;
import java.util.*;
import java.lang.*;
import java.io.*;

public class methodoverloading {

	public static void main(String[] args) throws java.lang.Exception {
		// TODO Auto-generated method stub
                        //demonstrating method overloading
		
		//same method signature int
		addition(2,2);
		//same method signature double
		addition(4.5,7.7);
	}
	
	public static void addition(int a,int b) {
		System.out.println(a+b);
	}
	public static void addition(double a, double b) {
		System.out.println(a+b);
	}

}
