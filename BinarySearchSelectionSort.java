import java.util.*;
public class BinarySearchSelectionSort {
public static void main(String[] args) {
	Scanner var = new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int x = var.nextInt();
	int [] array = new int[x];
	takeInput(array);
	selectionSort(array);
	int found=binarySearch(array);
	if(found==-1) {
		System.out.println("Not Found");
	}
	else System.out.println("Found at "+found);
	
}
public static void takeInput(int array[]) {
	Scanner var = new Scanner(System.in);
	for(int i = 0 ;i<array.length;i++) {
		array[i]=var.nextInt();
	}
	
}


public static void selectionSort(int [] array) {
	
	for(int i=0;i<array.length-1;i++) {
		int currentMin = array[i];
		int currentMinIndex = i;
		for(int j =i+1;j<array.length;j++) {
			if(array[j]>currentMin) {
				currentMin = array[j];
				currentMinIndex = j;
			}
			if(currentMinIndex != i) {
				array[currentMinIndex]=array[i];
				array[i]=currentMin;
			}
			
		}
	}
	
}
public static int binarySearch(int [] array) {
	int low =0;
	int high = array.length;
	int Index=-1;
	Scanner var = new Scanner(System.in);
	System.out.println("Enter the Key you want to search for");
	int key =var.nextInt();
	
	for(int i=0;i<array.length;i++) {
		int mid = (low + high)/2;
		if(array[mid]>key)
			low =mid+1;
		if(array[mid]<key)
			high=mid-1;
		if(array[mid]==key) {
			Index=i;
			System.out.println(key+" is found!");
			break;
		}
	}
	return Index;
	
}
}
