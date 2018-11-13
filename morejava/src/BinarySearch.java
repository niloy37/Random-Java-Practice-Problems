import java.util.*;
public class BinarySearch {
	
	public static void main(String[] args) {
		System.out.println("Enter Array elements(10)");
		Scanner var = new Scanner(System.in);
		
		int[] array = new int[10];
		
		for(int i = 0;i<array.length;i++) {
			array[i]= var.nextInt();
			
		}
		//arraysort function
		Arrays.sort(array);
		System.out.println("Enter the element you want to search for");
		int x = var.nextInt();
		int resultIndex= BinarySearch(array,x);
		System.out.println("Found at "+(resultIndex+1));
		
		}
	
	
	public static int BinarySearch(int[] array,int x) {
		int low=0 ; int high=9;
		int Index = Integer.MAX_VALUE;
		while (low<=high) {
			int mid = (low+high)/2;
			if(array[mid]<x)
				low=mid+1;
			else if(array[mid]>x)
				high=mid-1;
			else if (array[mid]==x) {
				Index=mid;
				break;
			}
			
		}
		return Index;
		
		
	}

}
