import java.util.*;
public class ArrayIndexOutOfBounds {

		public static void main (String [] args) {
			int i;
			System.out.println("Enter 5 numbers");
		Scanner var = new Scanner(System.in);
		int [] array = new int [5];
		try {
			 i=1;
			while(i<=5) {
				array[i]=var.nextInt();
				i++;
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("Enter the numbers again!");
			i=0;
			while(i<5) {
				array[i]=var.nextInt();
				i++;
			}
		}
		i=0;
		while(i<5) {
			System.out.print(array[i]+" ");
			i++;
		}
	}
}
