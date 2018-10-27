import java.util.*;
public class BinarySearchAlgorithm {
public static void main(String[] args) {
	Scanner var = new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int x = var.nextInt();
	
	int [] array = new int [x];
	
	for (int i =0;i<x;i++) {
		
		array[i]= var.nextInt();
		
	}
	Arrays.sort(array);
	System.out.println("Enter the element you want to search for");
	int key =var.nextInt();
	boolean found = binarySearch(array,key);
	System.out.println(found);
	
}

public static boolean binarySearch(int [] array,int key) {
	
	int low=0; int high = array.length;
	while(low<=high) {
		int mid = (low+high)/2;
		if(array[mid]<key)
			low=mid+1;
		if(array[mid]>key)
			high=mid=1;
		if(array[mid]==key)
			return true;
		
		
	}
	return false;
	
}
}
