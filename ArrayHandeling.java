import java.util.*;
public class ArrayHandeling {
	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		
		System.out.println("Enter the size of the array!");
		int x = var.nextInt();
		int [] array = new int [x];
		
		takeInput(array,x);
		printArray(array,x);
	}
	public static void takeInput(int [] array,int x) {
		Scanner var = new Scanner(System.in);
		for(int i=0;i<x;i++) {
			
			array[i]=var.nextInt();
		}
	}
	
	public static void printArray (int [] array ,int x) {
		
		for(int i=0;i<x;i++) {
			
			System.out.print(array[i]+" ");
		}
	}

}
//upd
