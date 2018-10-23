import java.util.*;
public class ArraySearch {
	
	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		int [] array = new int [10];
		System.out.println("Enter 10 numbers");
		for(int i = 0;i<array.length;i++) {
			array[i]= var.nextInt();
			
			
		}
		System.out.println("Enter the element you want to search for");
		int x = var.nextInt();
		int index = arraySearch(array,x);
		if(index==-1)
			System.out.println("Element not found");
		else 
			System.out.println("Element found! , element located at "+(index+1));
	}
	public static int arraySearch(int [] array , int y) {
		int x=-1;
		for(int i=0;i<array.length;i++) {
			if(array[i]==y) {
				x=i;
			}
		}
		return x;
	}

}
