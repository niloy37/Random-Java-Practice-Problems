import java.util.*;
public class ArraySort {
	
	public static void main(String[] args) {
		System.out.println("Enter Array elements(10)");
		Scanner var = new Scanner(System.in);
		
		int[] array = new int[10];
		
		for(int i = 0;i<array.length;i++) {
			array[i]= var.nextInt();
			
		}
		//arraysort function
		Arrays.sort(array);
		System.out.println();
		System.out.println("Printing sorted array");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+ ",");
		}
		
	}

}
