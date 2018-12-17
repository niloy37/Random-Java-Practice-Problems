import java.util.*;
class ArithmeticException{
	public static void main(String [] args) {
		System.out.println("Demonstration of Arithmetic Exception  / by zero");
		
		try {
				int x = 1/0;
				System.out.println(x);
		}catch(Exception E) {
			System.out.println(E);
			int x =1;
			System.out.println(x);
		}
		System.out.println("Program continues..");
	}
}
